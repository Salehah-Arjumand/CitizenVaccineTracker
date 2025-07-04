import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {

	static ArrayList<Citizen> citizens = new ArrayList<Citizen>();

//	Adding a new citizen to the list
	public static void addCitizen() {

		ArrayList<Vaccination> d = new ArrayList<Vaccination>();

		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		System.out.println("");

		System.out.println("*******************************************");
		System.out.println("Add new citizen");
		System.out.println("*******************************************");

		System.out.println("");

		System.out.print("Enter citizen's civil ID number: ");
		int id = sc.nextInt();

		for (int i = 0; i < citizens.size(); i++) {
			if (citizens.get(i).getID() == id) {
				System.out.println("Same citizen can not be added twice!");
				System.out.println("");
				Testing.menu();
			}
		}

		System.out.print("Enter citizen's name: ");
		String name = s.nextLine();

		System.out.print("Enter citizen's gender (Male or Female): ");
		String gender = s.nextLine();

		if (!(gender.equals("Male") || gender.equals("Female"))) {
			System.out.println("Invalid gender!");
			System.out.println("");
			Testing.menu();
		}

		System.out.print("Enter citizen's age: ");
		int age = sc.nextInt();

		if (age > 150) {
			System.out.println("Invalid gender!");
			System.out.println("");
			Testing.menu();
		}

		citizens.add(new Citizen(id, name, gender, age, d));

		System.out.println("Citizen with civil ID number " + id + " has been added to the citizens list!");

		System.out.println("");
		Testing.menu();
	}

//	Adding a new dose to a specified citizen
	public static void addDose() {

		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		System.out.println("");

		System.out.println("*******************************************");
		System.out.println("Add dose");
		System.out.println("*******************************************");

		System.out.println("");

		System.out.print("Enter civil ID number of the citizen for which you want to add dose: ");

		int id = sc.nextInt();

		Citizen c = null;

		boolean check = false;
		boolean check_len = false;

		for (int i = 0; i < citizens.size(); i++) {
			if (citizens.get(i).getID() == id) {
				c = citizens.get(i);
				check = true;
			}
		}
		
		if(c.getDoses().size()>=3) {
			check_len = true;
		}

		if (check && check_len) {
			System.out.print("Enter name of the vaccination: ");
			String name = s.nextLine();

			System.out.print("Enter name of the vaccination's manufacturer: ");
			String m_name = s.nextLine();

			System.out.print("Enter location: ");
			String loc = s.nextLine();

			System.out.print("Enter health professional's civil ID number: ");
			int d_id = sc.nextInt();

			System.out.print("Enter health professional's name: ");
			String d_name = s.nextLine();

			System.out.print("Enter health professional's experience: ");
			int ex = sc.nextInt();

			HealthProfessional doc = new HealthProfessional(d_id, d_name, ex);

			Vaccination d = new Vaccination(name, m_name, LocalDate.now(), loc, doc);

			c.getDoses().add(d);

			System.out.println("Citizen with civil ID number " + id + " got vaccinated!");

			System.out.println("");
			Testing.menu();

		} else if(!check) {
			System.out.println("This citizen is not registered!");
			System.out.println("");
			Testing.menu();
		}
		else if(!check_len) {
			System.out.println("A citizen can not have more than 3 doses of vaccination!");
			System.out.println("");
			Testing.menu();
		}

	}

//	Retrieving number of fully vaccinated persons (who toke at least 2 doses)
	public static int countFullyVaccinated() {

		System.out.println("");

		System.out.println("*******************************************");
		System.out.println("Count fully vaccinated citizens");
		System.out.println("*******************************************");

		System.out.println("");

		int count = 0;
		for (int i = 0; i < citizens.size(); i++) {
			if (citizens.get(i).getDoses().size() >= 2) {
				count++;
			}
		}
		System.out.println("Count of fully vaccinated citizens: " + count);
		System.out.println("");
		return count;
	}

//	Saving all the data into a text file after sorting them according to Civil ID.
	public static void WriteData() {

		System.out.println("");

		System.out.println("*******************************************");
		System.out.println("Write data to text file");
		System.out.println("*******************************************");

		System.out.println("");
		
		Collections.sort(citizens);
		
		try {
			String filename = "citizens.txt";
			FileWriter fw = new FileWriter(filename, true);
			
			for(int i = 0; i<citizens.size(); i++) {
				fw.write("Citizen Civil ID Number: " + citizens.get(i).getID() + "\n");
				fw.write("Citizen Name: " + citizens.get(i).getName() + "\n");
				fw.write("Citizen Gender: " + citizens.get(i).getGender() + "\n");
				fw.write("Citizen Age: " + citizens.get(i).getAge() + "\n");
				fw.write("Dosage Details: " + "\n");
				
				if(citizens.get(i).getDoses().size()==0) {
					fw.write("\t No dosage details available!");
				}
				else {
					for(int j = 0; j<citizens.get(i).getDoses().size(); j++) {
						fw.write("\t Vaccination Name: " + citizens.get(i).getDoses().get(j).getName() + "\n");
						fw.write("\t Manufacturer Name: " + citizens.get(i).getDoses().get(j).getManufacturer() + "\n");
						fw.write("\t Date: " + citizens.get(i).getDoses().get(j).getDate() + "\n");
						fw.write("\t Location: " + citizens.get(i).getDoses().get(j).getLocation() + "\n");
						fw.write("\t Health Professional Details: " + "\n");
						fw.write("\t\t Health Professional Civil ID Number: " + citizens.get(i).getDoses().get(j).getDoctor().getID() + "\n");
						fw.write("\t\t Health Professional Name: " + citizens.get(i).getDoses().get(j).getDoctor().getName() + "\n");
						fw.write("\t\t Health Professional Experience: " + citizens.get(i).getDoses().get(j).getDoctor().getExperience() + "\n");
						
					}
				}
			
			}
			
			
			fw.close();

			
			System.out.println("Citizens details have been successfully added to citizens.txt!");
			System.out.println("");
			

		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}

	}

}

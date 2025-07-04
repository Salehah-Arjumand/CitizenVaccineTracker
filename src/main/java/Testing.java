import java.util.Scanner;

public class Testing {
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		boolean check = true;

		while (check) {
			System.out.println("*******************************************");
			System.out.println("Main Menu");
			System.out.println("*******************************************");

			System.out.println("");

			System.out.println("1. Add new citizen");
			System.out.println("2. Add new dose to a citizen");
			System.out.println("3. Get count of fully vaccinated citizens");
			System.out.println("4. Save data to text file");
			System.out.println("5. Quit");

			System.out.print("Choose your option: ");

			int choice = sc.nextInt();

			if (choice == 1) {
				Storage.addCitizen();
			} else if (choice == 2) {
				Storage.addDose();
			} else if (choice == 3) {
				Storage.countFullyVaccinated();
			} else if (choice == 4) {
				Storage.WriteData();
				check = false;
			} else if (choice == 5) {
				if(Storage.citizens.size()<7) {
					System.out.println("");
					System.out.println("You need to add atleast 7 citizens!");
					System.out.println("");
				}
				else {
					System.out.println("The program has successfully ended!");
					check = false;
				}
				
			} else {
				System.out.println("Invalid input!");
			}

		}

	}
	public static void main(String[] args) {

		menu();
	}

}

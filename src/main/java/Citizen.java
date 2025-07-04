import java.time.LocalDate;
import java.util.ArrayList;

public class Citizen extends Person implements Comparable<Citizen>{
	
	String gender;
	int age;
	ArrayList<Vaccination> doses;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<Vaccination> getDoses() {
		return doses;
	}
	public void setDoses(ArrayList<Vaccination> doses) {
		this.doses = doses;
	}
	public Citizen(int iD, String name, String gender, int age, ArrayList<Vaccination> doses) {
		super(iD, name);
		this.gender = gender;
		this.age = age;
		this.doses = doses;
	}
	@Override
	public String toString() {
		return "Citizen [gender=" + gender + ", age=" + age + ", doses=" + doses + "]";
	}
	
	public int compareTo(Citizen c)
    {
        int compare_ID
            = ((Citizen)c).getID();
  
        return this.getID() - c.getID();
    }
	
}

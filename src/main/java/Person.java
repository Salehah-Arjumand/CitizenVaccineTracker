
public class Person {
	int ID;
	String Name;
	
	public Person(int iD, String name) {
		super();
		ID = iD;
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Person [ID=" + ID + ", Name=" + Name + "]";
	}
	
}

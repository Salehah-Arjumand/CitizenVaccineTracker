
public class Person {
	int ID;
	String Name;
	
	public Person(int id, String name) {
		super();
		ID = id;
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
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


public class HealthProfessional extends Person{
	
	int experience;

	public HealthProfessional(int iD, String name, int experience) {
		super(iD, name);
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "HealthProfessional [experience=" + experience + "]";
	}
	
	
	
	
}

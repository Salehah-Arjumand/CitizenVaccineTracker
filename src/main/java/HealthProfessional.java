
public class HealthProfessional extends Person{
	
	int experience;

	public HealthProfessional(int id, String name, int experience) {
		super(id, name);
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

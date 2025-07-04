import java.time.LocalDate;

public class Vaccination {
	
	String name;
	String manufacturer;
	LocalDate date;
	String location;
	HealthProfessional doctor;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public HealthProfessional getDoctor() {
		return doctor;
	}
	public void setDoctor(HealthProfessional doctor) {
		this.doctor = doctor;
	}
	public Vaccination(String name, String manufacturer, LocalDate date, String location, HealthProfessional doctor) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.date = date;
		this.location = location;
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Vaccination [name=" + name + ", manufacturer=" + manufacturer + ", date=" + date + ", location="
				+ location + ", doctor=" + doctor + "]";
	}
	
	
	
}

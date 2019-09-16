package datasmap.models;

public class Csite{
	private String name;
	private String description;
	private Cplace place;

	public Csite(String name, String description, Cplace place) {
		this.name = name;
		this.description = description;
		this.place = place;
	}
	
	public Csite(String name, String description, String address) {
		this(name, description, Capplication.instance.getPlaceByAdress(address));
	}
	
	public Csite(String name, String description, double latitude, double longitude) {
		this(name, description, Capplication.instance.getPlaceByGps(latitude, longitude));
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public Cplace getPlace() {return place;}
	public void setPlace(Cplace place) {this.place = place;}
	
	
}

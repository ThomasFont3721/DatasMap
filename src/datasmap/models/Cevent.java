package datasmap.models;

import java.time.LocalDate;

public class Cevent {
	private String name;
	private String description;
	private LocalDate date;
	private String groupes;
	private Ctype types;
	
	public Cevent(String name, String description, LocalDate date, String groupes) {
		super();
		this.name = name;
		this.description = description;
		this.date = LocalDate.now();
		this.groupes = groupes;
	}
	
	public String getGroupes() {return groupes;}
	public void setGroupes(String groupes) {this.groupes = groupes;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public LocalDate getDate() {return date;}
	public Ctype getTypes() {return types;}
	public void setTypes(Ctype types) {this.types = types;}
	
	
}

package datasmap.models;

import java.util.ArrayList;
import java.util.List;

public class Cplace {
	private String address;
	private Double latitude;
	private Double longitude;
	private List<Csite> sites;
	private Cplace parent;
	

	public Cplace(String adress, Double latitude, Double longitude) {
		this(adress, latitude, longitude, null);
	}
	
	public Cplace(String adress, Double latitude, Double longitude, Cplace parent) {
		super();
		this.address = adress;
		this.latitude = longitude;
		this.longitude = longitude;
		this.parent =parent;
		this.sites =new ArrayList<Csite>();
	}

	public String getAdress() {
		Cplace place =this;
		String adresse =this.address;
		while(place.parent != null) {
			place =place.parent;
			adresse += ", "+ place.address;
		}
		return adresse;
	}
	
	public String getAdress(int niveau) {
		Cplace place =this;
		String adresse =this.address;
		for (int i = 0; i < niveau; i++) {
			if (place.parent != null) {
				place =place.parent;
				adresse += ", "+ place.address;
			}
			else {
				break;
			}
		}
		return adresse;
	}

	public void setAddress(String address) {this.address = address;}
	public List<Csite> getSites() {return sites;}
	public Cplace getParent() {return parent;}
	public Double getLatitude() {return latitude;}
	public void setLatitude(Double latitude) {this.latitude = latitude;}
	public Double getLongitude() {return longitude;}
	public void setLongitude(Double longitude) {this.longitude = longitude;}
	
	
}

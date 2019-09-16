package datasmap.models;

import java.util.ArrayList;
import java.util.List;

public class Capplication {
	public static Capplication instance;
	private List<Cplace> places;
	
	public Capplication() {
		super();
		this.places = new ArrayList<Cplace>();
	}
	
	public Cplace getPlaceByAdress(String address) {
		for (Cplace place : instance.places) {
			if (place.getAdress().equals(address)) {
				return place;
			}
		}
		return null;
	}
	
	public Cplace getPlaceByGps(double latitude, double longitude) {
		for (Cplace place : instance.places) {
			if (place.getLatitude() == latitude && place.getLongitude() == longitude) {
				return place;
			}
		}
		return null;
	}

	public static Capplication loadDeafaultPlaces() {
		instance =new Capplication();
		Cplace place0 =new Cplace("France", 0.001, -0.0031);
		Cplace place1 =new Cplace("Caen", 0.0011, -0.0032, place0);
		Cplace place2 =new Cplace("Place Wurzburg", 0.00111, -0.0033, place1);
		Cplace place3 =new Cplace("1", 0.0011, -0.0030, place2);

		instance.places.add(place0);
		instance.places.add(place1);
		instance.places.add(place2);
		instance.places.add(place3);
		instance.places.add(new Cplace("59 Avenue de Tourville", 49.1846, -0.34772799999996096));
		instance.places.add(new Cplace("9 Rue de Geôle", 49.1845, -0.36199599999997645));
		
		return instance;
	}
}

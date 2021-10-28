package sp2;

import java.util.ArrayList;

public class Garage {

	// vars
	private String name;
	private ArrayList<Bil> cars;
	
	
	// constructor
	public Garage(String name) {
		this.name = name;
		cars = new ArrayList<Bil>();
	}
	
	
	// methods
	public void addBil(Bil nyBil) {
		this.cars.add(nyBil);
	}

	public double beregnGrønAfgiftForBilpark() {
		
		double tmp = 0;
		
		for (Bil car: cars) {
			tmp += car.beregnGrønEjerAfgift();
		}
		return tmp;
	}
	
	@Override
	public String toString() {
		String tmp = "";
		
		tmp += "Garage navn: " + getName() + "\n\nBiler:\n\n";
		
		for(Bil car : cars) {
			tmp += car.toString() + "\n";
		}
		tmp += "\nSlut";
		return tmp;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Bil> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Bil> cars) {
		this.cars = cars;
	}
	
}

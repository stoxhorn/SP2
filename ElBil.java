package sp2;

public class ElBil extends Bil{
	
	// Variables
	private int batteriKapacitetKWh;
	private int maxKm;
	private int whPrKm;
	
	// constructor
	public ElBil(int regNr, String mærke, String model, int årgang, int antalDøre, int batteriKapacitetKWh, int maxKm, int whPrKm) {
		super(regNr, mærke, model, årgang, antalDøre);
		this.batteriKapacitetKWh = batteriKapacitetKWh;
		this.maxKm = maxKm;
		this.whPrKm = whPrKm;
	}

	
	// methods
	public double beregnGrønEjerAfgift() {
		
		double kmPrL = 100/(this.whPrKm / 91.25);
		
		double result = 0;
		
		if(kmPrL < 5) {
			return result = 10470;
		}
		
		else if(kmPrL < 10) {
			return result = 5500;
		}
		
		else if(kmPrL < 15) {
			return result = 2340;
		}
		
		else if(kmPrL < 20) {
			return result = 1050;
		}
		
		else if(kmPrL < 50) {
			return result = 330;
		}
		else {
			return result = -1;
		}
	}
	

	
	
	@Override 
	public String toString() {
		String tmp = "";
		
		tmp += "Reg. Nr.: " + super.getRegNr() + "\n";
		tmp += "mærke: " + super.getMærke();
		tmp += " model: " + super.getModel();
		tmp += " årgang: " + super.getÅrgang();
		tmp += "antal døre: " + super.getAntalDøre() + "\n";
		tmp += "Batteri kapacitet i KWh: " + this.batteriKapacitetKWh + "\n";
		tmp += "Max distance i KM: " + this.maxKm + "\n";
		tmp += "Whatt per KM: " + this.whPrKm;
		
		
		return tmp;
	}
	
	// getters and setters
	public int getBatteriKapacitetKWh() {
		return batteriKapacitetKWh;
	}
	public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
		this.batteriKapacitetKWh = batteriKapacitetKWh;
	}
	public int getMaxKm() {
		return maxKm;
	}
	public void setMaxKm(int maxKm) {
		this.maxKm = maxKm;
	}
	public int getWhPrKm() {
		return whPrKm;
	}
	public void setWhPrKm(int whPrKm) {
		this.whPrKm = whPrKm;
	}
}

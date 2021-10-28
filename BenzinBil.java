package sp2;

public class BenzinBil extends Bil{
	
	// vars
	private int oktanTal;
	private int kmPrL;
	
	// constructor
	public BenzinBil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktanTal, int kmPrL) {
		super(regNr, mærke, model, årgang, antalDøre);
		this.oktanTal = oktanTal;
		this.kmPrL = kmPrL;
	}


	// methods
	public double beregnGrønEjerAfgift() {
		
		double result = 0;
		
		if(this.kmPrL < 5) {
			return result = 10470;
		}
		
		else if(this.kmPrL < 10) {
			return result = 5500;
		}
		
		else if(this.kmPrL < 15) {
			return result = 2340;
		}
		
		else if(this.kmPrL < 20) {
			return result = 1050;
		}
		
		else if(this.kmPrL < 50) {
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
		tmp += "Oktantal: " + this.oktanTal + "\n";
		tmp += "Km Per Liter: " + this.kmPrL + "\n";
		
		return tmp;
	}

	// getters and setters
	public int getOktanTal() {
		return oktanTal;
	}
	public void setOktanTal(int oktanTal) {
		this.oktanTal = oktanTal;
	}
	public int getKmPrL() {
		return kmPrL;
	}
	public void setKmPrL(int kmPrL) {
		this.kmPrL = kmPrL;
	}
	
}

package sp2;

public class DieselBil extends Bil{
	
	
	// vars
	private boolean harPartikelfilter;
	private int kmPrL;
	
	// constructor
	public DieselBil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, int kmPrL) {
		super(regNr, mærke, model, årgang, antalDøre);
		this.harPartikelfilter = harPartikelfilter;
		this.kmPrL = kmPrL;
	}
	
	// methods
	public double beregnGrønEjerAfgift() {
		/*
		 For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift, som også 
		afhængig af kmPrL. Hvis den er mellem 20 og 50 er udligningsafgiften 130kr, mellem 15 og 20 er 
		den 1390 kr, mellem 10 og 15 er den 1850kr, mellem 5 og 10 er den 2770kr, og under 5 er den 
		15260kr. Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har partikelfilter 
		monteret. 
		 */
		
		double result = 0;
		
		double filterAfgift = 0;
		if(!this.harPartikelfilter) {
			filterAfgift = 1000;
		}
		
		if(this.kmPrL < 5) {
			return result = 10470 + 15260 + filterAfgift;
		}
		
		else if(this.kmPrL < 10) {
			return result = 5500 + 2770 + filterAfgift;
		}
		
		else if(this.kmPrL < 15) {
			return result = 2340 + 1850 + filterAfgift;
		}
		
		else if(this.kmPrL < 20) {
			return result = 1050 + 1390 + filterAfgift;
		}
		
		else if(this.kmPrL < 50) {
			return result = 330 + 130 + filterAfgift;
		}
		else {
			return result = -1;
		}
	}

	
	@Override 
	public String toString() {
		String tmp = "";
		String tmp1 = "Nej";
		if(this.harPartikelfilter) {
			tmp1 = "Ja";
		}
		
		tmp += "Reg. Nr.: " + super.getRegNr() + "\n";
		tmp += "mærke: " + super.getMærke();
		tmp += " model: " + super.getModel();
		tmp += " årgang: " + super.getÅrgang();
		tmp += "antal døre: " + super.getAntalDøre() + "\n";
		tmp += "Har et partikelfilter: " + tmp1 + "\n";
		tmp += "Km Per Liter: " + this.kmPrL + "\n";
		
		return tmp;
	}
	
	// getters and setters
	public boolean isHarPartikelfilter() {
		return harPartikelfilter;
	}
	public void setHarPartikelfilter(boolean harPartikelfilter) {
		this.harPartikelfilter = harPartikelfilter;
	}
	public int getKmPrL() {
		return kmPrL;
	}
	public void setKmPrL(int kmPrL) {
		this.kmPrL = kmPrL;
	}
	
}

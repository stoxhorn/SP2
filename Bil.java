package sp2;

public abstract class Bil {
	
	// vars
	private int regNr;
	private String mærke;
	private String model;
	private int årgang;
	private int antalDøre;
	
	// constructor
	public Bil(int regNr, String mærke, String model, int årgang, int antalDøre) {
		super();
		this.regNr = regNr;
		this.mærke = mærke;
		this.model = model;
		this.årgang = årgang;
		this.antalDøre = antalDøre;
	}
	
	// standard methods
	public abstract double beregnGrønEjerAfgift();
	
	
	// getters and setters
	public int getRegNr() {
		return regNr;
	}
	
	public void setRegNr(int regNr) {
		this.regNr = regNr;
	}
	
	public String getMærke() {
		return mærke;
	}
	
	public void setMærke(String mærke) {
		this.mærke = mærke;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getÅrgang() {
		return årgang;
	}
	
	public void setÅrgang(int årgang) {
		this.årgang = årgang;
	}
	
	public int getAntalDøre() {
		return antalDøre;
	}
	
	public void setAntalDøre(int antalDøre) {
		this.antalDøre = antalDøre;
	}
	
	
	
}

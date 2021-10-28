package sp2;

public class Main {

	public static void main(String[] args) {
		Garage bilPark = new Garage("parken");
		
		BenzinBil benz = new BenzinBil(123, "toyota", "yaris", 1996, 5, 100, 35);
		DieselBil dies = new DieselBil(123, "toyota", "yaris", 1996, 5, false, 35);
		ElBil ellert = new ElBil(123, "toyota", "yaris", 1996, 5, 100, 35, 40);
		
		bilPark.addBil(benz);
		bilPark.addBil(dies);
		bilPark.addBil(ellert);

		System.out.println(bilPark);
		System.out.println(bilPark.beregnGrønAfgiftForBilpark());
	

	}
	
}

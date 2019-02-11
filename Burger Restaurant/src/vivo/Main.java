package vivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburger h = new Hamburger("Sweetie", 25, "normalBread", "basicMeat");
		h.setCustomIngredient1("bacon", 3);
		h.setCustomIngredient2("onionRings", 2.5);
		h.setCustomIngredient3("hotPepper", 1.5);
		h.setCustomIngredient4("extraCheese", 3.5);
		h.printInfo();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		DeluxeBurger db = new DeluxeBurger("RoyalDeluxe", 25);
		db.setCustomIngredient1("bacon",3);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		db.printInfo();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		HealthyBurger hb = new HealthyBurger("VeggieBurger", 21);
		hb.setCustomIngredient1("pepperoni", 10);
		hb.setCustomIngredient5("caesarSalad", 8);
		hb.setCustomIngredient6("tomatoSlice", 8);


		hb.printInfo();
		
		
		
		
		
	}

}

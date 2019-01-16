package vivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburger hb = new Hamburger("Sweetie", 25, "normalBread", "basicMeat");
		hb.setCustomIngredient1("bacon", 3);
		hb.setCustomIngredient2("onionRings", 2.5);
		hb.setCustomIngredient3("hotPepper", 1.5);
		hb.setCustomIngredient4("extraCheese", 3.5);
		
		
		DeluxeBurger hhb = new DeluxeBurger("Sweetie", 25);
		hhb.setCustomIngredient1("bacon",3);
		
		
		
	}

}

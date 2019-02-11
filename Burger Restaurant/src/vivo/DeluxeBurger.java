package vivo;

public class DeluxeBurger extends Hamburger{
	public DeluxeBurger(String name,double price) {
		super(name, price, "deluxeBread", "deluxeMeat");
		super.setCustomIngredient1("beverage", 0.0);
		super.setCustomIngredient2("fries", 0.0);
	}
	
	
	@Override
	public void setCustomIngredient1(String ci1,double ci1p) {
		System.out.println("NU SE POATE!");
	}
	@Override
	public void setCustomIngredient2(String cu2,double cu2p) {
		System.out.println("NU SE POATE!");
	}
	@Override
	public void setCustomIngredient3(String cu3,double cu3p) {
		System.out.println("NU SE POATE!");
	}
	@Override
	public void setCustomIngredient4(String cu4,double cu4p) {
		System.out.println("NU SE POATE!");
	}
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("TOTAL Ingrediente Deluxe: "+super.getPriceTotal()+" RON");
		
	}
	
}
package vivo;

public class HealthyBurger extends Hamburger {

	private String customIngredient5;
	private double customIngredient5price;
	private String customIngredient6;
	private double customIngredient6price;
	private double healthyBurgerPrice;

	public String getCustomIngredient5() {
		return customIngredient5;
	}

	public void setCustomIngredient5(String customIngredient5, double customIngredient5price) {
		this.customIngredient5 = customIngredient5;
		this.customIngredient5price = customIngredient5price;
	}

	public String getCustomIngredient6() {
		return customIngredient6;
	}

	public void setCustomIngredient6(String customIngredient6, double customIngredient6price) {
		this.customIngredient6 = customIngredient6;
		this.customIngredient6price = customIngredient6price;
	}

	public HealthyBurger(String name, double price) {
		super(name, price, "secara", "healthyMeat");
	}

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		if(this.customIngredient5 != null)
		System.out.println("Adauga " + customIngredient5 + " la pretul de " + customIngredient5price+" RON");
		if(this.customIngredient6 != null)
		System.out.println("Adauga " + customIngredient6 + " la pretul de " + customIngredient6price+" RON");
		System.out.println("TOTAL Ingrediente Healthy: "+(super.getPriceTotal()+ customIngredient5price + customIngredient6price)+" RON");

	}

}
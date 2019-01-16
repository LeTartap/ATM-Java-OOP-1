package vivo;

class Hamburger {
	
	Hamburger(String name, double basePrice, String breadType, String meatType){
		this.breadType = breadType;
		this.meatType = meatType;
		this.basePrice = basePrice;
		this.name = name;
	}
	private String name;
	private double basePrice;
	private String breadType;
	private String meatType;
	private String customIngredient1;
	private double customIngredient1price;
	private String customIngredient2;
	private double customIngredient2price;
	private String customIngredient3;
	private double customIngredient3price;
	private String customIngredient4;
	private double customIngredient4price;
	
	void printInfo() {
		double sum = getPriceTotal();
		System.out.println(name +"- hamburger cu " + breadType +" și "+ meatType +" la pretul: " + sum +" RON ");
		System.out.println("Adauga " + customIngredient1 + " la pretul de "+ customIngredient1price );
		System.out.println("Adauga " + customIngredient2 + " la pretul de "+ customIngredient2price );
		System.out.println("Adauga " + customIngredient3 + " la pretul de "+ customIngredient3price );
		System.out.println("Adauga " + customIngredient4 + " la pretul de "+ customIngredient4price );
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCustomIngredient1(String customIngredient1, double customIngredient1price) {
		this.customIngredient1 = customIngredient1;
		this.customIngredient1price = customIngredient1price;
	}
	public void setCustomIngredient2(String customIngredient2, double customIngredient2price) {
		this.customIngredient2 = customIngredient2;
		this.customIngredient2price = customIngredient2price;
	}
	public void setCustomIngredient3(String customIngredient3, double customIngredient3price) {
		this.customIngredient3 = customIngredient3;
		this.customIngredient3price = customIngredient3price;
	}
	public void setCustomIngredient4(String customIngredient4, double customIngredient4price) {
		this.customIngredient4 = customIngredient4;
		this.customIngredient4price = customIngredient4price;
	}
	
	protected double getPriceTotal() {
		return basePrice + customIngredient1price + customIngredient2price + customIngredient3price + customIngredient4price;
	}

	
	
	
	

}

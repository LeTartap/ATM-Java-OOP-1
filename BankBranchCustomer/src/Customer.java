import java.util.ArrayList;

public class Customer {
	private String name;
	public Customer(String name, double sum) {
		transactionList.add(sum);
		this.name=name;
	}
	
	void addTransaction(double sum) {
		transactionList.add(sum);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	ArrayList<Double> transactionList = new ArrayList<Double>();
}

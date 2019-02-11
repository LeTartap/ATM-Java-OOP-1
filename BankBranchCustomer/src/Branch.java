import java.util.ArrayList;

public class Branch {
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	String branchName;


	public Branch(String branchName) {
		this.branchName= branchName;	
	}
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	boolean addCustomer(String customerName, double sum) {
		for (Customer customer:customerList) {
			if (customer.getName().equals(customerName)) {
				return false;
			}
		}
		Customer cus = new Customer(customerName, sum);
		customerList.add(cus);
		return true;
	}
	boolean addTransactionToCustomer(String customerName, double sum) {
		for (int i=0; i<customerList.size();i++)
		{
			if (customerList.get(i).getName().equals(customerName))
			{
				customerList.get(i).transactionList.add(sum);
				return true;
			}
		}
		return false;
	}
}	

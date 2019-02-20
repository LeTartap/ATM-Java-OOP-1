import java.util.ArrayList;
import java.util.List;

public class Bank {
	String bankName;

	public Bank(String bankName) {
		this.bankName = bankName;
	}

	ArrayList<Branch> branches = new ArrayList<Branch>();

	boolean createBranch(String branchName) {
		Branch br = new Branch(branchName);
		branches.add(br);
		return true;
	}

	boolean addCustomerToBranch( String brName,String cus,double sum) {
		return findBranch(brName).addCustomer(cus, sum);

	}

//	void addTransactionToCustomerInBranch(Customer cus, Branch br, double sum) {
//		for (Customer cust : br.customerList) {
//			if (cust.getName() == cus.getName()) {
//				cust.addTransaction(sum);
//				return true;
//			}
//		}
//	}
	boolean callAddTransctionToCustomerInBranch(String brName, String custName, double sum) {
		Branch br = findBranch(brName);
		if (findBranch(brName)!=null) {
			return br.addTransactionToCustomer(custName, sum);
		}
		return false;
	}
	private Branch findBranch (String branchName) {
		for(Branch br:branches)
		{
			if (br.getBranchName().equals(branchName)) {
				return br;
			}
		}
		return null;
	}

	void callPrintCustomerListByName(String brName)
	{
		for(Branch br:branches)
		{
			if(br.branchName.equals(brName))
				printCustomerList(br);
		}
	}
	
	private void printCustomerList(Branch br){
		for (Customer cust : br.customerList) {
			System.out.println("Clientul: " + cust.getName() + " cu tranzactiile: ");
			for (int i = 0; i < cust.transactionList.size(); i++) {
				System.out.println(cust.transactionList.get(i));
			}
			System.out.println();
		}
	}
	
}

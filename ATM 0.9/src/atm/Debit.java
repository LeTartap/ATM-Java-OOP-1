package atm;

public class Debit extends Account{

	Debit(Integer id)
	{
		super(id);
	}
	
	boolean withdraw(float sum) {
		
		if(sum<=balance) {
			balance -= sum;
			return true;
		}
		else;
		return false;
	}
	
	
	void deposit(float sum) {
		balance += sum;
	}


	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "Debit";
	}
	
	
}

package atm;

public class Factory {
	Account createAccount(String type) {
		
		if(type.equals("Debit") )
		{
			return new Debit();
		}
		else if(type.equals("Credit")) 
		{
			return new Credit(1000f);
		}
		else {
			return null;
		}
		
	}
}

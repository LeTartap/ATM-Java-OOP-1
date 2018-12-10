package atm;

public class Factory {
	Account createAccount(String type) {
		
		if(type.equals("debit") )
		{
			return new Debit();
		}
		else if(type.equals("credit")) 
		{
			return new Credit(-1000f);
		}
		else {
			return null;
		}
		
	}
}

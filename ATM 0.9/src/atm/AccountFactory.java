package atm;

public class AccountFactory extends AbstractFactory{
	
	Account createResource(String type) {	
		if(type.equals("debit") )
		{
			return new Debit(1);
		}
		else if(type.equals("credit")) 
		{
			return new Credit(-1000f,1);
		}
		else {
			return null;
		}
		
	}
}

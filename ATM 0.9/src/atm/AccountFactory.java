package atm;

public class AccountFactory extends AbstractFactory{
	 public static AccountFactory instance;
	 private AccountFactory() {
	 }
	    public static AccountFactory getInstance() {
	        if (instance == null) {
	          instance = new AccountFactory();
	        }
	        return instance;
	      }
	    int i =0;
	Account createResource(String type) {	
		if(type.equals("debit") )
		{
			return new Debit(i++);
			
		}
		else if(type.equals("credit")) 
		{	
			return new Credit(-1000f,i++);
		}
		else {
			return null;
		}
		
	}

}

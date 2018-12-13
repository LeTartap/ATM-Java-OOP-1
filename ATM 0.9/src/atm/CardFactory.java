package atm;

public class CardFactory extends AbstractFactory{
	 public static CardFactory instance;
	 private CardFactory() {
	 }
	    public static CardFactory getInstance() {
	        if (instance == null) {
	          instance = new CardFactory();
	        }
	        return instance;
	      }
	    int i =0;
	Account createResource(String type) {	
		if(type.equals("Debit") )
		{
			return new Debit(i++);
			
		}
		else if(type.equals("Credit")) 
		{
			return new Credit(-1000f,i++);
		}
		else {
			return null;
		}
		
	}
}

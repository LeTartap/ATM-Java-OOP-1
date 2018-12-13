package atm;

public abstract class Card extends Resource{
	Card(Integer intx){
		super(intx);	
	}
	Integer associatedAccountId;
	abstract String getType();
	boolean verifyCompatibility(Account acc) {
		if(acc.getType().equals(getType()))
		{
			return true;
		}
		else {
			return false;
		}
	}
}

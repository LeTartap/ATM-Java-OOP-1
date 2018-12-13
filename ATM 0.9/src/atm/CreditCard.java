package atm;

public class CreditCard extends Card{

	private CreditCard(Integer intx) {
		super(intx);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getType() {
		// TODO Auto- method stub
		return "Credit";
	}
	
	Card isCompatible(Account acc) {
		int i=0;
		if(verifyCompatibility(acc))
		{
			return new CreditCard(i++);
		}
		else {
			return null;
		}
	}

}

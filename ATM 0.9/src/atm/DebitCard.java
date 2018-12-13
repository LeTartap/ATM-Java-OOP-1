package atm;

public class DebitCard extends Card{

	private DebitCard(Integer intx) {
		super(intx);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getType() {
		// TODO Auto- method stub
		return "Debit";
	}
	
	Card isCompatible(Account acc) {
		int i=0;
		if(verifyCompatibility(acc))
		{
			return new DebitCard(i++);
		}
		else {
			return null;
		}
	}

}

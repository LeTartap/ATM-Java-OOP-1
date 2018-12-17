package atm;

public class Credit extends Account {
	
	float limit;
	
	Credit(float limit, Integer id) {
		super(id);
		this.limit =limit;
		
	}
	
	boolean withdraw(float sum) {
		
		if((balance-sum)>limit)
		{
			balance-=sum;			
			return true;
		}
		else {			
			return false;
		}
	}
	
	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "Credit";
	}

}

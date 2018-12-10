package atm;

public abstract class Account extends Resource
{

	Account(Integer id)
	{
		super(id);
	}
	float balance;
	abstract boolean withdraw(float sum);
	abstract String getType();

}

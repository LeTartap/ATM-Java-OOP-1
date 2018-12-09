package atm;

public abstract class Account 
{
	float balance;
	abstract boolean withdraw(float sum);
	abstract String getType();

}

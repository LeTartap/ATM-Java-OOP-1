package atm;

import java.util.ArrayList;
import java.util.List;

public class User {
	String name;
	String password;
	
	public User(String name, String pin) {
		this.name = name;
		this.password = pin;
	}
	List<Account> acclist = new ArrayList();
	void associateAccount(Account newAcc)
	{
		acclist.add(newAcc);
	}
	void printAccounts()
	{
		int i =0;
		for(Account acc : acclist)
		{
			i++;
			System.out.println(acc.getType()+" la indexul "+ i);
		}
	}
	boolean withdrawFromAccount(int i, float sum)
	{
		return acclist.get(i).withdraw(sum);	
	}
	
	float getBalanceFromAccount(int i)
	{
		return acclist.get(i).balance;
	}
	
	
	
	boolean depositInAccount(int i, float sum) 
	{
		System.out.println(i);
		if(acclist.get(i).getType().equals("Debit"))
		{
			((Debit)acclist.get(i)).deposit(sum);
			return true;
		}
		else
		return false;
	}
}

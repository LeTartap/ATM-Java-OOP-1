package atm;

import java.util.*;

public class ATM {
	
	Map<String, User> map = new HashMap();
	
	Factory atmWorks = new Factory();
	
	void addUser(String name,String pin){
		map.put(name, new User(name,pin));
	}
	void addUser(String name, User user)
	{
		map.put(name, user);
	}
	void addAccountToUser(String nume, String type)
	{
		map.get(nume).associateAccount(atmWorks.createAccount(type));
	}
	
}

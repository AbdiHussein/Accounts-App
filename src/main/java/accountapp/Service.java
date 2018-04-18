package accountapp;

import java.util.HashMap;

public class Service {
	HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	
	public Account getAccount(int accountNumber) {
		return accounts.get(accountNumber);
	}
	
	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(),account);
	}
	
	public void removeAccount(int accountNumber) {
		accounts.remove(accountNumber);
	}
	
	

}

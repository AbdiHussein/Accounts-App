package accountapp;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	
	public HashMap<Integer, Account>getAccountsMap(){
		return accounts;
	}
	
	public Account getAccount(int accountNumber) {
		return accounts.get(accountNumber);
	}
	
	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(),account);
	}
	
	public void removeAccount(int accountNumber) {
		accounts.remove(accountNumber);
	}
	
	public String javaToJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(accounts);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "errors";
		}
		
	}
	public int firstNameCount(String name) {
		int count = 0;
		for(Account account : accounts.values()) {
			if(account.getFirstName().equals(name)) {
				count++;
			}
		}
		return count;
	}

}

package Test;

import org.junit.Test;
import accountapp.Account;
import accountapp.Service;
import org.junit.Assert;

public class ServiceTest {
	@Test
	public void testAddAccounts() {
		Account a = new Account(1, "Abdirahman", "Hussein");
		
		Service s = new Service();
		s.addAccount(a);
		Assert.assertEquals(1, s.getAccountsMap().size());
		
	}
	
	@Test
	public void firstNameCountTest() {
	Account Ajaaz = new Account(2, "Awais", "Ajaz");
	Account Godwin = new Account(3, "Awais", "Godwin");
	Service d = new Service();
	d.addAccount(Ajaaz);
	d.addAccount(Godwin);
	int expectedValue = 2;
	int actualValue = d.firstNameCount("Awais");
	Assert.assertEquals(expectedValue, actualValue);
	}
}
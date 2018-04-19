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
}
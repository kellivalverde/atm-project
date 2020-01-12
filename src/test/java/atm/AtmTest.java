package atm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AtmTest {

	/*
	 * Test for: a test for a default balance withdraw from that default balance
	 * limit on withdraw based on available balance make an accurate deposit allow
	 * access by PIN deny access by PIN
	 */

	// Arrange -- Act -- Assert

	@Test
	public void shouldHaveDefaultBalanceOf100() {

		Atm underTest = new Atm(100, "");
		// Class -- name of object = new -- constructor
		int balance = underTest.getBalance();
		assertEquals(100, balance);
	}

	@Test
	public void shouldHaveDefaultBalanceOf200() {

		Atm underTest = new Atm(200, "");
		int balance = underTest.getBalance();
		assertEquals(200, balance);
	}

	@Test
	public void shouldHaveDefaultBalanceOf100AfterWithdrawOf100() {

		Atm underTest = new Atm(200, "");
		underTest.withdraw(100);
		int balance = underTest.getBalance();
		assertEquals(100, balance);
	}

	@Test
	public void shouldHaveBalanceOf0AfterWithdrawOf300() {

		Atm underTest = new Atm(200, "");
		underTest.withdraw(300);
		int balance = underTest.getBalance();
		assertEquals(0, balance);
	}
	
	@Test
	public void shouldHaveBalanceOf100AfterDeposit() {

		Atm underTest = new Atm(0, "");
		underTest.deposit(100);
		int balance = underTest.getBalance();
		assertEquals(100, balance);
	}
	
	@Test
	public void shouldAllowAccessByPin() {
		Atm underTest = new Atm(0, "1234");  //arbitrary bal to match constructor
		boolean access = underTest.allowAccess("1234");
		assertTrue(access);
	}
	
	@Test
	public void shouldDenyAccessByPin() {
		Atm underTest = new Atm(0, "1234");  //arbitrary bal to match constructor
		boolean access = underTest.allowAccess("1235");
		assertFalse(access);
	}
	
	
	
	
} //Atm class

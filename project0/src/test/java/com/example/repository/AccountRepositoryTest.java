package com.example.repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class AccountRepositoryTest {
	@Test
	public void count1() {
		AccountRepository accrep = new JdbcAccountRepository() ;
		int a = accrep.countAcc();
		Assertions.assertEquals(6, a);
			
	}		
	
}

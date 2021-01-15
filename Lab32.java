//Andrey Ilkiv
//Comp 271
//Lab 3#2
package lab3.pkg2;
public class Lab32 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(111,1000.0);
		CheckingAccount checking = new CheckingAccount(222,2000.0,100.0);
		savings.withdraw(900);
		assertTrue("Test 0", 100 == savings.getBalance());
		System.out.print("Test 1 - We should see an insufficient funds error here:");
		savings.withdraw(300);
		checking.withdraw(1900);
		assertTrue("Test 2", 100 == checking.getBalance());
		checking.withdraw(150);
		assertTrue("Test 3", -50 == checking.getBalance()); //overdraft protection test
		System.out.print("Test 4 - We should see an overdraft limit exceeded error here:");
		checking.withdraw(51);

		System.out.println();
		System.out.println("Done.");
	}

	public static void assertTrue(String s, boolean b) {
		if (!b) {
			System.out.println(s + " - FAILED ***");
		} else {
			System.out.println(s + " - passed");
		}
	}

	public static void assertFalse(String s, boolean b) {
		if (b) {
			System.out.println(s + " - FAILED ***");
		} else {
			System.out.println(s + " - passed");
		}
	}	
	public static void assertEquals(String s, boolean b) {
		if (b) {
			System.out.println(s + " - failed ***");
		} else {
			System.out.println(s + " - passed");
		}

    }
    
}

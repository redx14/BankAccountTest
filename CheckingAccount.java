//Andrey Ilkiv
//Comp 271
//Lab 3#2

package lab3.pkg2;

import java.util.Date;


public class CheckingAccount extends Account {
    private double overdraft;
    public CheckingAccount(int id, double balance, double overdraft){
        this.setId(id);
        this.setBalance(balance);
	setAnnualInterestRate(0);
	setDateCreated(new Date());
        this.overdraft=overdraft;
    }
    public void withdraw(double amt) {
        double postBalance = this.getBalance() - amt;
        if (postBalance>= -overdraft){
            this.setBalance(postBalance);
        }else{
            System.out.println("OVERDRAW LIMIT EXCEEDED!!");
        }
		
	}
    
}

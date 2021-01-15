//Andrey Ilkiv
//Comp 271
//Lab 3#2

package lab3.pkg2;

import java.util.Date;


public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance){
        this.setId(id);
	this.setBalance(balance);
	setAnnualInterestRate(0);
	setDateCreated(new Date());
    }
    
    public void withdraw(double amt) {
        double postBalance = this.getBalance()-amt;
        if(postBalance>=0){
		this.setBalance(postBalance);
        }else{
            System.out.println("INSUFFIECIENT FUNDS!");
        }
	}
}

//Andrey Ilkiv
//Comp 271
//Lab3#2

package lab3.pkg2;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

	//default constructor
	public Account() {
		setId(0);
		setBalance(0);
		setAnnualInterestRate(0);
		setDateCreated(new Date());
	}

	//constructor
	public Account(int id, double balance) {
		this.setId(id);
		this.setBalance(balance);
		setAnnualInterestRate(0);
		setDateCreated(new Date());		
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate/100) / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}	

	public void withdraw(double amt) {
		balance = balance - amt;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
    
}

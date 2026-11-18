package com.banking.service;
import com.banking.exception.InsufficientBalanceException;

public class BankAccount {
	private double balance;
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public synchronized void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance for withdrawal of Rs." + amount);
		}
		System.out.println(Thread.currentThread().getName() + " withdrawing Rs." + amount);
		balance -= amount;
		System.out
				.println(Thread.currentThread().getName() + " transaction completed. Remaining Balance: Rs." + balance);
	}
	
	public synchronized double getBalance() {
		return balance;
	}
}
package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new BusinessAccount(1001, "Jose", 1000.0, 500.0);
		Account acc2 = new SavingsAccount(1002, "Ana", 1000.0, 0.05);
		acc1.saque(100.0);
		System.out.println(acc1.getSaldo());
		acc2.saque(100.0);
		System.out.println(acc2.getSaldo());
	}

}

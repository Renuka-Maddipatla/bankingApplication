package com.bankingApplication;

public class Main {

	public static void main(String[] args) {
		Account bhavi = new Account ("234562",1000,"Bhavi","bhavi@gmail.com","7330907595");
		bhavi.DepositMoney(5000);
		bhavi.WithDrawMoney(4000);
	}
}



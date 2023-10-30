package com.bankingApplication;

public class Account {

		private String AccNumber;
		private double Balance;
		private String name;
		private String email;
		private String PhoneNumber;
		
		
		public Account(String accNumber, double balance, String name, String email, String phoneNumber) {
			
			this.AccNumber = accNumber;
			this.Balance = balance;
			this.name = name;
			this.email = email;
			this.PhoneNumber = phoneNumber;
		}
		 
		public void DepositMoney(double DepositedMoney) {
			this.Balance+=DepositedMoney;
			System.out.println("Deposit is successful,new Balance is " +this.Balance);
		}
		
	public void WithDrawMoney(double withdrawalMoney) {
		if (this.Balance < 0) {
			System.out.println("withdraw unsuccesful only" +this.Balance+" is left");
		}
		else {
			this.Balance-=withdrawalMoney;
			System.out.println("withdraw successful,current Balance is"+this.Balance);
		}
	}
		public String getAccNumber() {
			return AccNumber;
		}
		public void setAccNumber(String accNumber) {
			AccNumber = accNumber;
		}
		public double getBalance() {
			return Balance;
		}
		public void setBalance(double balance) {
			Balance = balance;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return PhoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			PhoneNumber = phoneNumber;
		}
}
		

	



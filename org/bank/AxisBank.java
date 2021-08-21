package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit is used to deposit money");
	}
	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		
		obj.saving();
		obj.fixed();
		obj.deposit();
		
		
		
		
		
	}
	

}

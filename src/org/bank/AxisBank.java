package org.bank;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Deposit rate of interest is 4%");
		System.out.println("Sample111");
		
	}
	public void sample() {
	System.out.println("sample method");
	}
public static void main(String[] args) 
{
 AxisBank ban=new AxisBank();
 ban.saving();
 ban.fixed();
 ban.deposit();
}
}

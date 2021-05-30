package org.bank;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Deposit rate of interest is 4%");
	}
public static void main(String[] args) 
{
 AxisBank ban=new AxisBank();
 ban.saving();
 ban.fixed();
 ban.deposit();
}
}

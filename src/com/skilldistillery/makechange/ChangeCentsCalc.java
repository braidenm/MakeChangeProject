package com.skilldistillery.makechange;

public class ChangeCentsCalc {
	
	
	
	public void changeCentsCalc(int num) {
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;

		if (num > 0) {
			if (num >= 25) {
				quarters = num / 25;
				num = num % 25;
				
				if (quarters > 1 ) {
					System.out.print(quarters + " Quarters ");
				}
				else {
					System.out.print(quarters + " Quarter ");
				}

			}

			if (num >= 10) {
				dimes = num / 10;
				num = num % 10;
				
				if (dimes > 1) {
					System.out.print(dimes + " Dimes ");
				}
				else {
					System.out.print(dimes + " Dime ");
				}

			}

			if (num >= 5) {
				nickels = num / 5;
				num = num % 5;
				
				if (nickels > 1) {
					System.out.print(nickels + " Nickels ");
				}
				else {
					System.out.print( nickels + " Nickel ");
				}

			}

			if (num > 0) {
				if ( num > 1) {
					System.out.print(num + " Pennies ");
				}
				else {
					System.out.print(num + " Penny ");
				}
			}

		}
	}

}

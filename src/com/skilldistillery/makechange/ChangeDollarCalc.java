package com.skilldistillery.makechange;

public class ChangeDollarCalc {

	
	
	public void changeDollarCalc(int num) {
		int twenties;
		int tens;
		int fives;

		if (num > 0) {

			if (num >= 20) {
				twenties = num / 20;
				num = num % 20;
				
				if (twenties > 1) {

					System.out.print(twenties + " Twenty dollar bills, ");
				}
				else {
					System.out.print( twenties + " Twenty dollar bill, ");
				}
			}

			if (num >= 10) {
				tens = num / 10;
				num = num % 10;
				
				if (tens > 1) {
				System.out.print(tens + " Ten dollar bills, ");
				}
				else {
					System.out.print(tens + " Ten dollar bill, ");
				}

			}

			if (num >= 5) {
				fives = num / 5;
				num = num % 5;
				
				if (fives > 1) {
					System.out.print(fives + " Five dollar bills, ");
				}
				else {
					System.out.print(fives + " Five dollar bill, ");
				}
			}

			if (num > 0) {
				if (num >1){
					System.out.print(num + " One dollar bills, ");
				}
				else {
					System.out.print(num + " One dollar bill, ");
				}
			}

		}

	}
	
}

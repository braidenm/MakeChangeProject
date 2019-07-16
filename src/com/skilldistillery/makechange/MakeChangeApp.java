package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChangeDollarCalc dollarCalc = new ChangeDollarCalc();
		ChangeCentsCalc centsCalc = new ChangeCentsCalc();
		
		int changeCents = 0;
		double totalCost = 0.0;
		double totalTender = 0.0;

		System.out.print("What is the price of the item: $");		totalCost = sc.nextDouble();
	

		do { 
			// to keep things accurate, I split the entry of dollars and cents
			int costDollar = (int)totalCost;
			int costCents = (costDollar * 100 - (int)Math.round(totalCost * 100));
			costCents = Math.abs(costCents);
			System.out.print("What is the tender: $");
			totalTender = sc.nextDouble();
			System.out.println();
			
			// to keep things accurate, I split the entry of dollars and cents
			int tenderDollar = (int)totalTender;
			int tenderCents = (tenderDollar * 100 - (int)Math.round(totalTender * 100));
			tenderCents = Math.abs(tenderCents);

			int changeDollar = tenderDollar - costDollar;

			if (tenderCents >= costCents) {
				changeCents = tenderCents - costCents;
			}

			else { //since I split the dollars and cents I needed to connect them
					// if the cent cost was greater than the tender cost
				changeCents = tenderCents - costCents + 100;
				changeDollar--;
			}

			if ((totalTender >= totalCost)) {

				//needed to make it place a 0 for things like $.08
				System.out.printf("Your change: $" + changeDollar + ".%02d %n", changeCents);
				
				dollarCalc.changeDollarCalc(changeDollar);
				System.out.println();
				centsCalc.changeCentsCalc(changeCents);
				System.out.println();

			} 
			
			else {
				double stillNeed = totalTender - totalCost;
				totalCost = Math.abs(stillNeed);
				totalTender = 0;
				//needed to make it place a 0 for things like $.08
				System.out.printf("You are short: $ %.2f %n", Math.abs(stillNeed));
			}
		} while (totalTender < totalCost);
		System.out.println();
		System.out.println("Thank you, have a nice day!");

		sc.close();

	}
	
	
	
	
	
// I did this originally, then decided to be cool and make them objects
//	public static void changeDollarCalc(int num) {
//		int twenties;
//		int tens;
//		int fives;
//
//		if (num > 0) {
//
//			if (num >= 20) {
//				twenties = num / 20;
//				num = num % 20;
//				
//				if (twenties > 1) {
//
//					System.out.print(twenties + " Twenty dollar bills ");
//				}
//				else {
//					System.out.println( twenties + " Twenty dollar bill ");
//				}
//			}
//
//			if (num >= 10) {
//				tens = num / 10;
//				num = num % 10;
//				
//				if (tens > 1) {
//				System.out.print(tens + " Ten dollar bills ");
//				}
//				else {
//					System.out.print(tens + " Ten dollar bill ");
//				}
//
//			}
//
//			if (num >= 5) {
//				fives = num / 5;
//				num = num % 5;
//				
//				if (fives > 1) {
//					System.out.print(fives + " Five dollar bills ");
//				}
//				else {
//					System.out.print(fives + " Five dollar bill ");
//				}
//			}
//
//			if (num > 0) {
//				if (num >1){
//					System.out.print(num + " One dollar bills ");
//				}
//				else {
//					System.out.print(num + " One dollar bill ");
//				}
//			}
//
//		}
//
//	}

//	public static void changeCentsCalc(int num) {
//		int quarters = 0;
//		int dimes = 0;
//		int nickels = 0;
//
//		if (num > 0) {
//			if (num >= 25) {
//				quarters = num / 25;
//				num = num % 25;
//				
//				if (quarters > 1 ) {
//					System.out.print(quarters + " Quarters ");
//				}
//				else {
//					System.out.println(quarters + " Quarter ");
//				}
//
//			}
//
//			if (num >= 10) {
//				dimes = num / 10;
//				num = num % 10;
//				
//				if (dimes > 1) {
//					System.out.print(dimes + " Dimes ");
//				}
//				else {
//					System.out.println(dimes + " Dime ");
//				}
//
//			}
//
//			if (num >= 5) {
//				nickels = num / 5;
//				num = num % 5;
//				
//				if (nickels > 1) {
//					System.out.print(nickels + " Nickles ");
//				}
//				else {
//					System.out.println( nickels + " Nickle ");
//				}
//
//			}
//
//			if (num > 0) {
//				if ( num > 1) {
//					System.out.print(num + " Pennies ");
//				}
//				else {
//					System.out.println(num + " Penny ");
//				}
//			}
//
//		}
//	}

}

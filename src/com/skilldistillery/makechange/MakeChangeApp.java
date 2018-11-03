package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ChangeDollarCalc dollarCalc = new ChangeDollarCalc();
		ChangeCentsCalc centsCalc = new ChangeCentsCalc();
		
		int tenderDollar = 0;
		int tenderCents = 0;
		int changeDollar = 0;
		int changeCents = 0;
		double totalCost = 0;
		double totalTender = 0;

		// to keep things accurate, I split the entry of dollars and cents
		System.out.print("What is the price of the item (Dollars not cents): ");
		int costDollar = sc.nextInt();
		System.out.print("Now the cents: ");
		int costCents = sc.nextInt();

		do { 
			System.out.print("What is the tender (Dollars not cents): ");
			tenderDollar = sc.nextInt();
			System.out.print("Now the cents: ");
			tenderCents = sc.nextInt();
			System.out.println();

			changeDollar = tenderDollar - costDollar;
			totalCost = costDollar + (.01 * costCents);
			totalTender = tenderDollar + (tenderCents * .01);

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
				//needed to make it place a 0 for things like $.08
				System.out.printf("You are short this much: $ %.2f %n", stillNeed);
			}
		} while (totalTender <= totalCost);

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

package com.skilldistillery.makechange;

import java.util.Scanner;

public class doubleToIntCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("the price: $");
		double price = sc.nextDouble();
		System.out.println(price);
		
		int priceD = (int)price;
		
		int priceC = (priceD * 100 - (int)(price * 100));
		priceC = Math.abs(priceC);
		
		
		System.out.println("the dollars: " +priceD + " Cents: " +priceC);
		
		
	}
}

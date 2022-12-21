package com.accenture.SGDinput;

import java.util.Scanner;

public class InputApp {
	private double SingDollar;
	private int Currency;
	int[] ID = {1, 2, 3, 4, 5};
	public String[] Country = {"MYR", "HKD", "IDR", "GBP", "EUR"};
	
	public double setSingDollar() {
		System.out.println("Hello, please enter the amount of money in SGD that you wish to convert");
		Scanner scan = new Scanner(System.in);
		return SingDollar = scan.nextDouble();
	}

	public double getSingDollar() {
		return SingDollar;
	}

	public int setCurrency() {
		System.out.println("What country's currency would you like to change to? (enter ID)");
		System.out.println("------------------------");
		System.out.println("ID           Country");
		for (int i=0; i<ID.length; i++) {
			System.out.println(ID[i]+"      "+Country[i]);
		}
		System.out.println("------------------------");
		Scanner scan = new Scanner(System.in);
		return Currency = scan.nextInt();
	}

	public int getCurrency() {
		return Currency;
	}

	
}

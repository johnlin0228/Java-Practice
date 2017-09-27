package CPD3464_Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MyStock {

	public static void main(String[] args) {

		int numberOfStocks;
		String myName = null;
		float myPurchasePrice = 0;
		float myCurrentPrice = 0;
		int myNumberOfShares = 0;
		float myConversionRate = 0;


		Scanner keyboard = new Scanner(System.in);
		// input the number of stocks.
		System.out.println("Please enter the number of stock " + 
				"(Note: maximize is 8, integer only)");
		numberOfStocks = keyboard.nextInt();

		// check the input whether correct or not.
		while(numberOfStocks>8 || numberOfStocks<=0) {
			System.out.println("Your entered is not correct!");
			System.out.println("Please enter the number of stock, " + 
					"(Note: maximize is 8, integer only)");
			numberOfStocks = keyboard.nextInt();
		}

		// display the number of stocks the user entered.
		System.out.println("your entered number of stocks is: " + numberOfStocks + "\n");

		// Create an array called stocks, the array's 
		// size equal to number of stocks the user entered.
		ForeignStockHolding[] myStocks = new ForeignStockHolding[numberOfStocks];

		System.out.println("An array called stocks have been set up, the array's size is: " + numberOfStocks);
		System.out.println("That's mean array \"myStocks\" include " + numberOfStocks + " stocks\n");
		for(int index = 0; index < numberOfStocks; index++) {
			
			System.out.println("Stock " + (index+1) + ":");
			
			ForeignStockHolding foreignStockHolding  = new ForeignStockHolding(myName,myPurchasePrice,myCurrentPrice,myNumberOfShares,myConversionRate);

			System.out.println("Please enter the name of stock.");
			myName = keyboard.next();
			foreignStockHolding.setCompanyName(myName);
			//		System.out.println(foreignStockHolding.getCompanyName());

			System.out.println("Please enter the purchase price of stock.");
			myPurchasePrice = keyboard.nextFloat();
			foreignStockHolding.setPurchaseSharePrice(myPurchasePrice);
			//		System.out.println(foreignStockHolding.getPurchaseSharePrice());

			System.out.println("Please enter the current price of stock.");
			myCurrentPrice = keyboard.nextFloat();
			foreignStockHolding.setCurrentSharePrice(myCurrentPrice);
			//		System.out.println(foreignStockHolding.getCurrentSharePrice());

			System.out.println("Please enter the number of shares.");
			myNumberOfShares = keyboard.nextInt();
			foreignStockHolding.setNumberOfShares(myNumberOfShares);
			//		System.out.println(foreignStockHolding.getNumberOfShares());

			System.out.println("Please enter the conversion rate. (Note: same currency please enter 1) ");
			myConversionRate = keyboard.nextFloat();
			while(myConversionRate <= 0) {
				System.out.println("your conversion rate is not correct!");
				System.out.println("Please enter the conversion rate.");
				myConversionRate = keyboard.nextFloat();
			}
			foreignStockHolding.setConversionRate(myConversionRate);
			//		System.out.println(foreignStockHolding.getConversionRate());
			
			myStocks[index] = foreignStockHolding;
			System.out.println("");
		
		}

		System.out.println("---Display all stock infotmation before sorting---");
		System.out.println("");

		for (int index = 0; index < numberOfStocks; index++) {
			System.out.println("Stock " + (index+1) + ":");
			System.out.println(myStocks[index]);
			System.out.println("");
		}
		
				System.out.println("---Display all stock infotmation After sorting---");
				System.out.println("");
		//
		//		// Sort the stocks with their Comparable interface methods.
		//		//		Arrays.sort(stocks);
		//		Arrays.sort(myStocks,Collections.reverseOrder());
		//
		//		// Display all companies information	 after sorting		
		//		for(int index = 0; index < numberOfStocks; index++) {
		//			System.out.println(myStocks[index]);
		//			System.out.println("");
		//		}

	}

}

package CPD3464_Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MyStock {

	public static void main(String[] args) {

		int numberOfStocks;
		
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

		for (int index = 0; index < numberOfStocks; index++){

			System.out.println("Please enter the name of stock.");
			String myName = "";
			myName = keyboard.nextLine();
			if(myName != null) {
				myStocks[index].setCompanyName(myName);
			}else {System.out.println("You not enter anything, please enter the name of stock.");}
			

			System.out.println("Please enter the purchase price of stock.");
			float myPurchasePrice = keyboard.nextFloat();
			myStocks[index].setPurchaseSharePrice(myPurchasePrice);

			System.out.println("Please enter the current price of stock.");
			float myCurrentPrice = keyboard.nextFloat();
			myStocks[index].setCurrentSharePrice(myCurrentPrice);

			System.out.println("Please enter the number of shares.");
			int myNumberOfShares = keyboard.nextInt();
			myStocks[index].setNumberOfShares(myNumberOfShares);

			System.out.println("Please enter the conversion rate. (Note: same currency please enter 1) ");
			float myConversionRate = keyboard.nextFloat();
			while(myConversionRate <= 0) {
				System.out.println("your conversion rate is not correct!");
				System.out.println("Please enter the conversion rate.");
				myConversionRate = keyboard.nextFloat();
			}
			myStocks[index].setConversionRate(myConversionRate);
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
		
		// Sort the stocks with their Comparable interface methods.
//		Arrays.sort(stocks);
		Arrays.sort(myStocks,Collections.reverseOrder());
		
		// Display all companies information	 after sorting		
		for(int index = 0; index < numberOfStocks; index++) {
			System.out.println(myStocks[index]);
			System.out.println("");
		}

	}

}

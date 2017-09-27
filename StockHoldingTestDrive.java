package CPD3464_Assignment;

import java.util.Arrays;
import java.util.Collections;

/**
 * Create an array and insert all purchased stock.
 * Display all stock information before and after sorting.
 */
public class StockHoldingTestDrive {

	public static void main(String[] args) {
		
		final int NUM_COMPANIES = 6; // Numbers of companies
		
		// Create an array called stock, include 6 companies
		StockHolding[] stocks = new StockHolding[NUM_COMPANIES];
		
		// Company 1: Samsung
		StockHolding samsung = new StockHolding("Samsung", 2.30f, 4.50f, 40);

		// Company 2: Microsoft
		StockHolding microsoft = new StockHolding("Microsoft", 12.19f, 10.56f, 90);

		// Company 3: Apple
		StockHolding apple = new StockHolding("Apple", 45.10f, 49.51f, 210);
		
		// Company 4: Shunfeng
		ForeignStockHolding shunfeng = new ForeignStockHolding("Shunfeng", 2.30f, 4.50f, 40, 0.94f);
		
		// Company 5: Alibaba
		ForeignStockHolding alibaba = new ForeignStockHolding("Alibaba", 30.50f, 40.95f, 300, 1.30f);
		
		// Company 6: Tencent
		ForeignStockHolding tencent = new ForeignStockHolding("Tencent", 24.30f, 29.10f, 400, 0.94f);

		stocks[0] = samsung;
		stocks[1] = microsoft;
		stocks[2] = apple;
		stocks[3] = shunfeng;
		stocks[4] = alibaba;
		stocks[5] = tencent;
		
		System.out.println("---Display all stock infotmation before sorting---");
		System.out.println("");
		// Display all companies information before sorting 
		for(int index = 0; index < stocks.length; index++) {
			System.out.println(stocks[index]);
			System.out.println("");
		}
		System.out.println("---Display all stock infotmation After sorting---");
		System.out.println("");
		
		// Sort the stocks with their Comparable interface methods.
//		Arrays.sort(stocks);
		Arrays.sort(stocks,Collections.reverseOrder());
		
		// Display all companies information	 after sorting		
		for(int index = 0; index < stocks.length; index++) {
			System.out.println(stocks[index]);
			System.out.println("");
		}
	}
}





# Java-Practice
## 1. Create a class called StockHolding to represent a stock that you have purchased. 
For instance variables, it will have 
* two floats named purchaseSharePrice and currentSharePrice
* one int named numberOfShares 
* one string named companyName. 
## Create accessory methods for the instance variables. 
Create two other instance methods:
*  -(float)costInDollars; //purchaseSharePrice * numberOfShares
*  -(float)valueInDollars; //currentSharePrice * numberOfShares
Populate an array with three instances of StockHolding. Display all the stocks sorted by company name in alphabetical order

## 2. Create a subclass of StockHolding called ForeignStockHolding. 
* Give ForeignStockHolding an additional instance variable: 0, which will be a float. 
(The conversion rate is what you need to multiply the local price by to get a price in Canadiandollars. Assume the purchasePrice and currentPrice are in the local currency.) 
* Override costInDollars and valueInDollars to do the right thing.
* Add at least two instances of ForeignStockHolding to the existing array from part one.
* Display all the stocks sorted by company name in reverseal phabetical order.

# 3. Modify the application 
so the user can choose how many stocks they want to enter as well as the type of the stock (maximum 8 stocks). The application should accept user data for every stock and after the data has been entered it should display the following menu:
* Display stock information with the lowest value
* Display stock with the highest value
* Display the most profit able stock
* Display the least profit able stock

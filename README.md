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
## Populate an array with three instances of StockHolding. Display all the stocks sorted by company name in alphabetical order

## 2.Create a subclass of StockHolding called ForeignStockHolding. 
Give ForeignStockHolding an additional instance variable: 0, which will be a float. 
(The conversion rate is what you need to multiply the local price by to get a price in Canadiandollars. Assume the purchasePrice and currentPrice are in the local currency.) 
Override costInDollars and valueInDollars to do the right thing.
Add at least two instances of ForeignStockHolding to the existing array from part one.
Display all the stocks sorted by company name in reverseal phabetical order.

package CPD3464_Assignment;

/**
 * Create a class called StockHolding to represent a stock 
 * that you have purchased. For instance variables, 
 * it will have two floats named purchaseSharePrice 
 * and currentSharePrice, one int named numberOfShares
 * and one string named companyName.
 * Create two instance methods: costInDollars and valueInDollars.
 * Populate an array with three instances of StockHolding.
 * Display all the stocks sorted by company name in alphabetical order.
 */
public class StockHolding implements Comparable<StockHolding>{

	private float purchaseSharePrice;
	private float currentSharePrice;
	private int numberOfShares;
	private String companyName;

	/**
	 * Constructor
	 * @param str representative company name
	 * @param pp representative purchase price
	 * @param cp representative current price
	 * @param ns representative number of shares
	 */
	public StockHolding(String str, float pp, float cp, int ns) {
		this.companyName = str;
		this.purchaseSharePrice = pp;
		this.currentSharePrice = cp;
		this.numberOfShares = ns;
	}

	/**
	 * getCompanyName method
	 * @return a company name
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * setCompanyName method
	 * @param companyName store a company name
	 */
	public void setCompanyName(String str) {
		this.companyName = str;
	}
	
	/**
	 * getPurchaseSharePrice method
	 * @return a purchase price
	 */
	public float getPurchaseSharePrice() {
		return purchaseSharePrice;
	}

	/**
	 * setPurchaseSharePrice method
	 * @param purchaseSharePrice store a purchase price
	 */
	public void setPurchaseSharePrice(float pp) {
		this.purchaseSharePrice = pp;
	}

	/**
	 * getCurrentSharePrice method
	 * @return a current price
	 */
	public float getCurrentSharePrice() {
		return currentSharePrice;
	}

	/**
	 * setCurrentSharePrice method
	 * @param currentSharePrice store current price
	 */
	public void setCurrentSharePrice(float cp) {
		this.currentSharePrice = cp;
	}

	/**
	 * getNumberOfShares method
	 * @return a number of share
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}

	/**
	 * setNumberOfShares method
	 * @param numberOfShares store a number of share
	 */
	public void setNumberOfShares(int ns) {
		this.numberOfShares = ns;
	}

	/**
	 *  calCostInDollars method
	 * @return a cost in dollars
	 */
	public float calCostInDollars() {
		float costInDollars;
		costInDollars = purchaseSharePrice * numberOfShares;
		return costInDollars;

	}

	/**
	 * calValueInDollars
	 * @return a value in dollars
	 */
	public float calValueInDollars() {
		float valueInDollars;
		valueInDollars = currentSharePrice * numberOfShares;
		return valueInDollars;
	}

	public String toString(){

		// Create a string representing the object.
		String str = "Company Name: " + getCompanyName() + "\n" +
				"Purchase Price: " + getPurchaseSharePrice() + "\n" +
				"Current Price: " + getCurrentSharePrice() + "\n" +
				"Numbers Of Shares: " + getNumberOfShares() + "\n" +
				"Cost In Dollars: " + calCostInDollars() + "\n" +
				"Value In Dollars: " + calValueInDollars(); 
		//Return the string.
		return str;
	}

	/**
	 * @Override
	 * sorted by company name in alphabetical order
	 */
	public int compareTo(StockHolding otherCompanyName) {
		
		return companyName.compareTo(otherCompanyName.getCompanyName());
	}
}


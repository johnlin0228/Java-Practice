package CPD3464_Assignment;

/**
 * Create a subclass of StockHolding called ForeignStockHolding.
 * Add a additional instance variable conversionRate.
 * The conversion rate is what you need to multiply the local price 
 * by to get a price in Canadian dollars.
 * Override costInDollars method and valueInDollars method.
 */
public class ForeignStockHolding extends StockHolding implements Comparable<StockHolding>{

	private float conversionRate;

	/**
	 * Constructor
	 * @param str
	 * @param pp
	 * @param cp
	 * @param ns
	 * @param cr
	 */
	public ForeignStockHolding(String str, float pp, float cp, int ns, float cr) {
		super(str, pp, cp, ns);
		this.conversionRate = cr;

	}

	/**
	 * getConversionRate method
	 * @return a conversion rate
	 */
	public float getConversionRate() {
		return conversionRate;
	}

	/**
	 * setConversionRate method
	 * @param cr store a conversionRate
	 * The conversion rate is what you need to
	 * multiply the local price by to get a price in Canadian dollars
	 */
	public void setConversionRate(float cr) {
		this.conversionRate = cr;
	}

	/**
	 * @Override calCostInDollars method
	 */
	public float calCostInDollars() {
		float costInDollars;
		costInDollars = getPurchaseSharePrice() * getNumberOfShares() * conversionRate;
		return costInDollars;
	}

	/**
	 * @Override calValueInDollars method
	 */
	public float calValueInDollars() {
		float valueInDollars;
		valueInDollars = getCurrentSharePrice() * getNumberOfShares() * conversionRate;
		return valueInDollars;
	}
}

package proj.model.annualaccount;

public class Liquiditeit extends Ratios{
	//attributen
	
	
	//constructor
	
	
	//3. Liquiditeit
	/**
	 * Liquiditeitsratio's in ruime zin (29/58 - 29) / (42/48 + 492/3)
	 */
	public double CalculateLiquiditeitRuimeZin(){
		return (this.getCurrentsAssets() - this.getAmountsReceivableMoreOneYear())/ this.SolvabiliteitSubtotaalOne() ;
	}


	/**
	 * Liquiditeitsratio's in enge zin (40/41 + 50/53 + 54/58) / 42/48
	 */
	public double CalculateLiquiditeitEngeZin(){
		return this.LiquiditeitSubtotaalThree() / this.getAmountsPayableWithinOneYear() ;
	}
		
	/**
	 * Current ratio  = (54/58 + 3 + 40/41 + 50/53 + 490/1) / (42/48 + 492/3)
	 */
	public double CalculateCurrentRatio(){
		return this.LiquiditeitSubtotaalOne() / this.SolvabiliteitSubtotaalOne() ;
	}

	
	/**
	 * Quick ratio  = (40/41 + 50/53 + 54/58 + 490/1) / (42/48 + 492/3)
	 */
	public double CalculateQuickRatio(){
		return this.LiquiditeitSubtotaalTwo() / this.SolvabiliteitSubtotaalOne();
	}


	/**
	 * Werkkapitaal = (3 + 40/41 + 50/53 + 54/58 + 490/1) - (42/48 + 492/3)
	 */
	public double CalculateWerkkapitaal(){
		return this.LiquiditeitSubtotaalOne() - this.SolvabiliteitSubtotaalOne() ;
	}
}

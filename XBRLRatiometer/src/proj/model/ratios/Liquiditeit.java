package proj.model.ratios;

public class Liquiditeit extends Ratios{
	//attributen
	
	
	//constructor
	
	
	//methoden
	/**
	 * Current ratio  = (54/58 + 3 + 40/41 + 50/53 + 490/1) / (42/48 + 492/3)
	 */
	public double CalculateCurrentRatio(){
		return this.LiqsubOne() / this.SolvSubOne() ;
	}

	
	/**
	 * Quick ratio  = (54/58 + 40/41 + 50/53 + 490/1) / (42/48 + 492/3)
	 */
	public double CalculateQuickRatio(){
		return this.LiqsubTwo() / this.SolvSubOne();
	}


	/**
	 * Werkkapitaal = (54/58 + 3 + 40/41 + 50/53 + 490/1) - (42/48 + 492/3)
	 */
	public double CalculateWerkkapitaal(){
		return this.LiqsubOne() - this.SolvSubOne() ;
	}
}

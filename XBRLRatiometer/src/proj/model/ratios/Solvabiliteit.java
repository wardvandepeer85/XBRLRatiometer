package proj.model.ratios;

public class Solvabiliteit extends Ratios {
	//attributen
	
	
	//constructor
	public Solvabiliteit(int equity, int reserves,
			int accumulatedProfitsLosses, int assets, int debtCharges,
			int gainLossOrdinaryActivitiesBeforeTaxes, int gainLossPeriod) {
		super(equity, reserves, accumulatedProfitsLosses, assets, debtCharges,
				gainLossOrdinaryActivitiesBeforeTaxes, gainLossPeriod);
	}

	
	//methoden
	/**
	 * Graad financiële afhankelijkheid = (42/48 + 492/3 + 16 + 17) / (42/48 + 492/3 + 16 + 17 + 10/15)
	 */
	public double CalculateGraadFinanciëleAfhankelijkheid(){
		return this.SolvSubTwo() / this.SolvSubThree();
	}

	
	/**
	 * Graad financiële onafhankelijkheid = (10/15) / (42/48 + 492/3 + 16 + 17 + 10/15)
	 */
	public double CalculateGraadFinanciëleOnafhankelijkheid(){
		return this.getEquity() / this.SolvSubThree();
	}
	
	
	/**
	 * Solvabiliteitsverhouding = (20/58) / (42/48 + 492/3 + 16 + 17)
	 */
	public double CalculateSolvabiliteitsverhouding(){
		return this.getAssets() / this.SolvSubTwo();
	}

	
	/**
	 * Zelffinancieringsgraad = (13 + 14) / (42/48 + 492/3 + 16 + 17 + 10/15)
	 */
	public double CalculateZelffinancieringsgraad(){
		return (this.getReserves() + this.getAccumulatedProfitsLosses()) / this.SolvSubThree();
	}
	

	/**
	 * Dekking vreemd vermogen = 9904 / (42/48 + 492/3 + 16 + 17)
	 */
	public double CalculateDekkingVV(){
		return this.getGainLossPeriod()  / this.SolvSubTwo();
	}

	
	/**
	 * Dekking rentekost vreemd vermogen = 9902 / 650
	 */
	public double CalculateDekkingRentekostVV(){
		return this.getGainLossOrdinaryActivitiesBeforeTaxes()  / this.getDebtCharges();
	}


	
}

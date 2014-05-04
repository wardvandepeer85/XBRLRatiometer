package proj.model.ratios;

public class Rentabiliteit extends Ratios {
	// attributen

	// constructor
	public Rentabiliteit(int equity, int provisionsDeferredTaxes,
			int amountsPayableMoreOneYear, int amountsPayableWithinOneYear,
			int turnover, int accruedChargesDeferredIncome, int gainLossPeriod,
			int gainLossOrdinaryActivitiesBeforeTaxes) {
		super(equity, provisionsDeferredTaxes, amountsPayableMoreOneYear,
				amountsPayableWithinOneYear, turnover,
				accruedChargesDeferredIncome, gainLossPeriod,
				gainLossOrdinaryActivitiesBeforeTaxes);
	}

	// getters en setters

	// methoden
	/**
	 * Netto verkoopmarge<br>9904 / 70
	 */
	public double CalculateNettoVerkoopmarge() {
		double nettoVerkoopmarge = 0;
		nettoVerkoopmarge = this.getGainLossPeriod() / this.getTurnover();
		return nettoVerkoopmarge;
	}

	/**
	 * Bruto verkoopmarge<br>
	 * 9902 / 70
	 */
	public double CalculateBrutoVerkoopmarge() {
		double brutoVerkoopmarge = 0;
		brutoVerkoopmarge = this.getGainLossOrdinaryActivitiesBeforeTaxes()
				/ this.getTurnover();
		return brutoVerkoopmarge;
	}

	/**
	 * Netto rentabiliteit totaal vermogen<br>
	 * 9904 / (42/48 + 492/3 + 16 + 17 +
	 * 10/15)
	 */
	public double NettoRentabiliteitTV() {
		double nettoRentabiliteitTV = 0;
		nettoRentabiliteitTV = this.getGainLossPeriod() / this.SolvSubThree();
		return nettoRentabiliteitTV;
	}

	/**
	 * Bruto rentabiliteit totaal vermogen<br>
	 * 9902 / (42/48 + 492/3 + 16 + 17 + 10/15)
	 */
	public double BrutoRentabiliteitTV() {
		double brutoRentabiliteitTV = 0;
		brutoRentabiliteitTV = this.getGainLossOrdinaryActivitiesBeforeTaxes()
				/ this.SolvSubThree();
		return brutoRentabiliteitTV;
	}

	/**
	 * Netto rentabiliteit eigen vermogen<br>
	 * 9904 / 10/15
	 */
	public double CalculateNettoRentabiliteitEV() {
		double nettoRentabiliteitEV = 0;
		nettoRentabiliteitEV = this.getGainLossPeriod() / this.getEquity();
		return nettoRentabiliteitEV;
	}

	/**
	 * Bruto rentabiliteit eigen vermogen<br>
	 * 9902 / 10/15
	 */
	public double CalculateBrutoRentabiliteitEV() {
		double brutoRentabiliteitEV = 0;
		brutoRentabiliteitEV = this.getGainLossOrdinaryActivitiesBeforeTaxes()
				/ this.getEquity();
		return brutoRentabiliteitEV;
	}

}

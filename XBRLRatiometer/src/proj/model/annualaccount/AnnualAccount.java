package proj.model.annualaccount;

import java.util.Arrays;
import java.util.Date;

import proj.model.company.Auditor;
import proj.model.company.Company;

public class AnnualAccount {
	// attributen
	// attributen - algemene gegevens Jaarrekening
	private Company company;
	private Date startdateFY;
	private Date enddateFY;
	private Auditor auditor;
	private Ratios ratio;

	// attributen - rekening Balans, Jaarrekening en Resultatenjaarrekening
	/**
	 * 3 - pfs:StocksContractsProgress - Voorraden en bestellingen in uitvoering
	 */
	private double stocksContractsProgress;

	/**
	 * 10/15 - pfs:Equity - Eigen Vermogen
	 */
	private double equity;
	/**
	 * 13 - pfs:Reserves - Reserves
	 */
	private double reserves;
	/**
	 * 14 - pfs:AccumulatedProfitsLosses - Overgedragen winst (verlies)
	 */
	private double accumulatedProfitsLosses;
	/**
	 * 16 - pfs:ProvisionsDeferredTaxes - Voorzieningen en uitgestelde
	 * belastingen
	 */
	private double provisionsDeferredTaxes;
	/**
	 * 17 - pfs:AmountsPayableMoreOneYear - Schulden op meer dan één jaar
	 */
	private double amountsPayableMoreOneYear;

	/**
	 * 20/58 - pfs:Assets - Totale activa
	 */
	private double assets;
	/**
	 * 29 pfs:AmountsReceivableMoreOneYear
	 */
	private double amountsReceivableMoreOneYear;
	/**
	 * 29/58 pfs:CurrentsAssets
	 */
	private double currentsAssets;

	/**
	 * 40/41 - pfs:AmountsReceivableWithinOneYear - Vorderingen op ten hoogste
	 * één jaar
	 */
	private double amountsReceivableWithinOneYear;
	/**
	 * 42/48 - pfs:AmountsPayableWithinOneYear - Schulden op ten hoogste één
	 * jaar
	 */
	private double amountsPayableWithinOneYear;

	/**
	 * 50/53 - pfs:CurrentInvestments - Liquide middelen
	 */
	private double cashBankHand;
	/**
	 * 54/58 - pfs:CashBankHand - Geldbeleggingen
	 */
	private double currentInvestments;

	/**
	 * 70 - pfs:Turnover - Omzet
	 */
	private double turnover;

	/**
	 * 490/1 - pfs:DeferredChargesAccruedIncome - Overlopende rekeningen Activa
	 */
	private double deferredChargesAccruedIncome;
	/**
	 * 492/3 - pfs:AccruedChargesDeferredIncome - Overlopende rekeningen Passiva
	 */
	private double accruedChargesDeferredIncome;

	/**
	 * 650 - pfs:DebtCharges - Kosten van schulden
	 */
	private double debtCharges;

	/**
	 * 9902 - pfs:GainLossOrdinaryActivitiesBeforeTaxes Winst (Verlies) uit de
	 * gewone bedrijfsuitoefening vóór belasting
	 */
	private double gainLossOrdinaryActivitiesBeforeTaxes;
	/**
	 * 9904 - pfs:GainLossPeriod - Winst (Verlies) van het boekjaar
	 */
	private double gainLossPeriod;

	// constructors
	/**
	 * AnnualAccount constructor
	 */

	/**
	 * Lege AnnualAccount constructor
	 */
	public AnnualAccount() {
	}

	// getters en setters
	/**
	 * setter voor een Company
	 * 
	 * @return
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * getter voor een Company
	 * 
	 * @param company
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * getter van de startdatum van een Annual account (start FY)
	 * 
	 * @param startdateFY
	 */
	public Date getStartdateFY() {
		return startdateFY;
	}

	/**
	 * setter van de startdatum van een Annual account (start FY)
	 * 
	 * @param startdateFY
	 */
	public void setStartdateFY(Date startdateFY) {
		this.startdateFY = startdateFY;
	}

	/**
	 * getter van de einddatum van een Annual account (einde FY)
	 * 
	 * @return
	 */
	public Date getEnddateFY() {
		return enddateFY;
	}

	/**
	 * setter van de einddatum van een Annual account (einde FY)
	 * 
	 * @return
	 */
	public void setEnddateFY(Date enddateFY) {
		this.enddateFY = enddateFY;
	}

	/**
	 * getter Auditor
	 * 
	 * @return
	 */
	public Auditor getAuditor() {
		return auditor;
	}

	/**
	 * setter Auditor
	 * 
	 * @param auditor
	 */
	public void setAuditor(Auditor auditor) {
		this.auditor = auditor;
	}

	/**
	 * getter ratios
	 * 
	 * @return
	 */
	public Ratios getRatio() {
		return ratio;
	}

	/**
	 * setter ratios
	 * 
	 * @param ratio
	 */
	public void setRatio(Ratios ratio) {
		this.ratio = ratio;
	}

	/**
	 * getter 3 - pfs:StocksContractsProgress
	 */
	public double getStocksContractsProgress() {
		return stocksContractsProgress;
	}

	/**
	 * setter 3 - pfs:StocksContractsProgress
	 */
	public void setStocksContractsProgress(double stocksContractsProgress) {
		this.stocksContractsProgress = stocksContractsProgress;
	}

	/**
	 * getter 10/15 - pfs:Equity
	 */
	public double getEquity() {
		return equity;
	}

	/**
	 * setter 10/15 - pfs:Equity
	 */
	public void setEquity(double equity) {
		this.equity = equity;
	}

	/**
	 * getter 13 - pfs:Reserves
	 */
	public double getReserves() {
		return reserves;
	}

	/**
	 * setter 13 - pfs:Reserves
	 */
	public void setReserves(double reserves) {
		this.reserves = reserves;
	}

	/**
	 * getter 14 - pfs:AccumulatedProfitsLosses
	 */
	public double getAccumulatedProfitsLosses() {
		return accumulatedProfitsLosses;
	}

	/**
	 * setter 14 - pfs:AccumulatedProfitsLosses
	 */
	public void setAccumulatedProfitsLosses(double accumulatedProfitsLosses) {
		this.accumulatedProfitsLosses = accumulatedProfitsLosses;
	}

	/**
	 * getter 16 - pfs:ProvisionsDeferredTaxes
	 */
	public double getProvisionsDeferredTaxes() {
		return provisionsDeferredTaxes;
	}

	/**
	 * setter 16 - pfs:ProvisionsDeferredTaxes
	 */
	public void setProvisionsDeferredTaxes(double provisionsDeferredTaxes) {
		this.provisionsDeferredTaxes = provisionsDeferredTaxes;
	}

	/**
	 * getter 17 - pfs:AmountsPayableMoreOneYear
	 */
	public double getAmountsPayableMoreOneYear() {
		return amountsPayableMoreOneYear;
	}

	/**
	 * setter 17 - pfs:AmountsPayableMoreOneYear
	 */
	public void setAmountsPayableMoreOneYear(double amountsPayableMoreOneYear) {
		this.amountsPayableMoreOneYear = amountsPayableMoreOneYear;
	}

	/**
	 * getter 20/58 - pfs:Assets
	 */
	public double getAssets() {
		return assets;
	}

	/**
	 * setter 20/58 - pfs:Assets
	 */
	public void setAssets(double assets) {
		this.assets = assets;
	}

	/**
	 * getter 29 - pfs:AmountsReceivableMoreOneYear
	 */
	public double getAmountsReceivableMoreOneYear() {
		return amountsReceivableMoreOneYear;
	}

	/**
	 * setter 29 - pfs:AmountsReceivableMoreOneYear
	 */
	public void setAmountsReceivableMoreOneYear(
			double amountsReceivableMoreOneYear) {
		this.amountsReceivableMoreOneYear = amountsReceivableMoreOneYear;
	}

	/**
	 * getter 29/58 - pfs:CurrentsAssets (Vlottende Activa)
	 */
	public double getCurrentsAssets() {
		return currentsAssets;
	}

	/**
	 * setter 29/58 - pfs:CurrentsAssets
	 */
	public void setCurrentsAssets(double currentsAssets) {
		this.currentsAssets = currentsAssets;
	}

	/**
	 * getter 40/41 - pfs:AmountsReceivableWithinOneYear
	 */
	public double getAmountsReceivableWithinOneYear() {
		return amountsReceivableWithinOneYear;
	}

	/**
	 * setter 40/41 - pfs:AmountsReceivableWithinOneYear
	 */
	public void setAmountsReceivableWithinOneYear(
			double amountsReceivableWithinOneYear) {
		this.amountsReceivableWithinOneYear = amountsReceivableWithinOneYear;
	}

	/**
	 * getter 42/48 - pfs:AmountsPayableWithinOneYear
	 */
	public double getAmountsPayableWithinOneYear() {
		return amountsPayableWithinOneYear;
	}

	/**
	 * setter 42/48 - pfs:AmountsPayableWithinOneYear
	 */
	public void setAmountsPayableWithinOneYear(
			double amountsPayableWithinOneYear) {
		this.amountsPayableWithinOneYear = amountsPayableWithinOneYear;
	}

	/**
	 * setter 50/53 - pfs:CurrentInvestments
	 */
	public void setCurrentInvestments(double currentInvestments) {
		this.currentInvestments = currentInvestments;
	}

	/**
	 * setter 50/53 - pfs:CurrentInvestments
	 */
	public double getCurrentInvestments() {
		return currentInvestments;
	}

	/**
	 * getter 54/58 - pfs:CashBankHand
	 */
	public double getCashBankHand() {
		return cashBankHand;
	}

	/**
	 * setter 54/58 - pfs:CashBankHand
	 */
	public void setCashBankHand(double cashBankHand) {
		this.cashBankHand = cashBankHand;
	}

	/**
	 * getter 70 - pfs:turnover
	 */
	public double getTurnover() {
		return turnover;
	}

	/**
	 * setter 70 - pfs:turnover
	 */
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	/**
	 * getter 490/1 - pfs:DeferredChargesAccruedIncome
	 */
	public double getDeferredChargesAccruedIncome() {
		return deferredChargesAccruedIncome;
	}

	/**
	 * setter 490/1 - pfs:DeferredChargesAccruedIncome
	 */
	public void setDeferredChargesAccruedIncome(
			double deferredChargesAccruedIncome) {
		this.deferredChargesAccruedIncome = deferredChargesAccruedIncome;
	}

	/**
	 * getter 492/3 - pfs:AccruedChargesDeferredIncome
	 */
	public double getAccruedChargesDeferredIncome() {
		return accruedChargesDeferredIncome;
	}

	/**
	 * setter 492/3 - pfs:AccruedChargesDeferredIncome
	 */
	public void setAccruedChargesDeferredIncome(
			double accruedChargesDeferredIncome) {
		this.accruedChargesDeferredIncome = accruedChargesDeferredIncome;
	}

	/**
	 * getter 650 - pfs:DebtCharges
	 */
	public double getDebtCharges() {
		return debtCharges;
	}

	/**
	 * setter 650 - pfs:DebtCharges
	 */
	public void setDebtCharges(double debtCharges) {
		this.debtCharges = debtCharges;
	}

	/**
	 * getter 9902 - pfs:GainLossPeriod
	 */
	public double getGainLossOrdinaryActivitiesBeforeTaxes() {
		return gainLossOrdinaryActivitiesBeforeTaxes;
	}

	/**
	 * setter 9902 - pfs:GainLossPeriod
	 */
	public void setGainLossOrdinaryActivitiesBeforeTaxes(
			double gainLossOrdinaryActivitiesBeforeTaxes) {
		this.gainLossOrdinaryActivitiesBeforeTaxes = gainLossOrdinaryActivitiesBeforeTaxes;
	}

	/**
	 * getter 9904 - pfs:GainLossPeriod
	 */
	public double getGainLossPeriod() {
		return gainLossPeriod;
	}

	/**
	 * setter 9904 - pfs:GainLossPeriod
	 */
	public void setGainLossPeriod(double gainLossPeriod) {
		this.gainLossPeriod = gainLossPeriod;
	}

	// 1. methoden
	// 1.1 Methoden - subtotaal Solvabiliteit
	/**
	 * 42/48 + 492/3
	 */
	public double SolvabiliteitSubtotaalOne() {
		return this.getAmountsPayableWithinOneYear()
				+ this.getAccruedChargesDeferredIncome();
	}

	/**
	 * (42/48 + 492/3) + 16 + 17
	 */
	public double SolvabiliteitSubtotaalTwo() {
		return this.SolvabiliteitSubtotaalOne()
				+ this.getProvisionsDeferredTaxes()
				+ this.getAmountsPayableMoreOneYear();
	}

	/**
	 * (42/48 + 492/3 + 16 + 17) + 10/15
	 */
	public double SolvabiliteitSubtotaalThree() {
		return this.SolvabiliteitSubtotaalTwo() + this.getEquity();
	}

	// 1.2 Methoden - subtotaal Liquiditeit
	/**
	 * 40/41 + 50/53 + 54/58
	 */
	public double LiquiditeitSubtotaalThree() {
		return this.getAmountsReceivableWithinOneYear()
				+ this.getCurrentInvestments() + this.getCashBankHand();
	}

	/**
	 * 40/41 + 50/53 + 54/58 + 490/1
	 */
	public double LiquiditeitSubtotaalTwo() {
		return this.getAmountsReceivableWithinOneYear()
				+ this.getCurrentInvestments() + this.getCashBankHand()
				+ this.getDeferredChargesAccruedIncome();
	}

	/**
	 * 3 + 40/41 + 50/53 + 54/58 + 490/1
	 */
	public double LiquiditeitSubtotaalOne() {
		return this.getStocksContractsProgress()
				+ this.getAmountsReceivableWithinOneYear()
				+ this.getCurrentInvestments() + this.getCashBankHand()
				+ this.getDeferredChargesAccruedIncome();
	}

	// toString

	// 2. Solvabiliteit
	/**
	 * Solvabiliteit - Graad financiële afhankelijkheid<br>
	 * (42/48 + 492/3 + 16 + 17) / (42/48 + 492/3 + 16 + 17 + 10/15)<br>
	 * %
	 */
	public double CalculateGraadFinanciëleAfhankelijkheid() {
		return (this.SolvabiliteitSubtotaalTwo() / this
				.SolvabiliteitSubtotaalThree()) * 100;
	}

	/**
	 * Solvabiliteit - Graad financiële onafhankelijkheid<br>
	 * (10/15) / (42/48 + 492/3 + 16 + 17 + 10/15)<br>
	 * %
	 */
	public double CalculateGraadFinanciëleOnafhankelijkheid() {
		return (this.getEquity() / this.SolvabiliteitSubtotaalThree()) * 100;
	}

	/**
	 * Solvabiliteit - Solvabiliteitsverhouding<br>
	 * (20/58) / (42/48 + 492/3 + 16 + 17)<br>
	 */
	public double CalculateSolvabiliteitsverhouding() {
		return this.getAssets() / this.SolvabiliteitSubtotaalTwo();
	}

	/**
	 * Solvabiliteit - Zelffinancieringsgraad<br>
	 * (13 + 14) / (42/48 + 492/3 + 16 + 17 + 10/15)<br>
	 * %
	 */
	public double CalculateZelffinancieringsgraad() {
		return ((this.getReserves() + this.getAccumulatedProfitsLosses())
				/ this.SolvabiliteitSubtotaalThree())*100;
	}

	/**
	 * Solvabiliteit - Dekking vreemd vermogen<br>
	 * 9904 / (42/48 + 492/3 + 16 + 17)<br>
	 */
	public double CalculateDekkingVV() {
		return this.getGainLossPeriod() / this.SolvabiliteitSubtotaalTwo();
	}

	/**
	 * Solvabiliteit - Dekking rentekost vreemd vermogen<br>
	 * 9902 / 650
	 */
	public double CalculateDekkingRentekostVV() {
		return this.getGainLossOrdinaryActivitiesBeforeTaxes()
				/ this.getDebtCharges();
	}

	// 3. Liquiditeit
	/**
	 * Liquiditeit - Liquiditeitsratio's in ruime zin<br>
	 * (29/58 - 29) / (42/48 + 492/3)
	 */
	public double CalculateLiquiditeitRuimeZin() {
		return (this.getCurrentsAssets() - this
				.getAmountsReceivableMoreOneYear())
				/ this.SolvabiliteitSubtotaalOne();
	}

	/**
	 * Liquiditeit - Liquiditeitsratio's in enge zin<br>
	 * (40/41 + 50/53 + 54/58) / 42/48
	 */
	public double CalculateLiquiditeitEngeZin() {
		return this.LiquiditeitSubtotaalThree()
				/ this.getAmountsPayableWithinOneYear();
	}

	/**
	 * Liquiditeit - Current ratio<br>
	 * (3 + 40/41 + 50/53 + 54/58 + 490/1) / (42/48 + 492/3)
	 */
	public double CalculateCurrentRatio() {
		return this.LiquiditeitSubtotaalOne()
				/ this.SolvabiliteitSubtotaalOne();
	}

	/**
	 * Liquiditeit - Quick ratio<br>
	 * (40/41 + 50/53 + 54/58 + 490/1) / (42/48 + 492/3)
	 */
	public double CalculateQuickRatio() {
		return this.LiquiditeitSubtotaalTwo()
				/ this.SolvabiliteitSubtotaalOne();
	}

	/**
	 * Liquiditeit - Werkkapitaal<br>
	 * (3 + 40/41 + 50/53 + 54/58 + 490/1) - (42/48 + 492/3)
	 */
	public double CalculateWerkkapitaal() {
		return this.LiquiditeitSubtotaalOne()
				- this.SolvabiliteitSubtotaalOne();
	}

	
	
	// 4. Rendabiliteit
	/**
	 * Rendabiliteit - Netto verkoopmarge<br>
	 * 9904 / 70
	 * %
	 */
	public double CalculateNettoVerkoopmarge() {
		double nettoVerkoopmarge = 0;
		nettoVerkoopmarge = this.getGainLossPeriod() / this.getTurnover();
		return nettoVerkoopmarge * 100;
	}

	/**
	 * Rendabiliteit - Bruto verkoopmarge<br>
	 * 9902 / 70
	 * %
	 */
	public double CalculateBrutoVerkoopmarge() {
		double brutoVerkoopmarge = 0;
		brutoVerkoopmarge = this.getGainLossOrdinaryActivitiesBeforeTaxes()
				/ this.getTurnover();
		return brutoVerkoopmarge * 100;
	}

	/**
	 * Rendabiliteit - Netto rentabiliteit totaal vermogen<br>
	 * 9904 / (42/48 + 492/3 + 16 + 17 + 10/15)<br>
	 * %
	 */
	public double NettoRentabiliteitTV() {
		double nettoRentabiliteitTV = 0;
		nettoRentabiliteitTV = this.getGainLossPeriod()
				/ this.SolvabiliteitSubtotaalThree();
		return nettoRentabiliteitTV * 100;
	}

	/**
	 * Rendabiliteit - Bruto rentabiliteit totaal vermogen<br>
	 * 9902 / (42/48 + 492/3 + 16 + 17 + 10/15)<br>
	 * %
	 */
	public double BrutoRentabiliteitTV() {
		double brutoRentabiliteitTV = 0;
		brutoRentabiliteitTV = this.getGainLossOrdinaryActivitiesBeforeTaxes()
				/ this.SolvabiliteitSubtotaalThree();
		return brutoRentabiliteitTV * 100;
	}

	/**
	 * Rendabiliteit - Netto rentabiliteit eigen vermogen<br>
	 * 9904 / 10/15<br>
	 * %
	 */
	public double CalculateNettoRentabiliteitEV() {
		double nettoRentabiliteitEV = 0;
		nettoRentabiliteitEV = this.getGainLossPeriod() / this.getEquity();
		return nettoRentabiliteitEV * 100;
	}

	/**
	 * Rendabiliteit - Bruto rentabiliteit eigen vermogen<br>
	 * 9902 / 10/15<br>
	 * %
	 */
	public double CalculateBrutoRentabiliteitEV() {
		double brutoRentabiliteitEV = 0;
		brutoRentabiliteitEV = this.getGainLossOrdinaryActivitiesBeforeTaxes()
				/ this.getEquity();
		return brutoRentabiliteitEV * 100;
	}

	@Override
	public String toString() {
		return "AnnualAccount \nCompany="
				+ company
				+ "\nstartdateFY="
				+ startdateFY
				+ "\nenddateFY="
				+ enddateFY
				+ "\nAuditor="
				+ auditor
				+ "\nSolvabiliteit:\n-CalculateGraadFinanciëleAfhankelijkheid()="
				+ CalculateGraadFinanciëleAfhankelijkheid()
				+ ", \n-CalculateGraadFinanciëleOnafhankelijkheid()="
				+ CalculateGraadFinanciëleOnafhankelijkheid()
				+ ", \n-CalculateSolvabiliteitsverhouding()="
				+ CalculateSolvabiliteitsverhouding()
				+ ", \n-CalculateZelffinancieringsgraad()="
				+ CalculateZelffinancieringsgraad() + ", \n-CalculateDekkingVV()="
				+ CalculateDekkingVV() + ", \n-CalculateDekkingRentekostVV()="
				+ CalculateDekkingRentekostVV()
				+ "\nLiquiditeit:\n-CalculateLiquiditeitRuimeZin()="
				+ CalculateLiquiditeitRuimeZin()
				+ ", \n-CalculateLiquiditeitEngeZin()="
				+ CalculateLiquiditeitEngeZin() + ", \n-CalculateCurrentRatio()="
				+ CalculateCurrentRatio() + ", \n-CalculateQuickRatio()="
				+ CalculateQuickRatio() + ", \n-CalculateWerkkapitaal()="
				+ CalculateWerkkapitaal()
				+ "\nRendabiliteit:\nCalculateNettoVerkoopmarge()="
				+ CalculateNettoVerkoopmarge()
				+ ", \n-CalculateBrutoVerkoopmarge()="
				+ CalculateBrutoVerkoopmarge() + ", \n-NettoRentabiliteitTV()="
				+ NettoRentabiliteitTV() + ", \n-BrutoRentabiliteitTV()="
				+ BrutoRentabiliteitTV() + ", \n-CalculateNettoRentabiliteitEV()="
				+ CalculateNettoRentabiliteitEV()
				+ ", \n-CalculateBrutoRentabiliteitEV()="
				+ CalculateBrutoRentabiliteitEV();
	}

}

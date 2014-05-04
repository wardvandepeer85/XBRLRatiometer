package proj.model.ratios;

public class Ratios {
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
	private double	accumulatedProfitsLosses;	
	/**
	 * 16 - pfs:ProvisionsDeferredTaxes - Voorzieningen en uitgestelde belastingen
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
	 * 40/41 - pfs:AmountsReceivableWithinOneYear - Vorderingen op ten hoogste één jaar
	 */
	private double amountsReceivableWithinOneYear;
	/**
	 * 42/48 - pfs:AmountsPayableWithinOneYear - Schulden op ten hoogste één jaar
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
	 * 9902 - pfs:GainLossOrdinaryActivitiesBeforeTaxes 
	 * Winst (Verlies) uit de gewone bedrijfsuitoefening vóór belasting
	 */
	private double gainLossOrdinaryActivitiesBeforeTaxes;
	/**
	 * 9904 - pfs:GainLossPeriod - Winst (Verlies) van het boekjaar
	 */
	private double gainLossPeriod;
	
	
	//Constructor
	/**
	 * Constructor (algemeen)
	 */
	public Ratios(double stocksContractsProgress, double equity, double reserves,
			double accumulatedProfitsLosses, double provisionsDeferredTaxes,
			double amountsPayableMoreOneYear, double assets,
			double amountsReceivableWithinOneYear,
			int amountsPayableWithinOneYear, int cashBankHand,
			int currentInvestments, int turnover,
			int deferredChargesAccruedIncome, int accruedChargesDeferredIncome,
			int debtCharges, int gainLossOrdinaryActivitiesBeforeTaxes,
			int gainLossPeriod) {
		this.stocksContractsProgress = stocksContractsProgress;
		this.equity = equity;
		this.reserves = reserves;
		this.accumulatedProfitsLosses = accumulatedProfitsLosses;
		this.provisionsDeferredTaxes = provisionsDeferredTaxes;
		this.amountsPayableMoreOneYear = amountsPayableMoreOneYear;
		this.assets = assets;
		this.amountsReceivableWithinOneYear = amountsReceivableWithinOneYear;
		this.amountsPayableWithinOneYear = amountsPayableWithinOneYear;
		this.cashBankHand = cashBankHand;
		this.currentInvestments = currentInvestments;
		this.turnover = turnover;
		this.deferredChargesAccruedIncome = deferredChargesAccruedIncome;
		this.accruedChargesDeferredIncome = accruedChargesDeferredIncome;
		this.debtCharges = debtCharges;
		this.gainLossOrdinaryActivitiesBeforeTaxes = gainLossOrdinaryActivitiesBeforeTaxes;
		this.gainLossPeriod = gainLossPeriod;
	}
	
	
	/**
	 * Constructor (Rentabiliteit)
	 */
	public Ratios(double equity,double provisionsDeferredTaxes,
			double amountsPayableMoreOneYear, double amountsPayableWithinOneYear,
			double turnover, int accruedChargesDeferredIncome, double gainLossPeriod,
			double gainLossOrdinaryActivitiesBeforeTaxes) {
		this.equity = equity;
		this.provisionsDeferredTaxes = provisionsDeferredTaxes;
		this.amountsPayableMoreOneYear = amountsPayableMoreOneYear;
		this.amountsPayableWithinOneYear = amountsPayableWithinOneYear;
		this.turnover = turnover;
		this.accruedChargesDeferredIncome = accruedChargesDeferredIncome;
		this.gainLossPeriod = gainLossPeriod;
		this.gainLossOrdinaryActivitiesBeforeTaxes = gainLossOrdinaryActivitiesBeforeTaxes;
	}
	
	/**
	 * Constructor voor Solvabiliteit
	 */
	public Ratios(double equity, double reserves, double accumulatedProfitsLosses,
			double assets, double debtCharges,
			double gainLossOrdinaryActivitiesBeforeTaxes, double gainLossPeriod) {
		this.equity = equity;
		this.reserves = reserves;
		this.accumulatedProfitsLosses = accumulatedProfitsLosses;
		this.assets = assets;
		this.debtCharges = debtCharges;
		this.gainLossOrdinaryActivitiesBeforeTaxes = gainLossOrdinaryActivitiesBeforeTaxes;
		this.gainLossPeriod = gainLossPeriod;
	}

	
	
	
	/**
	 * Constructor voor Liquiditeit
	 */
	
	
	
	/**
	 * Constructor (leeg)
	 */
	public Ratios(){}
	
	
	//getters en setters
	/**
	 * getter 3 - pfs:CurrentsAssets
	 */
	public double getStocksContractsProgress() {
		return stocksContractsProgress;
	}
	/**
	 * setter 3 - pfs:CurrentsAssets
	 */
	public void setCurrentsAssets(double stocksContractsProgress) {
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
	public void setAmountsPayableWithinOneYear(double amountsPayableWithinOneYear) {
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
	public void setDeferredChargesAccruedIncome(double deferredChargesAccruedIncome) {
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
	public void setAccruedChargesDeferredIncome(double accruedChargesDeferredIncome) {
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
	
	
	//methoden
	/**
	 * 42/48 + 492/3
	 */
	public double SolvSubOne(){		
		return this.getAmountsPayableWithinOneYear() + this.getAccruedChargesDeferredIncome();
	}
	
	
	/**
	 * 42/48 + 492/3 + 16 + 17
	 */
	public double SolvSubTwo(){	
		return this.SolvSubOne() + this.getProvisionsDeferredTaxes() + this.getAmountsPayableMoreOneYear();
	}
	
	/**
	 * 42/48 + 492/3 + 16 + 17 + 10/15
	 */
	public double SolvSubThree(){
		return this.SolvSubTwo() + this.getEquity() ;
	}
	
	/**
	 * 54/58 + 3 + 40/41 + 50/53 + 490/1
	 */
	public double LiqsubOne(){
		return this.getCashBankHand() +  this.getStocksContractsProgress() + this.getAmountsReceivableWithinOneYear() + 
				this.getCurrentInvestments() + this.getDeferredChargesAccruedIncome();
	}
	
	/**
	 * 54/58 + 40/41 + 50/53 + 490/1
	 */
	public double LiqsubTwo(){
		return this.getCashBankHand() + this.getAmountsReceivableWithinOneYear() + 
				this.getCurrentInvestments() + this.getDeferredChargesAccruedIncome();
	}



}

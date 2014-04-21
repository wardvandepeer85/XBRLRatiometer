package proj.model.ratios;

public class Ratios {
	/**
	 * 3 - pfs:CurrentsAssets
	 */
	private int currentsAssets;
	
	/**
	 * 10/15 - pfs:Equity
	 */
	private int equity;
	/** 
	 * 13 - pfs:Reserves
	 */
	private int reserves;
	/**
	 * 14 - pfs:AccumulatedProfitsLosses
	 */
	private int	accumulatedProfitsLosses;
	
	/**
	 * 16 - pfs:ProvisionsDeferredTaxes 
	 */
	private int provisionsDeferredTaxes;
	/**
	 * 17 - pfs:AmountsPayableMoreOneYear 
	 */
	private int amountsPayableMoreOneYear;
	
	
	/**
	 * 20/58 - pfs:Assets
	 */
	private int assets;
	/**
	 * 40/41 - pfs:AmountsReceivableWithinOneYear
	 */
	private int amountsReceivableWithinOneYear;
	
	/**
	 * 42/48 - pfs:AmountsPayableWithinOneYear 
	 */
	private int amountsPayableWithinOneYear;
	
	/**
	 * 50/53 - pfs:cashBankHand
	 */
	private int cashBankHand;
	
	/**
	 * 54/58 - pfs:CurrentInvestments
	 */
	private int currentInvestments;
	
	/**
	 * 70 - pfs:turnover 
	 */
	private int turnover;
	
	/**
	 * 490/1
	 */
	private int deferredChargesAccruedIncome;
	
	/**
	 * 492/3 - pfs:AccruedChargesDeferredIncome
	 */
	private int accruedChargesDeferredIncome;
	/**
	 * 650 - pfs:DebtCharges 
	 */
	private int debtCharges;
	
	
	/**
	 * 9902 - pfs:GainLossOrdinaryActivitiesBeforeTaxes
	 */
	private int gainLossOrdinaryActivitiesBeforeTaxes;
	/**
	 * 9904 - pfs:GainLossPeriod
	 */
	private int gainLossPeriod;
	
	//Constructor
	/**
	 * Constructor voor Rentabiliteit
	 */
	public Ratios(int equity, int provisionsDeferredTaxes,
			int amountsPayableMoreOneYear, int amountsPayableWithinOneYear,
			int turnover, int accruedChargesDeferredIncome, int gainLossPeriod,
			int gainLossOrdinaryActivitiesBeforeTaxes) {
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
	public Ratios(){
		
		
		
	}
	
	/**
	 * Constructor voor Liquiditeit
	 */
	
	
	//getters en setters
	/**
	 * getter 3 - pfs:CurrentsAssets
	 */
	public int getCurrentsAssets() {
		return currentsAssets;
	}
	/**
	 * setter 3 - pfs:CurrentsAssets
	 */
	public void setCurrentsAssets(int currentsAssets) {
		this.currentsAssets = currentsAssets;
	}
	
	/**
	 * getter 10/15 - pfs:Equity
	 */
	public int getEquity() {
		return equity;
	}
	/**
	 * setter 10/15 - pfs:Equity
	 */
	public void setEquity(int equity) {
		this.equity = equity;
	}
	/** 
	 * getter 13 - pfs:Reserves
	 */
	public int getReserves() {
		return reserves;
	}
	/** 
	 * setter 13 - pfs:Reserves
	 */
	public void setReserves(int reserves) {
		this.reserves = reserves;
	}
	/**
	 * getter 14 - pfs:AccumulatedProfitsLosses
	 */
	public int getAccumulatedProfitsLosses() {
		return accumulatedProfitsLosses;
	}
	/**
	 * setter 14 - pfs:AccumulatedProfitsLosses
	 */
	public void setAccumulatedProfitsLosses(int accumulatedProfitsLosses) {
		this.accumulatedProfitsLosses = accumulatedProfitsLosses;
	}
	/**
	 * getter 16 - pfs:ProvisionsDeferredTaxes 
	 */
	public int getProvisionsDeferredTaxes() {
		return provisionsDeferredTaxes;
	}
	/**
	 * setter 16 - pfs:ProvisionsDeferredTaxes 
	 */
	public void setProvisionsDeferredTaxes(int provisionsDeferredTaxes) {
		this.provisionsDeferredTaxes = provisionsDeferredTaxes;
	}

	/**
	 * getter 17 - pfs:AmountsPayableMoreOneYear 
	 */
	public int getAmountsPayableMoreOneYear() {
		return amountsPayableMoreOneYear;
	}
	/**
	 * setter 17 - pfs:AmountsPayableMoreOneYear 
	 */
	public void setAmountsPayableMoreOneYear(int amountsPayableMoreOneYear) {
		this.amountsPayableMoreOneYear = amountsPayableMoreOneYear;
	}
	
	/**
	 * getter 20/58 - pfs:Assets
	 */
	public int getAssets() {
		return assets;
	}
	/**
	 * setter 20/58 - pfs:Assets
	 */
	public void setAssets(int assets) {
		this.assets = assets;
	}

	/**
	 * getter 40/41 - pfs:AmountsReceivableWithinOneYear
	 */
	public int getAmountsReceivableWithinOneYear() {
		return amountsReceivableWithinOneYear;
	}
	/**
	 * setter 40/41 - pfs:AmountsReceivableWithinOneYear
	 */
	public void setAmountsReceivableWithinOneYear(
			int amountsReceivableWithinOneYear) {
		this.amountsReceivableWithinOneYear = amountsReceivableWithinOneYear;
	}
	/**
	 * getter 42/48 - pfs:AmountsPayableWithinOneYear 
	 */
	public int getAmountsPayableWithinOneYear() {
		return amountsPayableWithinOneYear;
	}
	/**
	 * setter 42/48 - pfs:AmountsPayableWithinOneYear 
	 */
	public void setAmountsPayableWithinOneYear(int amountsPayableWithinOneYear) {
		this.amountsPayableWithinOneYear = amountsPayableWithinOneYear;
	}
	
	/**
	 * getter 50/53 - pfs:cashBankHand
	 */
	public int getCashBankHand() {
		return cashBankHand;
	}
	/**
	 * setter 50/53 - pfs:cashBankHand
	 */
	public void setCashBankHand(int cashBankHand) {
		this.cashBankHand = cashBankHand;
	}

	/**
	 * getter 54/58 - pfs:CurrentInvestments
	 */
	public int getCurrentInvestments() {
		return currentInvestments;
	}
	/**
	 * setter 54/58 - pfs:CurrentInvestments
	 */
	public void setCurrentInvestments(int currentInvestments) {
		this.currentInvestments = currentInvestments;
	}
	/**
	 * getter 70 - pfs:turnover 
	 */
	public int getTurnover() {
		return turnover;
	}
	/**
	 * setter 70 - pfs:turnover 
	 */
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	/**
	 * getter 490/1 - pfs:DeferredChargesAccruedIncome
	 */
	public int getDeferredChargesAccruedIncome() {
		return deferredChargesAccruedIncome;
	}
	/**
	 * setter 490/1 - pfs:DeferredChargesAccruedIncome
	 */
	public void setDeferredChargesAccruedIncome(int deferredChargesAccruedIncome) {
		this.deferredChargesAccruedIncome = deferredChargesAccruedIncome;
	}
	/**
	 * getter 492/3 - pfs:AccruedChargesDeferredIncome
	 */
	public int getAccruedChargesDeferredIncome() {
		return accruedChargesDeferredIncome;
	}
	/**
	 * setter 492/3 - pfs:AccruedChargesDeferredIncome
	 */
	public void setAccruedChargesDeferredIncome(int accruedChargesDeferredIncome) {
		this.accruedChargesDeferredIncome = accruedChargesDeferredIncome;
	}
	/**
	 * getter 650 - pfs:DebtCharges 
	 */
	public int getDebtCharges() {
		return debtCharges;
	}
	/**
	 * setter 650 - pfs:DebtCharges 
	 */
	public void setDebtCharges(int debtCharges) {
		this.debtCharges = debtCharges;
	}
	
	/**
	 * getter 9902 - pfs:GainLossPeriod
	 */
	public int getGainLossOrdinaryActivitiesBeforeTaxes() {
		return gainLossOrdinaryActivitiesBeforeTaxes;
	}
	/**
	 * setter 9902 - pfs:GainLossPeriod
	 */
	public void setGainLossOrdinaryActivitiesBeforeTaxes(
			int gainLossOrdinaryActivitiesBeforeTaxes) {
		this.gainLossOrdinaryActivitiesBeforeTaxes = gainLossOrdinaryActivitiesBeforeTaxes;
	}
	
	/**
	 * getter 9904 - pfs:GainLossPeriod
	 */
	public int getGainLossPeriod() {
		return gainLossPeriod;
	}
	/**
	 * setter 9904 - pfs:GainLossPeriod
	 */
	public void setGainLossPeriod(int gainLossPeriod) {
		this.gainLossPeriod = gainLossPeriod;
	}
	
	//methoden
	/**
	 * 42/48 + 492/3
	 */
	public int SolvSubOne(){		
		return this.getAmountsPayableWithinOneYear() + this.getAccruedChargesDeferredIncome();
	}
	
	/**
	 * 42/48 + 492/3 + 16 + 17
	 */
	public int SolvSubTwo(){	
		return this.SolvSubOne() + this.getProvisionsDeferredTaxes() + this.getAmountsPayableMoreOneYear();
	}
	
	/**
	 * 42/48 + 492/3 + 16 + 17 + 10/15
	 */
	public int SolvSubThree(){
		return this.SolvSubTwo() + this.getEquity() ;
	}
	
	/**
	 * 54/58 + 3 + 40/41 + 50/53 + 490/1
	 */
	public int Liqsub1(){
		return this.getCashBankHand() +  this.getCurrentsAssets() + this.getAmountsReceivableWithinOneYear() + 
				this.getCurrentInvestments() + this.getDeferredChargesAccruedIncome();
	}
	
	/**
	 * 54/58 + 40/41 + 50/53 + 490/1
	 */
	public int Liqsub2(){
		return this.getCashBankHand() + this.getAmountsReceivableWithinOneYear() + 
				this.getCurrentInvestments() + this.getDeferredChargesAccruedIncome();
	}
	
	

	
	
}

package proj.xbrlimport;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import proj.model.annualaccount.AnnualAccount;
import proj.model.annualaccount.Ratios;
import proj.model.company.Company;

public class Test {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, DOMException, ParseException {

			String urla = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/201400700588.XBRL";
			String urlb = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/PwCBelgiumREV-2013-201400800008.XBRL";
			String urlc = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/201239200397.XBRL";
			String urld = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/Colruyt-201363100372.XBRL";

			System.out.println("\n---------------Annual Account b----------------------------");
			File file = new File(urla);
			XBRLimport a = new XBRLimport(file);
			AnnualAccount b = new AnnualAccount();
			
			b.setCompany(a.loadCompanyInformation());
			b.setAuditor(a.loadAuditorInformation());
			b.setStartdateFY(a.loadAnnualAccountsDate("pfs:PeriodStartDate"));
			b.setEnddateFY(a.loadAnnualAccountsDate("pfs:PeriodEndDate"));
			b.setStocksContractsProgress(a.retrieveCurrentInstant("pfs:StocksContractsProgress","3"));
			b.setEquity(a.retrieveCurrentInstant("pfs:Equity", "10/15"));
			b.setReserves(a.retrieveCurrentInstant("pfs:Reserves", "13"));
			b.setAccumulatedProfitsLosses(a.retrieveCurrentInstant("pfs:AccumulatedProfitsLosses", "14"));
			b.setProvisionsDeferredTaxes(a.retrieveCurrentInstant("pfs:ProvisionsDeferredTaxes", "16"));
			b.setAmountsPayableMoreOneYear(a.retrieveCurrentInstant("pfs:AmountsPayableMoreOneYear", "17"));
			b.setAssets(a.retrieveCurrentInstant("pfs:Assets", "20/58"));
			b.setAmountsReceivableMoreOneYear(a.retrieveCurrentInstant("pfs:AmountsReceivableMoreOneYear", "29"));	
			b.setCurrentsAssets(a.retrieveCurrentInstant("pfs:CurrentsAssets", "29/58"));
			b.setAmountsReceivableWithinOneYear(a.retrieveCurrentInstant("pfs:AmountsReceivableWithinOneYear", "40/41"));
			b.setAmountsPayableWithinOneYear(a.retrieveCurrentInstant("pfs:AmountsPayableWithinOneYear", "42/48"));
			b.setCurrentInvestments(a.retrieveCurrentInstant("pfs:CurrentInvestments", "50/53"));
			b.setCashBankHand(a.retrieveCurrentInstant("pfs:CashBankHand", "54/58"));
			b.setTurnover(a.retrieveCurrentInstant("pfs:Turnover", "70"));
			b.setOtherOperatingIncome(a.retrieveCurrentInstant("pfs:OtherOperatingIncome", "74"));
			b.setDeferredChargesAccruedIncome(a.retrieveCurrentInstant("pfs:DeferredChargesAccruedIncome", "490/1"));
			b.setAccruedChargesDeferredIncome(a.retrieveCurrentInstant("pfs:AccruedChargesDeferredIncome", "492/3"));
			b.setOperatingSubsidiesCompensatoryAmounts(a.retrieveCurrentInstant("pfs:OperatingSubsidiesCompensatoryAmounts", "740"));
			b.setDepreciationOtherAmountsWrittenDownFormationExpensesIntangibleTangibleFixedAssets(a.retrieveCurrentInstant("pfs:DepreciationOtherAmountsWrittenDownFormationExpensesIntangibleTangibleFixedAssets", "630"));
			b.setAmountsWrittenDownStocksContractsProgressTradeDebtorsAppropriationsWriteBack(a.retrieveCurrentInstant("pfs:AmountsWrittenDownStocksContractsProgressTradeDebtorsAppropriationsWriteBacks", "631/4"));
			b.setProvisionsRisksChargesAppropriationsWriteBack(a.retrieveCurrentInstant("pfs:ProvisionsRisksChargesAppropriationsWriteBacks", "635/7"));
			b.setDebtCharges(a.retrieveCurrentInstant("pfs:DebtCharges", "650"));		
			b.setCapitalSubsidiesGrantedPaRip(a.retrieveCurrentInstant("pfs:CapitalSubsidiesGrantedPublicAuthoritiesRecordedIncomePeriod", "9125"));
			b.setOperatingProfitLoss(a.retrieveCurrentInstant("pfs:OperatingProfitLoss", "9901"));			
			b.setGainLossOrdinaryActivitiesBeforeTaxes(a.retrieveCurrentInstant("pfs:GainLossOrdinaryActivitiesBeforeTaxes", "9902"));
			b.setGainLossPeriod(a.retrieveCurrentInstant("pfs:GainLossPeriod", "9904"));
			
			
			
			System.out.println(b);
			
			System.out.println("\n---------------Annual Account c----------------------------");
			File fileb = new File(urld);
			XBRLimport ca = new XBRLimport(fileb);
			AnnualAccount c = new AnnualAccount();
			
			c.setCompany(ca.loadCompanyInformation());
			c.setAuditor(ca.loadAuditorInformation());
			c.setStartdateFY(ca.loadAnnualAccountsDate("pfs:PeriodStartDate"));
			c.setEnddateFY(ca.loadAnnualAccountsDate("pfs:PeriodEndDate"));
			c.setStocksContractsProgress(ca.retrieveCurrentInstant("pfs:StocksContractsProgress","3"));
			c.setEquity(ca.retrieveCurrentInstant("pfs:Equity", "10/15"));
			c.setReserves(ca.retrieveCurrentInstant("pfs:Reserves", "13"));
			c.setAccumulatedProfitsLosses(ca.retrieveCurrentInstant("pfs:AccumulatedProfitsLosses", "14"));
			c.setProvisionsDeferredTaxes(ca.retrieveCurrentInstant("pfs:ProvisionsDeferredTaxes", "16"));
			c.setAmountsPayableMoreOneYear(ca.retrieveCurrentInstant("pfs:AmountsPayableMoreOneYear", "17"));
			c.setAssets(ca.retrieveCurrentInstant("pfs:Assets", "20/58"));
			c.setAmountsReceivableMoreOneYear(ca.retrieveCurrentInstant("pfs:AmountsReceivableMoreOneYear", "29"));	
			c.setCurrentsAssets(ca.retrieveCurrentInstant("pfs:CurrentsAssets", "29/58"));
			c.setAmountsReceivableWithinOneYear(ca.retrieveCurrentInstant("pfs:AmountsReceivableWithinOneYear", "40/41"));
			c.setAmountsPayableWithinOneYear(ca.retrieveCurrentInstant("pfs:AmountsPayableWithinOneYear", "42/48"));
			c.setCurrentInvestments(ca.retrieveCurrentInstant("pfs:CurrentInvestments", "50/53"));
			c.setCashBankHand(ca.retrieveCurrentInstant("pfs:CashBankHand", "54/58"));
			c.setTurnover(ca.retrieveCurrentInstant("pfs:Turnover", "70"));
			c.setOtherOperatingIncome(ca.retrieveCurrentInstant("pfs:OtherOperatingIncome", "74"));
			c.setDeferredChargesAccruedIncome(ca.retrieveCurrentInstant("pfs:DeferredChargesAccruedIncome", "490/1"));
			c.setAccruedChargesDeferredIncome(ca.retrieveCurrentInstant("pfs:AccruedChargesDeferredIncome", "492/3"));
			c.setOperatingSubsidiesCompensatoryAmounts(ca.retrieveCurrentInstant("pfs:OperatingSubsidiesCompensatoryAmounts", "740"));
			c.setDepreciationOtherAmountsWrittenDownFormationExpensesIntangibleTangibleFixedAssets(ca.retrieveCurrentInstant("pfs:DepreciationOtherAmountsWrittenDownFormationExpensesIntangibleTangibleFixedAssets", "630"));
			c.setAmountsWrittenDownStocksContractsProgressTradeDebtorsAppropriationsWriteBack(ca.retrieveCurrentInstant("pfs:AmountsWrittenDownStocksContractsProgressTradeDebtorsAppropriationsWriteBacks", "631/4"));
			c.setProvisionsRisksChargesAppropriationsWriteBack(ca.retrieveCurrentInstant("pfs:ProvisionsRisksChargesAppropriationsWriteBacks", "635/7"));
			c.setDebtCharges(ca.retrieveCurrentInstant("pfs:DebtCharges", "650"));		
			c.setCapitalSubsidiesGrantedPaRip(ca.retrieveCurrentInstant("pfs:CapitalSubsidiesGrantedPublicAuthoritiesRecordedIncomePeriod", "9125"));
			c.setOperatingProfitLoss(ca.retrieveCurrentInstant("pfs:OperatingProfitLoss", "9901"));			
			c.setGainLossOrdinaryActivitiesBeforeTaxes(ca.retrieveCurrentInstant("pfs:GainLossOrdinaryActivitiesBeforeTaxes", "9902"));
			c.setGainLossPeriod(ca.retrieveCurrentInstant("pfs:GainLossPeriod", "9904"));
			
			System.out.println(c);
			
			
			
			
			
			System.out.println("\n---------------Import----------------------------");
			
			a.retrieveCurrentInstant("pfs:StocksContractsProgress", "3" );
			a.retrieveCurrentInstant("pfs:Equity", "10/15");
			a.retrieveCurrentInstant("pfs:Reserves", "13");
			a.retrieveCurrentInstant("pfs:AccumulatedProfitsLosses", "14");
			a.retrieveCurrentInstant("pfs:ProvisionsDeferredTaxes", "16");
			a.retrieveCurrentInstant("pfs:AmountsPayableMoreOneYear", "17");		
			a.retrieveCurrentInstant("pfs:Assets", "20/58");
			a.retrieveCurrentInstant("pfs:AmountsReceivableMoreOneYear", "29");
			a.retrieveCurrentInstant("pfs:CurrentsAssets", "29/58");
			a.retrieveCurrentInstant("pfs:AmountsReceivableWithinOneYear", "40/41");
			a.retrieveCurrentInstant("pfs:AmountsPayableWithinOneYear", "42/48");
			a.retrieveCurrentInstant("pfs:CurrentInvestments", "50/53");
			a.retrieveCurrentInstant("pfs:CashBankHand", "54/58");
			a.retrieveCurrentInstant("pfs:Turnover", "70");
			a.retrieveCurrentInstant("pfs:OtherOperatingIncome", "74");
			a.retrieveCurrentInstant("pfs:DeferredChargesAccruedIncome", "490/1");
			a.retrieveCurrentInstant("pfs:AccruedChargesDeferredIncome", "492/3");
			a.retrieveCurrentInstant("pfs:DebtCharges", "650");
			a.retrieveCurrentInstant("pfs:OperatingSubsidiesCompensatoryAmounts", "740");
			a.retrieveCurrentInstant("pfs:DepreciationOtherAmountsWrittenDownFormationExpensesIntangibleTangibleFixedAssets", "630");
			a.retrieveCurrentInstant("pfs:AmountsWrittenDownStocksContractsProgressTradeDebtorsAppropriationsWriteBack", "631/4");
			a.retrieveCurrentInstant("pfs:ProvisionsRisksChargesAppropriationsWriteBack", "635/7");
			a.retrieveCurrentInstant("pfs:CapitalSubsidiesGrantedPublicAuthoritiesRecordedIncomePeriod", "9125");
			a.retrieveCurrentInstant("pfs:OperatingProfitLoss", "9901");
			a.retrieveCurrentInstant("pfs:GainLossOrdinaryActivitiesBeforeTaxes", "9902");
			a.retrieveCurrentInstant("pfs:GainLossPeriod", "9904");
			
			System.out.println("CurrentInstant: " + ca.retrieveCurrentInstant("pfs:AccumulatedProfitsLosses", "10/15"));
			System.out.println("PrecedingDuration: " + ca.retrievePrecedingDuration("pfs:AccumulatedProfitsLosses"));
		
			System.out.println("CurrentInstant: " + ca.retrieveCurrentInstant("pfs:CurrentPortionAmountsPayableMoreOneYearFallingDueWithinOneYear"," "));
			System.out.println("PrecedingDuration: " + ca.retrievePrecedingDuration("pfs:CurrentPortionAmountsPayableMoreOneYearFallingDueWithinOneYear"));
			
			
	}
}

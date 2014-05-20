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
			String urlc = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/201239200397.XBRL";
			String urlb = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/PwCBelgiumREV-2013-201400800008.XBRL";
			String urld = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/Colruyt-201363100372.XBRL";

			System.out.println("\n---------------Annual Account b----------------------------");
			File file = new File(urlb);
			XBRLimport a = new XBRLimport(file);
			AnnualAccount b = new AnnualAccount();
			
			b.setCompany(a.loadCompanyInformation());
			b.setAuditor(a.loadAuditorInformation());
			b.setStartdateFY(a.loadAnnualAccountsDate("pfs:PeriodStartDate"));
			b.setEnddateFY(a.loadAnnualAccountsDate("pfs:PeriodEndDate"));
			b.setStocksContractsProgress(a.retrieve("pfs:StocksContractsProgress","3"));
			b.setEquity(a.retrieve("pfs:Equity", "10/15"));
			b.setReserves(a.retrieve("pfs:Reserves", "13"));
			b.setAccumulatedProfitsLosses(a.retrieve("pfs:AccumulatedProfitsLosses", "14"));
			b.setProvisionsDeferredTaxes(a.retrieve("pfs:ProvisionsDeferredTaxes", "16"));
			b.setAmountsPayableMoreOneYear(a.retrieve("pfs:AmountsPayableMoreOneYear", "17"));
			b.setAssets(a.retrieve("pfs:Assets", "20/58"));
			b.setAmountsReceivableMoreOneYear(a.retrieve("pfs:AmountsReceivableMoreOneYear", "29"));	
			b.setCurrentsAssets(a.retrieve("pfs:CurrentsAssets", "29/58"));
			b.setAmountsReceivableWithinOneYear(a.retrieve("pfs:AmountsReceivableWithinOneYear", "40/41"));
			b.setAmountsPayableWithinOneYear(a.retrieve("pfs:AmountsPayableWithinOneYear", "42/48"));
			b.setCurrentInvestments(a.retrieve("pfs:CurrentInvestments", "50/53"));
			b.setCashBankHand(a.retrieve("pfs:CashBankHand", "54/58"));
			b.setTurnover(a.retrieve("pfs:Turnover", "70"));
			b.setDeferredChargesAccruedIncome(a.retrieve("pfs:DeferredChargesAccruedIncome", "490/1"));
			b.setAccruedChargesDeferredIncome(a.retrieve("pfs:AccruedChargesDeferredIncome", "492/3"));
			b.setDebtCharges(a.retrieve("pfs:DebtCharges", "650"));
			b.setGainLossOrdinaryActivitiesBeforeTaxes(a.retrieve("pfs:GainLossOrdinaryActivitiesBeforeTaxes", "9902"));
			b.setGainLossPeriod(a.retrieve("pfs:GainLossPeriod", "9904"));
			
			
			
			System.out.println(b);
			
			System.out.println("\n---------------Annual Account c----------------------------");
			File fileb = new File(urld);
			XBRLimport ca = new XBRLimport(fileb);
			AnnualAccount c = new AnnualAccount();
			
			c.setCompany(ca.loadCompanyInformation());
			c.setAuditor(ca.loadAuditorInformation());
			c.setStartdateFY(ca.loadAnnualAccountsDate("pfs:PeriodStartDate"));
			c.setEnddateFY(ca.loadAnnualAccountsDate("pfs:PeriodEndDate"));
			c.setStocksContractsProgress(ca.retrieve("pfs:StocksContractsProgress","3"));
			c.setEquity(ca.retrieve("pfs:Equity", "10/15"));
			c.setReserves(ca.retrieve("pfs:Reserves", "13"));
			c.setAccumulatedProfitsLosses(ca.retrieve("pfs:AccumulatedProfitsLosses", "14"));
			c.setProvisionsDeferredTaxes(ca.retrieve("pfs:ProvisionsDeferredTaxes", "16"));
			c.setAmountsPayableMoreOneYear(ca.retrieve("pfs:AmountsPayableMoreOneYear", "17"));
			c.setAssets(ca.retrieve("pfs:Assets", "20/58"));
			c.setAmountsReceivableMoreOneYear(ca.retrieve("pfs:AmountsReceivableMoreOneYear", "29"));	
			c.setCurrentsAssets(ca.retrieve("pfs:CurrentsAssets", "29/58"));
			c.setAmountsReceivableWithinOneYear(ca.retrieve("pfs:AmountsReceivableWithinOneYear", "40/41"));
			c.setAmountsPayableWithinOneYear(ca.retrieve("pfs:AmountsPayableWithinOneYear", "42/48"));
			c.setCurrentInvestments(ca.retrieve("pfs:CurrentInvestments", "50/53"));
			c.setCashBankHand(ca.retrieve("pfs:CashBankHand", "54/58"));
			c.setTurnover(ca.retrieve("pfs:Turnover", "70"));
			c.setDeferredChargesAccruedIncome(ca.retrieve("pfs:DeferredChargesAccruedIncome", "490/1"));
			c.setAccruedChargesDeferredIncome(ca.retrieve("pfs:AccruedChargesDeferredIncome", "492/3"));
			c.setDebtCharges(ca.retrieve("pfs:DebtCharges", "650"));
			c.setGainLossOrdinaryActivitiesBeforeTaxes(ca.retrieve("pfs:GainLossOrdinaryActivitiesBeforeTaxes", "9902"));
			c.setGainLossPeriod(ca.retrieve("pfs:GainLossPeriod", "9904"));
			
			System.out.println(c);
			
			//System.out.println("\n---------------Balansposten----------------------------");
			
			a.retrieve("pfs:StocksContractsProgress", "3" );
			a.retrieve("pfs:Equity", "10/15");
			a.retrieve("pfs:Reserves", "13");
			a.retrieve("pfs:AccumulatedProfitsLosses", "14");
			a.retrieve("pfs:ProvisionsDeferredTaxes", "16");
			a.retrieve("pfs:AmountsPayableMoreOneYear", "17");		
			a.retrieve("pfs:Assets", "20/58");
			a.retrieve("pfs:AmountsReceivableMoreOneYear", "29");
			a.retrieve("pfs:CurrentsAssets", "29/58");
			a.retrieve("pfs:AmountsReceivableWithinOneYear", "40/41");
			a.retrieve("pfs:AmountsPayableWithinOneYear", "42/48");
			a.retrieve("pfs:CurrentInvestments", "50/53");
			a.retrieve("pfs:CashBankHand", "54/58");
			a.retrieve("pfs:Turnover", "70");
			a.retrieve("pfs:DeferredChargesAccruedIncome", "490/1");
			a.retrieve("pfs:AccruedChargesDeferredIncome", "492/3");
			a.retrieve("pfs:DebtCharges", "650");
			a.retrieve("pfs:GainLossOrdinaryActivitiesBeforeTaxes", "9902");
			a.retrieve("pfs:GainLossPeriod", "9904");
	}
}

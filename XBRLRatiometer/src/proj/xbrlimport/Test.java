package proj.xbrlimport;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import proj.model.company.Company;

public class Test {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

			String urla = "C:/Users/wvandepeer/Downloads/201400700588.XBRL";
			String urlc = "C:/Users/wvandepeer/Downloads/201239200397.XBRL";
			String urlb = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/PwCBelgiumREV-2013-201400800008.XBRL";
			File file = new File(urlc);
			XBRLimport a = new XBRLimport(file);

			
			a.loadCompanyInformation();
			a.loadAuditorInformation();
			
			
			a.loadAnnualAccountDates();
			
			System.out.println("\n---------------Balansposten----------------------------");
			a.retrieve("pfs:StocksContractsProgress", "3" );
			a.retrieve("pfs:Equity", "10/15");
			a.retrieve("pfs:Reserves", "13");
			a.retrieve("pfs:AccumulatedProfitsLosses", "14");
			a.retrieve("pfs:ProvisionsDeferredTaxes", "16");
			a.retrieve("pfs:AmountsPayableMoreOneYear", "17");		
			a.retrieve("pfs:Assets", "20/58");
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

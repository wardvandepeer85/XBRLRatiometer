package proj.xbrlimport;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Test {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		String urla = "C:/Users/wvandepeer/Downloads/201400700588.XBRL";
		String urlb = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/PwCBelgiumREV-2013-201400800008.XBRL";
		XBRLimport a = new XBRLimport(urla);
		
		a.loadCompanyInformation();
		a.loadAuditorInformation();
		a.loadCurrentAccountPeriod();
		a.loadBalanceSheetInformation();
	}
}

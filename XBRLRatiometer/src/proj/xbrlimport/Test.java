package proj.xbrlimport;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Test {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		try {
			String urla = "C:/Users/wvandepeer/Downloads/201400700588.XBRL";
			String urlc = "C:/Users/wvandepeer/Downloads/201239200397.XBRL";
			String urlb = "C:/Users/wvandepeer/Desktop/Projectwerk/XBRL/voorbeelden/PwCBelgiumREV-2013-201400800008.XBRL";
			File file = new File(urla);
			XBRLimport a = new XBRLimport(file);
			
			a.loadCompanyInformation();
			a.loadAuditorInformation();
			a.loadCurrentAccountPeriod();
			a.loadBalanceSheetInformation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}

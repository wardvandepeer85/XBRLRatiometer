package proj.xbrlimport;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XBRLimport {
	File file;
	DocumentBuilderFactory docBuilderFactory;
	DocumentBuilder docBuilder;
	Document doc;
	
	public XBRLimport(String file) throws ParserConfigurationException,IOException, SAXException {
		File XBRLfile = new File(file);
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(XBRLfile);
		doc.getDocumentElement().normalize();
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		

		
		
	}
	
	//getters & setters
	

	
	
	//Methoden
	/**
	 * Methode om de Companyinformmatie in te laden
	 */
	public void loadCompanyInformation(){
		System.out.println("\n---------------pfs-gcd:EntityInformation----------------------------");
		
		NodeList CompanyList = doc.getElementsByTagName("pfs-gcd:EntityInformation");
		Node CompanyNode = CompanyList.item(0);
		Element CompanyElement = (Element) CompanyNode;
		System.out.println(CompanyElement.getElementsByTagName("pfs-gcd:EntityCurrentLegalName").item(0).getTextContent().trim());
		System.out.println(CompanyElement.getElementsByTagName("pfs-gcd:IdentifierValue").item(0).getTextContent());
		int entityForm = Integer.parseInt(CompanyElement.getElementsByTagName("pfs-gcd:EntityForm").item(0).getTextContent().trim());
		System.out.println(entityForm);
		System.out.println(CompanyElement.getElementsByTagName("pfs-gcd:Street").item(0).getTextContent().trim());
		int housenumber = Integer.parseInt(CompanyElement.getElementsByTagName("pfs-gcd:Number").item(0).getTextContent().trim());
		int postcode = Integer.parseInt(CompanyElement.getElementsByTagName("pfs-gcd:PostalCodeCity").item(0).getTextContent().trim());
		System.out.println(housenumber);
		System.out.println(postcode);
		System.out.println(CompanyElement.getElementsByTagName("pfs-gcd:CountryCode").item(0).getTextContent().trim());
		
	}
	
	
	/**
	 * Methode Auditorinformatie op te laden
	 */
	public void loadAuditorInformation(){	
		System.out.println("\n---------------pfs:AccountantsEntity----------------------------");

		NodeList AccountantList = doc.getElementsByTagName("pfs:AccountantsEntity");
		Node AccountantNode = AccountantList.item(0);
		Element AccountantElement = (Element) AccountantNode;
		System.out.println(AccountantElement.getElementsByTagName("pfs:ParticipantEntityName").item(0).getTextContent().trim());
		System.out.println(AccountantElement.getElementsByTagName("pfs-gcd:IdentifierValue").item(0).getTextContent());
		System.out.println(AccountantElement.getElementsByTagName("pfs-gcd:Street").item(0).getTextContent().trim());
		int Accountanthousenumber = Integer.parseInt(AccountantElement.getElementsByTagName("pfs-gcd:Number").item(0).getTextContent().trim());
		int Accountantpostcode = Integer.parseInt(AccountantElement.getElementsByTagName("pfs-gcd:PostalCodeCity").item(0).getTextContent().trim());
		System.out.println(Accountanthousenumber);
		System.out.println(Accountantpostcode);
		System.out.println(AccountantElement.getElementsByTagName("pfs-gcd:CountryCode").item(0).getTextContent().trim());
		
	}
	
	
	/**
	 * Methode om de start- en einddatum van de jaar rekening te laden
	 */
	public void loadCurrentAccountPeriod(){
		System.out.println("\n---------------pfs:PeriodsCovered----------------------------");
		
		NodeList aList = doc.getElementsByTagName("pfs:PeriodsCovered");
		Node aNode = aList.item(0);
		Element aElement = (Element) aNode;
		System.out.println(aElement.getElementsByTagName("pfs:PeriodStartDate").item(0).getTextContent());
		System.out.println(aElement.getElementsByTagName("pfs:PeriodEndDate").item(0).getTextContent());	
	}
	
	
	/**
	 * Methode om de balansposten uit het XBRL bestand op te laden
	 */
	public void loadBalanceSheetInformation(){
		System.out.println("\n---------------Balansposten----------------------------");
		
		
	}


	
}

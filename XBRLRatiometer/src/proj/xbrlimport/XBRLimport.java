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
	
	public XBRLimport(File file) throws ParserConfigurationException,IOException, SAXException {
		this.file = file;
		this.docBuilderFactory = DocumentBuilderFactory.newInstance();
		this.docBuilder = docBuilderFactory.newDocumentBuilder();
		this.doc = docBuilder.parse(file);
		doc.getDocumentElement().normalize();
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		//System.out.println(doc.getDocumentElement().getElementsByTagName("")).getTextContent());
		
	}
	
	//getters & setters
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}

	public DocumentBuilderFactory getDocBuilderFactory() {
		return docBuilderFactory;
	}
	public void setDocBuilderFactory(DocumentBuilderFactory docBuilderFactory) {
		this.docBuilderFactory = docBuilderFactory;
	}

	public DocumentBuilder getDocBuilder() {
		return docBuilder;
	}
	public void setDocBuilder(DocumentBuilder docBuilder) {
		this.docBuilder = docBuilder;
	}

	public Document getDoc() {
		return doc;
	}
	public void setDoc(Document doc) {
		this.doc = doc;
	}

	
	
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
		System.out.println(CompanyElement.getElementsByTagName("pfs-gcd:Number").item(0).getTextContent().trim());
		int postcode = Integer.parseInt(CompanyElement.getElementsByTagName("pfs-gcd:PostalCodeCity").item(0).getTextContent().trim());
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
		System.out.println(AccountantElement.getElementsByTagName("pfs-gcd:Number").item(0).getTextContent().trim());
		//int Accountanthousenumber = Integer.parseInt(AccountantElement.getElementsByTagName("pfs-gcd:Number").item(0).getTextContent().trim());
		int Accountantpostcode = Integer.parseInt(AccountantElement.getElementsByTagName("pfs-gcd:PostalCodeCity").item(0).getTextContent().trim());
		//System.out.println(Accountanthousenumber);
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
		System.out.println("3 - " + doc.getElementsByTagName("pfs:CurrentsAssets").item(0).getTextContent());
		double currentsAssets = Double.parseDouble(doc.getElementsByTagName("pfs:CurrentsAssets").item(0).getTextContent());
		
		System.out.println("10/15 - " + doc.getElementsByTagName("pfs:Equity").item(0).getTextContent());
		double equity = Double.parseDouble(doc.getElementsByTagName("pfs:Equity").item(0).getTextContent());
		
		System.out.println("13 - " + doc.getElementsByTagName("pfs:Reserves").item(0).getTextContent());
		double reserves = Double.parseDouble(doc.getElementsByTagName("pfs:Reserves").item(0).getTextContent());
		
		System.out.println("14 - " + doc.getElementsByTagName("pfs:AccumulatedProfitsLosses").item(0).getTextContent());
		double accumulatedProfitsLosses = Double.parseDouble(doc.getElementsByTagName("pfs:AccumulatedProfitsLosses").item(0).getTextContent());
		
		System.out.println("16 - " + doc.getElementsByTagName("pfs:ProvisionsDeferredTaxes").item(0).getTextContent());
		double provisionsDeferredTaxes = Double.parseDouble(doc.getElementsByTagName("pfs:ProvisionsDeferredTaxes").item(0).getTextContent());

		System.out.println("17 - " + doc.getElementsByTagName("pfs:AmountsPayableMoreOneYear").item(0).getTextContent());
		double amountsPayableMoreOneYear = Double.parseDouble(doc.getElementsByTagName("pfs:AmountsPayableMoreOneYear").item(0).getTextContent());
		
		System.out.println("20/58 - " + doc.getElementsByTagName("pfs:Assets").item(0).getTextContent());
		double assets = Double.parseDouble(doc.getElementsByTagName("pfs:Assets").item(0).getTextContent());

		System.out.println("40/41 - " + doc.getElementsByTagName("pfs:AmountsReceivableWithinOneYear").item(0).getTextContent());
		double amountsReceivableWithinOneYear = Double.parseDouble(doc.getElementsByTagName("pfs:AmountsReceivableWithinOneYear").item(0).getTextContent());

		System.out.println("42/48 - " + doc.getElementsByTagName("pfs:AmountsPayableWithinOneYear").item(0).getTextContent());
		double amountsPayableWithinOneYear = Double.parseDouble(doc.getElementsByTagName("pfs:AmountsPayableWithinOneYear").item(0).getTextContent());
		
		System.out.println("50/53 - " + doc.getElementsByTagName("pfs:CashBankHand").item(0).getTextContent());
		double cashBankHand = Double.parseDouble(doc.getElementsByTagName("pfs:CashBankHand").item(0).getTextContent());
		
		System.out.println("54/58 - " + doc.getElementsByTagName("pfs:CurrentInvestments").item(0).getTextContent());
		double currentInvestments = Double.parseDouble(doc.getElementsByTagName("pfs:CurrentInvestments").item(0).getTextContent());
		
		System.out.println("70 - " + doc.getElementsByTagName("pfs:Turnover").item(0).getTextContent());
		double turnover = Double.parseDouble(doc.getElementsByTagName("pfs:Turnover").item(0).getTextContent());
		
		System.out.println("490/1 - " + doc.getElementsByTagName("pfs:DeferredChargesAccruedIncome").item(0).getTextContent());
		double deferredChargesAccruedIncome = Double.parseDouble(doc.getElementsByTagName("pfs:DeferredChargesAccruedIncome").item(0).getTextContent());
		
		System.out.println("492/3 - " + doc.getElementsByTagName("pfs:AccruedChargesDeferredIncome").item(0).getTextContent());
		double accruedChargesDeferredIncome = Double.parseDouble(doc.getElementsByTagName("pfs:AccruedChargesDeferredIncome").item(0).getTextContent());
		
		System.out.println("650 - " + doc.getElementsByTagName("pfs:DebtCharges").item(0).getTextContent());
		double debtCharges = Double.parseDouble(doc.getElementsByTagName("pfs:DebtCharges").item(0).getTextContent());
		
		System.out.println("9902 - " + doc.getElementsByTagName("pfs:GainLossOrdinaryActivitiesBeforeTaxes").item(0).getTextContent());
		double gainLossOrdinaryActivitiesBeforeTaxes = Double.parseDouble(doc.getElementsByTagName("pfs:GainLossOrdinaryActivitiesBeforeTaxes").item(0).getTextContent());
		
		
		double gainLossPeriod = 0;
		
		  if (doc.getElementsByTagName("pfs:GainLossPeriod").item(0).getTextContent() == null){
		 
			System.out.println("9904 - " + doc.getElementsByTagName("pfs:GainLossPeriod").item(0).getTextContent());
			gainLossPeriod = Double.parseDouble(doc.getElementsByTagName("pfs:GainLossPeriod").item(0).getTextContent());
		}
	
		
			
	
	}

}


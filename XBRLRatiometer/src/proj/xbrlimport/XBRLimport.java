package proj.xbrlimport;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import proj.model.company.Auditor;
import proj.model.company.Company;

public class XBRLimport {
	File file;
	DocumentBuilderFactory docBuilderFactory;
	DocumentBuilder docBuilder;
	Document doc;

	public XBRLimport(File file) throws ParserConfigurationException,
			IOException, SAXException {
		this.file = file;
		this.docBuilderFactory = DocumentBuilderFactory.newInstance();
		this.docBuilder = docBuilderFactory.newDocumentBuilder();
		this.doc = docBuilder.parse(this.getFile());
		doc.getDocumentElement().normalize();
	}

	// getters & setters
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

	// Methoden
	/**
	 * Methode om de Companyinformatie in te laden
	 */
	public Company loadCompanyInformation() {
		//System.out.println("\n---------------pfs-gcd:EntityInformation----------------------------");

		NodeList CompanyList = doc.getElementsByTagName("pfs-gcd:EntityInformation");
		Node CompanyNode = CompanyList.item(0);
		Element CompanyElement = (Element) CompanyNode;
		
		Company entity = new Company();
		entity.setCompanyName(CompanyElement
				.getElementsByTagName("pfs-gcd:EntityCurrentLegalName").item(0)
				.getTextContent().trim());
		entity.setCompanyNumber(CompanyElement
				.getElementsByTagName("pfs-gcd:IdentifierValue").item(0)
				.getTextContent());
		
		int entityLegalForm = Integer.parseInt(CompanyElement
				.getElementsByTagName("pfs-gcd:EntityForm").item(0)
				.getTextContent().trim());
		entity.setLegalFormat(entityLegalForm);
		entity.setCompanyAddressStreet  (CompanyElement.getElementsByTagName("pfs-gcd:Street").item(0).getTextContent().trim());
		entity.setCompanyAddressHouseNumber(CompanyElement
				.getElementsByTagName("pfs-gcd:Number").item(0)
				.getTextContent().trim());
		entity.setCompanyAddressPostCode(Integer.parseInt(CompanyElement
				.getElementsByTagName("pfs-gcd:PostalCodeCity").item(0)
				.getTextContent().trim()));
		entity.setCompanyAddressCountyCode(CompanyElement
				.getElementsByTagName("pfs-gcd:CountryCode").item(0)
				.getTextContent().trim());
		
		//System.out.println(entity);
		
		return entity;
	}

	/**
	 * Methode Auditorinformatie op te laden uit het XBRL bestand
	 */
	public Auditor loadAuditorInformation() {
		//System.out.println("\n---------------pfs:AccountantsEntity----------------------------");
		
		NodeList AccountantList = doc
				.getElementsByTagName("pfs:AccountantsEntity");
		Node AccountantNode = AccountantList.item(0);
		Element AccountantElement = (Element) AccountantNode;
		Auditor auditor = new Auditor();
		
		auditor.setCompanyName(AccountantElement
				.getElementsByTagName("pfs:ParticipantEntityName").item(0)
				.getTextContent().trim());
		auditor.setCompanyNumber(AccountantElement
				.getElementsByTagName("pfs-gcd:IdentifierValue").item(0)
				.getTextContent());
		auditor.setCompanyAddressStreet  (AccountantElement
				.getElementsByTagName("pfs-gcd:Street").item(0)
				.getTextContent().trim());
		auditor.setCompanyAddressHouseNumber(AccountantElement
				.getElementsByTagName("pfs-gcd:Number").item(0)
				.getTextContent().trim());
		int Accountantpostcode = Integer.parseInt(AccountantElement
				.getElementsByTagName("pfs-gcd:PostalCodeCity").item(0)
				.getTextContent().trim());
		auditor.setCompanyAddressPostCode(Accountantpostcode);
		auditor.setCompanyAddressCountyCode(AccountantElement
				.getElementsByTagName("pfs-gcd:CountryCode").item(0)
				.getTextContent().trim());
		
		//System.out.println(auditor);
		return auditor;
	}

	/**
	 * Methode om de start- en einddatum van de jaar rekening te laden
	 * @throws ParseException 
	 * @throws DOMException 
	 */
	public Date loadAnnualAccountsDate(String annualAccountDate) throws DOMException, ParseException {
		
		NodeList aList = doc.getElementsByTagName("pfs:PeriodsCovered");
		Node aNode = aList.item(0);
		Element aElement = (Element) aNode;

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date startdate = df.parse(aElement.getElementsByTagName(annualAccountDate).item(0).getTextContent());

		return startdate;
	}
	
	
	/**
	 * Methode om de balanspost uit het XBRL bestand op te laden
	 * @param node
	 * @param balancepost
	 * @return double balanspost
	 */
	public double retrieve(String node, String balancepost) {
		if (doc.getElementsByTagName(node).getLength() == 0) {
			double balanspost = 0;
			//System.out.println( balancepost + " - " + balanspost);
			return balanspost;
		} else {
			double balanspost = Double.parseDouble(doc.getElementsByTagName(node).item(0).getTextContent());;
			//System.out.println(balancepost + " - " + doc.getElementsByTagName(node).item(0).getTextContent());
			return balanspost; 
		}

	}

}

package proj.model.company;

public class Company {
	// Attributen
	private String companyName;
	private String companyNumber;
	private int legalFormat;
	private String companyAddressStreet;
	private String companyAddressHouseNumber;
	private int companyAddressPostCode;
	private String companyAddressCountyCode;

	// Constructor
	public Company(String companyName, String companyNumber, int legalFormat,
			String companyAddressStreet, String companyAddressHouseNumber,
			int companyAddressPostCode, String companyAddressCountyCode) {
		this.companyName = companyName;
		this.companyNumber = companyNumber;
		this.legalFormat = legalFormat;
		this.companyAddressStreet = companyAddressStreet;
		this.companyAddressHouseNumber = companyAddressHouseNumber;
		this.companyAddressPostCode = companyAddressPostCode;
		this.companyAddressCountyCode = companyAddressCountyCode;
	}

	public Company() {

	}

	// Getters en setters
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public int getLegalFormat() {
		return legalFormat;
	}

	public void setLegalFormat(int legalFormat) {
		this.legalFormat = legalFormat;
	}

	public String getCompanyAddressStreet() {
		return companyAddressStreet;
	}

	public void setCompanyAddressStreet(String companyAddressStreet) {
		this.companyAddressStreet = companyAddressStreet;
	}

	public String getCompanyAddressHouseNumber() {
		return companyAddressHouseNumber;
	}

	public void setCompanyAddressHouseNumber(String companyAddressHouseNumber) {
		this.companyAddressHouseNumber = companyAddressHouseNumber;
	}

	public int getCompanyAddressPostCode() {
		return companyAddressPostCode;
	}

	public void setCompanyAddressPostCode(int companyAddressPostCode) {
		this.companyAddressPostCode = companyAddressPostCode;
	}

	public String getCompanyAddressCountyCode() {
		return companyAddressCountyCode;
	}

	public void setCompanyAddressCountyCode(String companyAddressCountyCode) {
		this.companyAddressCountyCode = companyAddressCountyCode;
	}

	// Methoden
	public String getPlaatsnaam(int postcode) {
		return "a";

	}
}

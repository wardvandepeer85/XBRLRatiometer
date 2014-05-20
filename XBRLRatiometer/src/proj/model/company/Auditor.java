package proj.model.company;

public class Auditor extends Company {
	// attributen

	// constructor
	/**
	 * Auditor constructor
	 * 
	 * @param companyName
	 * @param companyNumber
	 * @param companyAddressStreet
	 * @param companyAddressHouseNumber
	 * @param companyAddressPostCode
	 * @param companyAddressCountyCode
	 */
	public Auditor(String companyName, String companyNumber,
			String companyAddressStreet, String companyAddressHouseNumber,
			int companyAddressPostCode, String companyAddressCountyCode) {
		super(companyName, companyNumber, companyAddressStreet,
				companyAddressHouseNumber, companyAddressPostCode,
				companyAddressCountyCode);
	}

	/**
	 * Lege Auditor Constructor
	 */
	public Auditor() {

	}

	// methoden

	// toString
	@Override
	public String toString() {
		return "Auditor [getCompanyName()=" + getCompanyName()
				+ ", getCompanyNumber()=" + getCompanyNumber()
				+ ", getCompanyAddressStreet()=" + getCompanyAddressStreet()
				+ ", getCompanyAddressHouseNumber()="
				+ getCompanyAddressHouseNumber()
				+ ", getCompanyAddressPostCode()="
				+ getCompanyAddressPostCode()
				+ ", getCompanyAddressCountyCode()="
				+ getCompanyAddressCountyCode() + 
				", companyNumberCheck= " + this.checkBECompanyNumber(this.getCompanyNumber()) + "]";
	}

}

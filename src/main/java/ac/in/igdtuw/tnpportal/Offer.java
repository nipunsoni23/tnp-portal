package ac.in.igdtuw.tnpportal;

public class Offer {

	private String type;
	
	private String company;
	
	private String location;
	
	private Package package_offered;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Package getPackage_offered() {
		return package_offered;
	}

	public void setPackage_offered(Package package_offered) {
		this.package_offered = package_offered;
	}
	
}

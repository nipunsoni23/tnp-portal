package ac.in.igdtuw.tnpportal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companyDetails")
public class CompanyDetails {

	@Id
	private ObjectId _id;
	
	public String code;
	
	public String name;
	
	public Package package_offered;
	
	public Schedule schedule;
	
	public CompanyDetails() {
	}

	public CompanyDetails(ObjectId _id, String code, String name, Package package_offered, Schedule schedule) {
		super();
		this._id = _id;
		this.code = code;
		this.name = name;
		this.package_offered = package_offered;
		this.schedule = schedule;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Package getPackage_offered() {
		return package_offered;
	}

	public void setPackage_offered(Package package_offered) {
		this.package_offered = package_offered;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
}

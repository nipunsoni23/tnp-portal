package ac.in.igdtuw.tnpportal;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Students {
	
	@Id
	private ObjectId _id;
	
	private String enrollment_number;
	
	private Name name;
	
	private int batch;
	
	private int year;
	
	private String branch;
	
	private Backlog backlogs;
	
	private Percentage percentage;
	
	private ArrayList<Offer> offers;

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getEnrollment_number() {
		return enrollment_number;
	}

	public void setEnrollment_number(String enrollment_number) {
		this.enrollment_number = enrollment_number;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Backlog getBacklogs() {
		return backlogs;
	}

	public void setBacklogs(Backlog backlogs) {
		this.backlogs = backlogs;
	}

	public Percentage getPercentage() {
		return percentage;
	}

	public void setPercentage(Percentage percentage) {
		this.percentage = percentage;
	}

	public ArrayList<Offer> getOffers() {
		return offers;
	}

	public void setOffers(ArrayList<Offer> offers) {
		this.offers = offers;
	}
}

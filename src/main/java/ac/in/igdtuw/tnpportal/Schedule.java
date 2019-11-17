package ac.in.igdtuw.tnpportal;

import java.util.Date;

public class Schedule {

	public Date test;
	
	public Date ppt;
	
	public Date interview;
	
	public Schedule() {
		
	}

	public Schedule(Date test, Date ppt, Date interview) {
		super();
		this.test = test;
		this.ppt = ppt;
		this.interview = interview;
	}

	public Date getTest() {
		return test;
	}

	public void setTest(Date test) {
		this.test = test;
	}

	public Date getPpt() {
		return ppt;
	}

	public void setPpt(Date ppt) {
		this.ppt = ppt;
	}

	public Date getInterview() {
		return interview;
	}

	public void setInterview(Date interview) {
		this.interview = interview;
	}
	
}

package ac.in.igdtuw.tnpportal;

public class Package {

	public int ctc;
	
	public int in_hand;
	
	public int joining_bonus;
	
	public Package() {
		
	}

	public Package(int ctc, int in_hand, int joining_bonus) {
		super();
		this.ctc = ctc;
		this.in_hand = in_hand;
		this.joining_bonus = joining_bonus;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}

	public int getIn_hand() {
		return in_hand;
	}

	public void setIn_hand(int in_hand) {
		this.in_hand = in_hand;
	}

	public int getJoining_bonus() {
		return joining_bonus;
	}

	public void setJoining_bonus(int joining_bonus) {
		this.joining_bonus = joining_bonus;
	}
	
}

package twenty;

public class ChekingAccount extends Account {
private double overDraftlimit;


ChekingAccount(int id, double balance , double overDraft) {
	super(id, balance);
	setOverDraftlimit(overDraft);
	
}


public double getOverDraftlimit() {
	return overDraftlimit;
}


public void setOverDraftlimit(double overDraftlimit) {
	this.overDraftlimit = overDraftlimit;
}

public void withdraw(double draw) {
	if(balance + overDraftlimit >= draw ) {
		balance -=draw;
	}
}

public String toString() {
	return super.toString() + "Cheking account";
}
}

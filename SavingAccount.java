package twenty;

public class SavingAccount extends Account {
	
	public SavingAccount(int id, double balance , double overDraft) {
		super(id, balance);
	}
	public void withdraw(double draw) {
		if(balance >= draw ) {
			balance -=draw;
		}
	}
	
	public String toString() {
		return super.toString() + "Saving account";
	}

}

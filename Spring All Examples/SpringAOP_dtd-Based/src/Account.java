
public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amt) {
		balance = balance - amt;
		System.out.println("Withdraw Complted.Bal is : " + balance);
	}

	public void deposite(double amt) {
		balance = balance + amt;
		System.out.println("Deposite Complted.Bal is : " + balance);
	}
}

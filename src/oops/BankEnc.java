package oops;

public class BankEnc {
	private String holderName;
	private Long accountNumber;
	private double balance;

	void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	String getHolderName() {
		return holderName;
	}

	void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	long getAccountNumber() {
		return accountNumber;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getBlanace() {
		return balance;
	}
}

package oops;

public class ATMInterface {
	Account obj;

	public ATMInterface(Account obj) {
		this.obj = obj;
	}

	void details() {
		System.out.println("Name : " + obj.getName());
		System.out.println("Account Number : " + obj.getAccountNumber());
	}

	void menu() {
		System.out.println("\n1.UserDetails \n2.Deposite \n3.Withdraw \n4.Balance Enquiry \n5.Exit\n");
		System.out.println("Enter the option : ");
	}

	void deposite(long amount) {
		if (amount < 0) {
			System.out.println("Enter the Valid Amount !!!");
		} else {
			obj.setBalance(obj.getBalance() + amount);
			System.out.println("Deposite Successfull !!");
		}
	}

	void withdrawal(long amount) {
		if (amount > obj.getBalance()) {
			System.out.println("Insufficient Balance !!");
		} else if (amount < 0) {
			System.out.println("Enter Valid amount !!");
		} else {
			obj.setBalance(obj.getBalance() - amount);
			System.out.println("Withdrawal Successfull !!");
		}
	}

	void checkBalance() {
		System.out.println("Your Balance : " + obj.getBalance());
	}
}

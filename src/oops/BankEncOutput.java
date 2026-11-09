package oops;

public class BankEncOutput {
	public static void main(String[] args) {
		BankEnc obj1 = new BankEnc();

		obj1.setHolderName("Prasad");
		obj1.setAccountNumber(1839389202848932942l);
		obj1.setBalance(90000);

		System.out.println(obj1.getHolderName());
		System.out.println(obj1.getAccountNumber());
		System.out.println(obj1.getBlanace());
	}
}

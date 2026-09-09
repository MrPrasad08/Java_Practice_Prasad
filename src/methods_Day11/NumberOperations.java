package methods_Day11;

import java.util.Scanner;

public class NumberOperations {
	// with return type + with parameters
// Perform Operations on single multi digit number.
	int findMaxNum(int num) {
		int max = 0;
		while (num > 0) {
			int ele = num % 10;
			if (ele >= max) {
				max = ele;
			}
			num = num / 10;
		}
		System.out.println("Maximum Number : " + max);
		return max;
	}

	int findMinNum(int num) {
		int min = 9;
		while (num > 0) {
			int ele = num % 10;
			if (ele <= min) {
				min = ele;
			}
			num = num / 10;
		}
		// System.out.println("Minimum Number : " + min);
		return min;
	}

	double findAvg(int num) {
		int count = 0;
		int sum = 0;
		while (num > 0) {
			int ele = num % 10;
			sum = sum + ele;
			num = num / 10;
			count++;
		}
		double avg = (double) sum / count;
		return avg;
	}

	float findThreeSumNum(int a, float b, double c) {
		double sum = a + b + c;
		return (float) sum;
	}

	double findThreeSumNum(int a, float b, double c, char d) {
		double result = a + b + c + d;
		return result;
	}

	double findPercentage(float mainNum, int percentage) {
		double percent = (double) ((mainNum / 100) * percentage);
		return (double) percent;
	}

	double findDiscount(long amount, float discount) {
		double offer = amount * (discount / 100);
		double finalAmount = amount - offer;
		return finalAmount;
	}

	double simpleInterest(long amount, float interest, float time) {
		float SI = ((amount / 100) * interest) * time;
		return SI;
	}

	double calculateCompoundInterest(long amount, float rateOfIn, float time) {
		double CI = amount * ((1 + (rateOfIn / 100)) * time);
		return CI;
	}

	float calculateProfit(float sellPrice, float buyPrice) {
		float Profit = sellPrice - buyPrice;
		return Profit;
	}

	float calculateLoss(float buyPrice, float sellPrice) {
		float loss = buyPrice - sellPrice;
		return loss;
	}

	double fact(int n) {
		int res = 1;
		while (n > 0) {
			res = res * n;
			n = n - 1;
		}
		return res;
	}

	public static void main(String[] args) {
		NumberOperations obj = new NumberOperations();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		long num = sc.nextInt();

		System.out.println("Your Number : " + num);
		obj.findMaxNum((int) num);

		System.out.println("\n*****************************************************");
		int min = obj.findMinNum((int) num);
		System.out.println("Minimum Number : " + min);

		System.out.println("\n*****************************************************");
		float avg = (float) obj.findAvg((int) num);
		System.out.println("Average of the Number : " + avg);

		System.out.println("\n*****************************************************");
		System.out.println("Enter any four numbers : ");
		int a = sc.nextInt();
		float b = sc.nextFloat();
		double c = sc.nextDouble();

		float sum = obj.findThreeSumNum(a, b, c);
		System.out.println("Three Numbers Sum : " + sum);

		System.out.println("\n*****************************************************");
		float Csum = (float) obj.findThreeSumNum(a, b, c, 'A');
		System.out.println("Sum with Character : " + Csum);

		System.out.println("\n*****************************************************");
		System.out.println("Enter the details to find percentage : ");
		System.out.println("Enter the Number : ");
		float mainNum = sc.nextFloat();
		System.out.println("Enter percentage : ");
		int perce = sc.nextInt();

		float money = (float) obj.findPercentage(mainNum, perce);
		System.out.println(perce + "% of " + mainNum + " = " + money);

		System.out.println("\n*****************************************************");
		System.out.println("To find final price after discount ");
		System.out.println("Enter the original price : ");
		long amount = sc.nextLong();
		System.out.println("Enter the discount % :");
		float disc = sc.nextFloat();
		float offer = (float) obj.findDiscount(amount, disc);
		System.out.println("Final amount of " + amount + " with " + disc + "% : " + offer);

		System.out.println("\n*****************************************************");
		System.out.println("Calculating Interest in months : ");
		System.out.println("Enter Amount :");
		long Amount = sc.nextLong();
		System.out.println("Enter Rate of Interest : ");
		float interest = sc.nextFloat();
		System.out.println("Enter Time :");
		float time = sc.nextFloat();

		float finalAmount = (float) obj.simpleInterest(Amount, interest, time);
		System.out.println("Simple Interest of " + Amount + " with Interest " + interest + " in " + time
				+ " months is : " + finalAmount);

		System.out.println("\n*****************************************************");
		float CI = (float) obj.calculateCompoundInterest(amount, interest, time);
		System.out.println("Compound Interest of " + amount + " with interest " + interest + " in " + time + " months is : " + CI);

		System.out.println("\n*****************************************************");
		System.out.println("To Find Profit Enter Sell Price and Buy Price :");
		System.out.println("Sell Price : ");
		float sp = sc.nextFloat();
		System.out.println("Buy Price : ");
		float bp = sc.nextFloat();
		float profit = obj.calculateProfit(sp, bp);
		System.out.println("Profit : " + profit);

		System.out.println("\nTo Find Loss Enter Buy Price and Sell Price :");
		System.out.println("Buy Price : ");
		float SP = sc.nextFloat();
		System.out.println("Sell Price : ");
		float BP = sc.nextFloat();
		float loss = obj.calculateLoss(BP, SP);
		System.out.println("Loss : " + loss);

		System.out.println("\n*****************************************************");
		System.out.println("To find Factorial enter number :");
		int n = sc.nextInt();
		int fact = (int) obj.fact(n);
		System.out.println("Factorial of " + n + " is : " + fact);
		sc.close();
	}
}

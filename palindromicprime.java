package edu.schooll;

class palindromicprime {

	public palindromicprime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(2 + "\t");
		int count = 1;
		int number = 3;

		while (count < 120) {
			boolean isPalindrome = isPalindrome(number);

			if (!isPalindrome) {
				number++;
				continue;
			}

			boolean isPrime = isPrime(number);
			if (!isPrime) {
				number++;
				continue;
			}

			System.out.print(number + "\t");
			count++;
			number++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}

	}

	public static boolean isPrime(int Anumber) {
		int maxDivider = (int) Math.ceil(Math.sqrt(Anumber));
		boolean isPrime = true;
		for (int i = 2; i <= maxDivider; i++) {
			if (Anumber % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;

	}

	public static boolean isPalindrome(int Anumber) {
		int copyNumber = Anumber;
		int reversedNumber = 0;
		while (copyNumber != 0) {
			int remainder = copyNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			copyNumber /= 10;
		}

		return Anumber == reversedNumber;
	}

}

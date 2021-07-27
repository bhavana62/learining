import java.util.Scanner;

public class Prime_Factors {
	public static void main(String[] args) {
		int number;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		number = sc.nextInt();
		for (int i = 2; i <=number; i++) {
			while (number % i == 0) {
				System.out.println(i + " ");
				number = number / i;
			}

		}
		if (number > 2) {
			System.out.println(number);
		}
		 

	}
}

import java.util.*;
class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;


		while (n > 9) {
			sum = 0;
			int temp = n;

			while (temp > 0) {
				int a = temp % 10;
				sum += a;
				temp /= 10;
			}

			n = sum;
		}

		if (n == 1)
			System.out.println("It is a magic number");
		else
			System.out.println("It is not a magic number");
	}
}

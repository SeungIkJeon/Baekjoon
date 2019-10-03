import java.util.Scanner;

public class Bj04 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int result = factorial(n);
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		int m = 1;
		
		for(int i = 1; i<=n; i++) {
			m = m*i;
		}
		return m;
	}

}

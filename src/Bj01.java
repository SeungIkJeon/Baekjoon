import java.util.Scanner;

public class Bj01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int a1 = 0;
		int a2 = 0;
		
		for(int i = 1; i<=count; i++) {
			a1 = input.nextInt();
			a2 = input.nextInt();
			System.out.println("Case #"+i+": "+ a1+" +"+a2+" ="+(a1+a2));
			i++;
		}

	}

}

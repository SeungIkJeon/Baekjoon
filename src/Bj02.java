import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Bj02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for(int i=0; i<count; i++) {
			int n = input.nextInt();
			list.add(n);
		}
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
	}

}

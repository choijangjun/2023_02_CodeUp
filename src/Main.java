import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxNum1 = sc.nextInt();
		int maxNum2 = sc.nextInt();
		
		for(int i = 1; i <= maxNum1; i++) {
			for(int x = 1; x <= maxNum2; x++) {
				System.out.println(i+" "+x);
				
			}
		}

	}

}

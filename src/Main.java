import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int overSum = sc.nextInt();
		int sum = 0;
		int maxNum = 0;
		
		for (int i = 1; sum <= overSum; i++) {
			
			if (sum >= overSum) {
				break;
			}
			maxNum = i;
			sum += i;
		}
		System.out.println(maxNum);
	}

}

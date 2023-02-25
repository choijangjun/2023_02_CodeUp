import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
		int maxNum1 = sc.nextInt();
		int maxNum2 = sc.nextInt();
		
		for(int i = 1; i <= maxNum1; i++) {
			for(int x = 1; x <= maxNum2; x++) {
				System.out.println(i+" "+x);
				
=======
		int overSum = sc.nextInt();
		int sum = 0;
		int maxNum = 0;
		
		for (int i = 1; sum <= overSum; i++) {
			
			if (sum >= overSum) {
				break;
>>>>>>> b3ef92297d245288815f324a1854f96e7d6f2066
			}
			maxNum = i;
			sum += i;
		}
<<<<<<< HEAD

=======
		System.out.println(maxNum);
>>>>>>> b3ef92297d245288815f324a1854f96e7d6f2066
	}

}

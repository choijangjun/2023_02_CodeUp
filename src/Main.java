import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1~9중 정수가 하나 입력되면 일 부터 그 수까지 띄어쓰기
		// 간격으로 출력하며
		// 3, 6, 9대신 X가 출력된다.

		Scanner sc = new Scanner(System.in);

		// 정수를 하나 입력받는다. o
		int num = sc.nextInt();

		// 입력받은 정수가 나올 때 까지 일 부터 차례대로 출력한다.o
		for (int i = 1; i <= num; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.printf("X ");
			} else {
				System.out.printf(i + " ");

			}

		}

	}

}

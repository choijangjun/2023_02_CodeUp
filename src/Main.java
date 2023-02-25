import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// dan을 16진수로 받아 와야한다. o
		String dan = sc.nextLine();
		// dan을 다시 10진수로 바꾼다.o
		int num = Integer.valueOf(dan, 16);
		System.out.println(num);
				
		for (int i = 1; i <= 15; i++) {
			// 10진수 구구단 구현
			System.out.printf("%x * %x = %x\n", num, i, num * i);
			//이걸 16진수 구구단으로 바꾼다.
		}

	}

}

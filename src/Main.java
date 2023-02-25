import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] arrStr = str.split(" ");

		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
			if (arrStr[i].equals("q")) {
				break;
			}
		}
	}

}

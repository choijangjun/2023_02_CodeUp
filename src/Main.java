import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] NoT = br.readLine().split(" ");

		int sumNoT = 0;
		for (int i = 0; i < Integer.valueOf(NoT[0]); i++) {
			for (int x = 0; x < Integer.valueOf(NoT[1]); x++) {
				for (int y = 0; y < Integer.valueOf(NoT[2]); y++) {
					bw.write(i + " " + x + " " + y + "\n");
					sumNoT++;
				}
			}
		}
		bw.write(String.valueOf(sumNoT));
		bw.flush();
	}
}
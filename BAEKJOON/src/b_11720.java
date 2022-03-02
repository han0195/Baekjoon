import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		String num = br.readLine();
		
		for(int i = 0; i < N; i++) {
			int ch = num.charAt(i) - 48;
			sum += ch;
		}
		System.out.println(sum);
	}

}

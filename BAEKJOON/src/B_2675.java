import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	 // 반복회수 변수의 담기
		String[] st = new String[N]; 				 // 문자열 저장
		
		StringTokenizer t = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++) { // N 만큼 반복 하여 문자열 받기
			int c = Integer.parseInt(t.nextToken()); // 입력받을 문자의 개수를 입력받기
		}
	}

}

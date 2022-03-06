import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int N = Integer.parseInt(br.readLine()); // 반복횟수 입력받기
		String[] str_arr = new String[N]; //문자열반복한 값 저장하기위한 배열
		
		for(int i = 0; i < N; i++) {// N 반복 작업
			StringTokenizer token = new StringTokenizer(br.readLine());// 뛰어쓰기 구분
			
			int C = Integer.parseInt(token.nextToken()); //단어 반복횟수 입력받기
			String str = token.nextToken(); // 문자열 저장
			
			str_arr[i] = ""; // string 초기값 null 제거하기위해 "" 초기화
			
				for(int j = 0; j < str.length(); j++) {// 문자열 문자로 하나씩반복
					for(int s = 0; s < C; s++) {// 문자열 반복작업
						str_arr[i] += str.charAt(j); // 
					}//for j e
				}// for s e
					
		}// for i e
		
		br.close();
		
		for(String temp : str_arr) {
			System.out.printf("%s\n", temp);
		}
	}// me
}// ce

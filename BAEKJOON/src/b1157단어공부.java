package zsef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class b1157단어공부 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 문자입력받기
		br.close();
		int[] az = new int[26]; // 알파벳 개수 저장할 배열선언
		for(int i = 0; i < str.length(); i++) { // str 길이만큼 반복
			for(char a = 'a'; a <= 'z'; a++) { // a z 까지 반복
				if(str.charAt(i) == a) { // 소문자 알파벳이 같다면
					az[a - 97] += 1;	// 증가
				}
			}
			for(char A = 'A'; A <= 'Z'; A++) { // A Z 까지 반복
				if(str.charAt(i) == A) { // 대문자 알파벳이 같다면
					az[A - 65] +=1;		// 증가
				}
			}
		}
		char 답 = 0;
		int max인덱스 = -1;
		int 초기비교값 = -1;
		for(int i = 0; i < az.length; i++) {
			if(초기비교값 < az[i]) {
				초기비교값 = az[i];
				max인덱스 = i;
				답 = (char) (i + 65);
			}else if(초기비교값 == az[i]){
				max인덱스 = -1;
			}
		}
		
		if(max인덱스 == -1) {
			답 = '?';
		}else {
			답 = (char) (max인덱스 + 65);
		}
		System.out.println(답);
		
	}// 97 // 65
}

package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1712_손익분기점 {
	public static void main(String[] args) throws IOException {
		//입력객체 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 입력객체선언
		// " " 구분으로 고정비용, 가변비용, 판매가, 총 제작비용 변수 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(c <= b) {
			System.out.println(-1);
		}else {
			System.out.println((a/(c-b)) + 1);	
		}	
	}
}

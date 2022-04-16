package 브론즈;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_10809 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();

		int[] arr = new int[26]; //알파벳 배열
		int re = 0;
		//알바벳 배열에다 -1 집어넣기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		//s 변수에 저장되었있는 문자열에 위치를 arr 배열에다 집어넣기
		for(int i = 0; i < s.length(); i++) {
			//문자열을 하나씩 꺼내기 위해 문자열변수.charAt() 사용
			if(arr[s.charAt(i) - 97] > -1) {
				//arr[s.charAt(i) - 97] -= 1; 
			}else {arr[s.charAt(i) - 97] = i;}
			
		}
		//System.out.println(s.charAt(0));
		//System.out.println('b' - 96);
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

}

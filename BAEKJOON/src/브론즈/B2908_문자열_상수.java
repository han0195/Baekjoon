package 브론즈;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908_문자열_상수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//입력객체
		StringTokenizer to = new StringTokenizer(br.readLine(), " ");
		String a = to.nextToken();
		String a1 = "";
		for(int i = a.length() -1 ; i >= 0 ; i--) {
			a1 += a.charAt(i);
		}
		String b = to.nextToken();
		String b1 = "";
		for(int i = b.length() -1 ; i >= 0 ; i--) {
			b1 += b.charAt(i);
		}
		
		if(Integer.parseInt(b1) > Integer.parseInt(a1)) {
			System.out.println(b1);
		}else if(Integer.parseInt(b1) < Integer.parseInt(a1)) {
			System.out.println(a1);
		}
		
	}
}

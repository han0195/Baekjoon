package �����;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		//���ϱ� ���ؼ� ����
		int T1 = N % 10;
		int T0 = N / 10;
		
		int start_num = N;
		int temp_num = N / 10;
		
		int a = 0;
		int b= 0;
		
		while (true) {
			// �ʹ��� �ݺ����� �����°��� �����ϱ�����
			if(count > 1) {
				if(T0 == a && T1 == b) {
					break;
				}
			}
				
			a = (temp_num * 10) / 10;
			b = start_num % 10;
				
 			temp_num = start_num % 10;
			start_num = a + b;
				
			count++;
				
		}
		System.out.println(count - 1);
	}
}
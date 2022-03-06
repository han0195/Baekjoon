import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int N = Integer.parseInt(br.readLine()); // �ݺ�Ƚ�� �Է¹ޱ�
		String[] str_arr = new String[N]; //���ڿ��ݺ��� �� �����ϱ����� �迭
		
		for(int i = 0; i < N; i++) {// N �ݺ� �۾�
			StringTokenizer token = new StringTokenizer(br.readLine());// �پ�� ����
			
			int C = Integer.parseInt(token.nextToken()); //�ܾ� �ݺ�Ƚ�� �Է¹ޱ�
			String str = token.nextToken(); // ���ڿ� ����
			
			str_arr[i] = ""; // string �ʱⰪ null �����ϱ����� "" �ʱ�ȭ
			
				for(int j = 0; j < str.length(); j++) {// ���ڿ� ���ڷ� �ϳ����ݺ�
					for(int s = 0; s < C; s++) {// ���ڿ� �ݺ��۾�
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

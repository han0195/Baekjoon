import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	 // �ݺ�ȸ�� ������ ���
		String[] st = new String[N]; 				 // ���ڿ� ����
		
		StringTokenizer t = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++) { // N ��ŭ �ݺ� �Ͽ� ���ڿ� �ޱ�
			int c = Integer.parseInt(t.nextToken()); // �Է¹��� ������ ������ �Է¹ޱ�
		}
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_10809 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();

		int[] arr = new int[26]; //���ĺ� �迭
		int re = 0;
		//�˹ٺ� �迭���� -1 ����ֱ�
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		//s ������ ����Ǿ��ִ� ���ڿ��� ��ġ�� arr �迭���� ����ֱ�
		for(int i = 0; i < s.length(); i++) {
			
		}
		//System.out.println(s.charAt(0));
		//System.out.println('b' - 96);
		System.out.println(Arrays.toString(arr));
	}

}

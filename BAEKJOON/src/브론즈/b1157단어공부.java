package �����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class b1157�ܾ���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // �����Է¹ޱ�
		br.close();
		int[] az = new int[26]; // ���ĺ� ���� ������ �迭����
		for(int i = 0; i < str.length(); i++) { // str ���̸�ŭ �ݺ�
			for(char a = 'a'; a <= 'z'; a++) { // a z ���� �ݺ�
				if(str.charAt(i) == a) { // �ҹ��� ���ĺ��� ���ٸ�
					az[a - 97] += 1;	// ����
				}
			}
			for(char A = 'A'; A <= 'Z'; A++) { // A Z ���� �ݺ�
				if(str.charAt(i) == A) { // �빮�� ���ĺ��� ���ٸ�
					az[A - 65] +=1;		// ����
				}
			}
		}
		char �� = 0;
		int max�ε��� = -1;
		int �ʱ�񱳰� = -1;
		for(int i = 0; i < az.length; i++) {
			if(�ʱ�񱳰� < az[i]) {
				�ʱ�񱳰� = az[i];
				max�ε��� = i;
				�� = (char) (i + 65);
			}else if(�ʱ�񱳰� == az[i]){
				max�ε��� = -1;
			}
		}
		
		if(max�ε��� == -1) {
			�� = '?';
		}else {
			�� = (char) (max�ε��� + 65);
		}
		System.out.println(��);
		
	}// 97 // 65
}
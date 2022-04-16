package ∫Í∑–¡Ó;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		int[] an = new int[N];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
			
			for(int j = 0; j <arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					count++;
					an [i] += count;
				}else {
					count = 0;
				}
			}
			count = 0;
		}
		
		
		for(int i = 0; i < an.length; i++) {
			System.out.println(an[i]);
		}
	}

}

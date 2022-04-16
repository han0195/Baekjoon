package ∫Í∑–¡Ó;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int count = 0;
		
		int Max = 0;
		
		for (int i = 0; i < 9; i++) {		
			arr[i] = Integer.parseInt(br.readLine());
			
			if(Max < arr[i]) {
				Max = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			count++;
			if(arr[i] == Max) {
				break;
			}
		}
		System.out.println(Max);
		System.out.println(count);
	}
}

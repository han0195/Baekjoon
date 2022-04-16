package ∫Í∑–¡Ó;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2577 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		arr[0] = Integer.parseInt(br.readLine());
		arr[1] = Integer.parseInt(br.readLine());
		arr[2] = Integer.parseInt(br.readLine());
		
		int[] num_count = new int[10];
		for (int i = 0; i < num_count.length; i++) {
			num_count[i] = 0;
		}
		
		int sum = arr[0] * arr[1] * arr[2];
		String to = Integer.toString(sum);
		
		for(int i = 0; i < to.length(); i++) {
			num_count[((int) to.charAt(i)) - 48]++;
			}
		
		for(int i = 0; i < num_count.length; i++) {
			System.out.println(num_count[i]);
		}
	}

}

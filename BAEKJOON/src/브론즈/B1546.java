package ∫Í∑–¡Ó;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1546 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer t = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		int Max = 0;
		float VA = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(t.nextToken());
			if (arr[i] > Max) {
				Max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			VA += (float) arr[i] / Max * 100;
		}
		
		System.out.println(VA / N);
	}

}

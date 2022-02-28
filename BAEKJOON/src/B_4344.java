import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_4344 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double[] an = new double[N];
		
		for (int i = 0; i < N ; i++) {
			StringTokenizer t = new StringTokenizer(br.readLine());
			int [] C = new int[Integer.parseInt(t.nextToken())];
			int sum = 0;
			int count = 0;
			float Av = 0;
			
			for (int j = 0; j < C.length; j++) {
				C[j] = Integer.parseInt(t.nextToken());
			}
			
			for (int x = 0; x < C.length; x++) {
				sum += C[x];
			}
			
			Av = sum / C.length;
	
			for (int a = 0; a < C.length; a++) {
				if (C[a] > Av) {
					count++;
				}
			}
			
			an[i] = (double) count / C.length * 100.0;
		}
		for (int i = 0; i < an.length ; i++) {
			System.out.printf("%.3f%%\n",an[i]);
		}
		
	}					
}

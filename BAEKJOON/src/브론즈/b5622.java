package ∫Í∑–¡Ó;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) <= 67) {
				count += 3;
			}else if(str.charAt(i) <= 70) {
				count += 4;
			}else if(str.charAt(i) <= 73) {
				count += 5;
			}else if(str.charAt(i) <= 76) {
				count += 6;
			}else if(str.charAt(i) <= 79) {
				count += 7;
			}else if(str.charAt(i) <= 83) {
				count += 8;
			}else if(str.charAt(i) <= 86) {
				count += 9;
			}else if(str.charAt(i) <= 90) {
				count += 10;
			}
		}	
		System.out.println(count);
		
	}
}

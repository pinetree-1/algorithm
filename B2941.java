package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B2941 {
	
	public static void main(String[] args) throws IOException {
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split("");
		
		
		for(int i = 0 ; i < input.length ; i++) {
			count++;
			if(i>0&&input[i].equals("-")) {
				if(input[i-1].equals("c")||input[i-1].equals("d")) {
					count--;
				}
			}
			
			if(i>0&&input[i].equals("j")) {
				if(input[i-1].equals("l")||input[i-1].equals("n")) {
					count--;
				}
			}
			
			if(i>0&&input[i].equals("=")) {
				if(input[i-1].equals("c")||input[i-1].equals("s")) {
					count--;
				}
				
				if(input[i-1].equals("z")) {
					count--;
					if(i>1 && input[i-2].equals("d")) {
						count--;
					}
				}
				
			}
		}
		
		System.out.println(count);
	}
	

}

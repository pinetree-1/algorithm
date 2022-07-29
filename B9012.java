package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9012 {

	static int stackPointer[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		stackPointer = new int[inputNum];
		
		for(int i = 0; i<inputNum ; i++) {
			String parethesisString = br.readLine();
			String[] psArray = parethesisString.split("");
			stackPointer[i]=0;
			
			
			for(String s : psArray) {
				if(s.equals("(")) {
					stackPointer[i] += 1;
				}
				
				if(s.equals(")")) {
					stackPointer[i] -= 1;
					if(stackPointer[i]<0) {
						break;
					}
				}
			}
		}
		
		
		for(int i : stackPointer) {
			if(i==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
	
}
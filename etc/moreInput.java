package workout;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1065 {
 
	public static int N;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String input = br.readLine();

			if(input.equals("exit")) {
				break;
			}else {
				try {
					N = Integer.parseInt(input);
					int output = countHan(N);
					System.out.println(output);
					
				}catch(Exception e) {
					System.out.println("입력이 잘못됨");
				}
			}
		}
	}
	
	
}	
		
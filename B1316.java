package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1316 {
	public static int N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i=0 ; i<N ; i++) {
			if(isGroupWorld(br.readLine()))
				count++;
		}	
		System.out.println(count);
	}
	
	
	public static boolean isGroupWorld(String str) {
		String word[] = str.split("");
		ArrayList<String> groupWord = new ArrayList<>();
		groupWord.add(word[0]);
		
		for(int i = 0; i<word.length-1 ; i++) {
			if(!word[i].equals(word[i+1])) { //앞뒤 문자다르면
				
				if(groupWord.contains(word[i+1]))  //이미 나왔던 문자면
					return false;
				else 
					groupWord.add(word[i+1]);
				
			}
		}
		
		return true;
	}

}

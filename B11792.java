package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author owner
 * 자료구조 공부할때 많이 봤던 하노이
 * 막상 해보니 구현 못했다....
 * 재귀의 여지를 찾는게 포인트
 * 참고 블로그 https://shoark7.github.io/programming/algorithm/tower-of-hanoi
 */

public class B11792 {
	public static int N;
	public static int count = 0;
	static StringBuilder sb;

	
	public static void main(String[] args) throws IOException {
		sb = new StringBuilder();
		init();
		
		hanoi(N,"1","2","3");
		System.out.println(count);
		System.out.println(sb);

	}
	
	static void hanoi(int num, String start, String mid, String end) {
		count++;
		if(num==1) {
			move(start,end);
			return;
		}
		
		hanoi(num-1,start, mid, end);
		move(start, end);
		hanoi(num-1,mid, end, start);
	}
	
	static void move(String start, String end) {
		sb.append(start+" "+end+"\n");
	}
	
	static void init() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	N = Integer.parseInt(br.readLine());
	}
	
}

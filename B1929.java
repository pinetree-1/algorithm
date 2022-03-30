package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * 
 * @author owner
 * 1 <= M < =1,000,000 사이의 소수 찾기 문제 (시간제한 2초)
 * 처음엔 시간복잡도 생각안하고 풀었더니 시간초과가 났다.
 * 그걸 해결하기 위해서 시간복잡도를 공부했다. O(n), n이 1억이면 1초
 * 두개의 for문을 돌려야 하기때문에 시간복잡도는 O(n^2)
 * M보다 작은 소수 나누기 → M/2보다 작은 소수 나누기 → N의 제곱근보다 작은 소수 나누기
 * 이렇게 해서 겨우 풀었는데... 알고보니 문제가 에라토스테네스의 체 알고리즘으로 푸는거였다.
 * 맨 밑에 감명깊은 답 첨부함.
 */


public class B1929 {
	public static int N, M;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> primeNum = new ArrayList<Integer>();		
		int count = 0; // 몇번째 소수까지 나눌것인가
		
		for(int i = 2; i<=M ; i++) {
			boolean isPrimeNum = true;
				
			for(int j = 0; j <= count ; j++) {
				if(!primeNum.isEmpty() && i % primeNum.get(j) ==0) {
					isPrimeNum = false;
					break;
				}
			}
			
			if(isPrimeNum) {
				primeNum.add(i);
				if(i>=N)
					System.out.println(i);
			}
			
			if(!primeNum.isEmpty() && i >= primeNum.get(count)*primeNum.get(count))
				count++;
			
		}		
		
	}
	
}

// StringBuilder 쓰는거, init()함수 분리한거 배워야겠다..

//public class Main {
//  static int M, N;
//
//  public static void main(String[] args) throws IOException{
//      init();
//      Eratosthenes();
//  }
//
//  static void Eratosthenes(){
//      boolean[] checked = new boolean[N+1];
//      StringBuilder sb = new StringBuilder();
//      checked[1] = true;
//
//      for(int i=2; i<=(int)Math.sqrt(N); i++){
//          for(int j=i+i; j<=N; j += i) {
//              checked[j] = true;
//          }
//      }
//      for(int i=M; i<=N; i++)
//          if(!checked[i])
//              sb.append(i + "\n");
//      System.out.println(sb);
//  }
//
//  static void init() throws IOException{
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      String[] s = br.readLine().split(" ");
//      M = Integer.parseInt(s[0]);
//      N = Integer.parseInt(s[1]);
//  }
//}


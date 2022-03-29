package workout;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class B10828 {
 
	public static int N;
	public static ArrayList<Integer> stack;
	static int stackPointer = -1; 

	public static void main(String[] args) throws IOException {
		
		stack = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			String input = br.readLine();
			int pushNum = 0;
			
			if(input.contains("push")) {
				StringTokenizer st = new StringTokenizer(input); //배열에 저장하는 과정이 불필요해서 StringTokenizer 사용
				input = st.nextToken();
				pushNum = Integer.parseInt(st.nextToken());
			}
			
			switch(input) {
				case "push" :
						push(pushNum);
						break;
				case "pop" :
						System.out.println(pop());
						break;
				case "size" :
						System.out.println(size());
						break;
				case "empty" :
						System.out.println(empty());
						break;
				case "top" :
						System.out.println(top());
						break;
				default : 
						System.out.println("default 값");
						break;
			}
		}
	}
	
	
	public static void push(int x) {
		stack.add(x);
		stackPointer++;
	}
	
	public static int pop() {
		if(stack.isEmpty())
			return -1;
		else {
			int popNum = stack.get(stackPointer);
			stack.remove(stackPointer--);
			return popNum;
		}	
	}
	
	public static int size() {
		return stack.size();
	}
	
	public static int empty() {
		if(stack.isEmpty())
			return 1;
		else 
			return 0;
	}
	
	public static int top() {
		if(stack.isEmpty())
			return -1;
		else 
			return stack.get(stackPointer);
	}
	
}	
		
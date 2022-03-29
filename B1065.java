package workout;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * 
 * @author song1
 * 	--피드백--
 *	나는 함수하나에 모든 기능을 다 넣어서 만들었다.
 *	그렇게 하다보니 다른사람들과 비교헀을 때 
 *	코드 자체가 깔끔하지 못하거나 (100미만을 처리하는 부분)
 *	비효율적인 부분이 생겼다. (굳이 어레이리스트를 안써도 됐었는데..)
 *	
 *	<함수 하나에 기능 하나>
 *	까먹지 말자! 
 */


public class B1065 {
 
	public static int N;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int output = countHan(N);
		System.out.println(output);
	}
	
 
	public static int countHan(int inputNum) {
		int count = 99;
		
		if(inputNum < 100)
			return inputNum;
		else {
			for(int i = 100; i<=inputNum ; i++) {
				ArrayList<Integer> units = new ArrayList<>(); 
				boolean isHan = true;

				int gap = 0; 
				int testNum = i;
			
				
				while(testNum > 0) {
					units.add(testNum % 10);
					testNum /= 10;
				}
				
				gap = units.get(0) - units.get(1);
				
				for(int j = 0; j < units.size()-1 ; j++) {
					if(units.get(j) - gap != units.get(j+1)) {
						isHan = false;
						break;
					}
				}
				
				if(isHan)
					count++;
			}
			return count;
		}
	}
	
	// 인상깊었던 답.. (id: pplaneoo)
    static boolean isArithmeticSeq(int num) {
        int diff;
        int prevDigit;
        int currDigit;

        prevDigit = num % 10;
        num /= 10;
        diff = prevDigit - num % 10;

        while (num != 0) {
            currDigit = num % 10;
            if (diff != prevDigit - currDigit)
                return false;
            prevDigit = currDigit;
            num /= 10;
        }
        return true;
    }
	
	
}	
		
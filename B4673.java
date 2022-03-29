package baekjoon;


import java.io.IOException;
import java.util.ArrayList;

public class B4673 {
	
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> selfNum = new ArrayList<>();
		
		for(int i = 0; i < 10000 ; i++) {
			selfNum.add(findSelfNumber(i));
		}
		
		for(int i = 0; i < 10000 ; i++) {
			if(selfNum.indexOf(i) == -1) {
				//indexOf가 너무 비효율적, 어레이리스트를 처음부터 boolean으로 하는게 더 나을듯.
				System.out.println(i);
			}
		}

	}
	
	public static int findSelfNumber(int testNum) {
		int sum = testNum;
		String stringTestNum = Integer.toString(testNum);
		String[] units = stringTestNum.split("");
		
		for(String s:units) {
			int intUnits = Integer.parseInt(s);
			sum += intUnits;
		}

		/*
 		좀 더 효과적이고 수학적인 코드
		while (testNum > 0) {
            	sum = sum + (testNum % 10);
            	testNum = testNum / 10;
       		}
		 */
		
		return sum;
	}
}


/*

1. 
static 메모리 영역
-객체가 생성되기 전에 할당, 객체 생성없이 바로 접근(사용)
-메모리에 고정적으로 할당, 프로그램이 종료될 때 해제.

2.
public > protected > default > private
일반적으로 멤버필드는 private, 멤버 메서드는 public으로 선언
클래스와 생성자에 private, protected는 사용하지 않음을 권장

public : 접근을 제한이 없음 
protected : 동일한 패키지 내에 존재하거나 파생클래스에서만 접근 가능
default : 아무런 접근 제한자를 명시하지 않으면 default 값이 되며, 동일한 패키지 내에서만 접근이 가능
private : 자기 자신의 클래스 내에서만 접근이 가능
 
 */

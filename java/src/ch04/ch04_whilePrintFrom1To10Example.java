package ch04;

public class ch04_whilePrintFrom1To10Example {
	
	// 조건식이 true가 나오거나 논리연산식이 false가 나올때까지 계속 반복하는 while문
	
	public static void main(String[] args) {
		int i = 1; //정수형 int을 i으로 지정 1을 대입
		while (i<=10) { //while 가 10이 되기까지 무한반복
			System.out.println(i);  //i을 출력
			i++; // i을 출력 후 +증감식 / 반복
		}
	}

}

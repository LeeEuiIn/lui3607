package ch04;

public class ch04_ForSumFrom1To10Example {
	
	public static void main(String[] args) {
		int sum = 0; // 정수형 int을 sum으로 지정하며 값을 0으로 설정 / 합계의 변수이다.
		
		int i = 0; //정수형 int을 i으로 지정하며 값을 0으로 설정 / 카운터 변수이다.
		
		for(i=1; i<=100; i++) { //숫자 1을 100까지 증감
			
			sum += i;  // 연산식 +=을 통해 for반복문의 모든 숫자 1~100를 모두 더하여 sum에 저장
		}
		
		System.out.println(i);
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}

}

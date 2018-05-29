package ch04;

public class ch04_ForSumFrom1To100Example {
	
	public static void main(String[] args) {
		int sum = 0; //정수형 int을 sum으로 지정후 0값으로 대입한다.
		
		for(int i=1; i<+100; i++) { // for은 초기화식 , 조건식 , 증감식 으로 구성된다.
			//정수형 int을 i으로 지정하며 숫자1로 설정
			// 1부터 100까지의 숫자 범위를 지정
			// 1부터 차례대로 1씩 증감식을 지정 
			// 조건식의 100까지 숫자까지 무한 반복
			sum += i; // 연산식 +=을 통해 for반복문의 모든 숫자 1~100를 모두 더하여 sum에 저장
		}
		
		System.out.println("1~100 합 : " + sum);
		
	}
	

}

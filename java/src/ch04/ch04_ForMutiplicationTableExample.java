package ch04;

public class ch04_ForMutiplicationTableExample {
	
	public static void main(String[] args) {
		//중첩 for문
		for (int m=2; m<9; m++) { // 정수형 int을 m으로 설정 2의값을 대입 /숫자 9미만까지 지정 / 증감식
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++)//for문이 한번 실행이되면 다음 for을 실행
			System.out.println(m + " x " + n + " = " + (m*n));
			//조건식이 만족할때까지 무한 반복
		}
	}

}

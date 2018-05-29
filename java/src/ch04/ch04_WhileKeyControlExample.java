package ch04;

public class ch04_WhileKeyControlExample {
	
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0; // 합계의 변수 0 지정
		int keyCode = 0; //키보드의 키 코드값 변수 0 지정
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) { //키코드값 (캐리지리턴13) (라인피드10) 번은 제외
				System.out.println("--------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------");
				System.out.println("선택: ");
				//메뉴값 생성
			}
			
			keyCode = System.in.read(); //키보드의 키 코드값을 입는 문장
			
			if (keyCode == 49) { //숫자 1을 입력했을경우 49=1가 실행되면서 
				speed++; // ++증감식을 실행
				System.out.println("현재속도=" + speed); //증감된 숫자를 출력
				
			} else if (keyCode == 50) { //숫자 1을 입력했을경우 50=2가 실행되면서 
				speed--; //--증감식을 실행
				System.out.println("현재속도=" + speed); //증감된 숫자를 출력
				
			} else if (keyCode == 51) { //숫자 3을 입력했을경우 51=3가 실행되면서 
				run = false; // false이 실행되면서 프로그램 종료
			}
		}
		
		System.out.println("프로그램 종료");
	}
}

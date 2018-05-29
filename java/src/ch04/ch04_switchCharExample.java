package ch04;

public class ch04_switchCharExample {
	
	//영어 대소문자에 상관없이 똑같은 알파벳이라면 동일하게 처리하도록 만든 switch문 이다.
	
	public static void main(String[] args) {
		char grade = 'B'; //문자 변수 char 을 grade 라 지정 하며 B을 대입한다.
		//아래 switch문 중 에서 해당되는 알파벳 을 실행한다.
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':	
			System.out.println("일반 회원입니다.");
			break;
		  default:
			  System.out.println("손님입니다.");
		}
	}

}

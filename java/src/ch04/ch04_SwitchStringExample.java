package ch04;

public class ch04_SwitchStringExample {
	
	public static void main(String[] args) {
		String position = "과장"; 
		//String 이라는 문자열 변수를 position으로 지정하며 과장이라는 문자를 대입한다.
		//position에 해당되는 switch문을 실행한다.
		
		switch(position) {
		  case "부장":
			System.out.println("700만원");
			break;
			
		  case "과장":
				System.out.println("500만원");
				break;
				
		      default:
				System.out.println("300만원");		
		}
	}

}

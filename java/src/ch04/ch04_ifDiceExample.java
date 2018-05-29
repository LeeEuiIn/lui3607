package ch04;
//주사위의 번호를 뽑는 예제
public class ch04_ifDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1 ; // 정수형 int 타입을 num이라는 이름으로 지정
		//메소드 Math.random()는 double타입의 0.0 ~ 1.0사이의 값을 하나를 리턴 지정이 된다
		//*6을 곱하게되면 0.0~6.0까지의 수가  추가가 되며
		//(Math.random()*6) 끝에 +1를 해줄시 1.0~7.0까지 숫자가 지정된다.
		// 정수형 int 타입인 메소드 Math.random()을 지정하는데 그렇게 되면
		//double 실수형의 1.0~7.0숫자가 int정수형 1~7으로 형 변환을 시킨다.
		
		//int으로 지정이된 roandom 메소드를 int정수형 num에 대입하게 된다.
		
		  if(num==1) { //조건식 if에 num이 1일때 ==(비교) if조건문을 실행
			 System.out.println("1번이 나왔습니다.");
			 
		 } else if(num==2) { //조건식 else if에 num이 2일때 ==(비교) else if조건문을 실행
			 System.out.println("2번이 나왔습니다.");
			 
		 } else if(num==3) { //조건식 else if에 num이 3일때 ==(비교) else if조건문을 실행
			 System.out.println("3번이 나왔습니다.");
			 
		 } else if(num==4) { //조건식 else if에 num이 4일때 ==(비교) else if조건문을 실행
			 System.out.println("4번이 나왔습니다.");
			 
		 } else if(num==5) { //조건식 else if에 num이 5일때 ==(비교) else if조건문을 실행
			 System.out.println("5번이 나왔습니다.");
			 
		 } else { //위에 맞는 조건식이 없을때 이  else 조건식을 실행
			 System.out.println("6번이 나왔습니다.");
		}
	}
}

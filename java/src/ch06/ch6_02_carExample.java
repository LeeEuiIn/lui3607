package ch06;

public class ch6_02_carExample {
	
	public static void main(String[] args) {
		//Car 클래스 객체 선언
		//Car 클래스에서 선언한 필드 값을 출력해보세요.
		ch6_02_car myCar = new ch6_02_car();//myCar 객체 생성
		
		//필드값 출력
		System.out.println("car 클래스의 company 필드값 : "+ myCar.company);
		System.out.println("car 클래스의 model 필드값 : "+ myCar.model);
		System.out.println("car 클래스의 color 필드값 : "+ myCar.color);
		System.out.println("car 클래스의 maxSpeed 필드값 : "+ myCar.maxSpeed);
		System.out.println("car 클래스의 speed 필드값 : "+ myCar.speed);
		
		//필드값 변경
		/*int number=10;
		 number=30;*/
		myCar.speed=60;
		System.out.println("car 클래스의 speed 필드값 : "+ myCar.speed);
	}

}

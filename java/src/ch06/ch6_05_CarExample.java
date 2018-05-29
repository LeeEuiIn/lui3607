package ch06;
//생성자 Overloading 예제
public class ch6_05_CarExample {
	
	public static void main(String[] args) {
		//1. 기본 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_05_Car Car1 = new ch6_05_Car();
		System.out.println("car1의 cpmpany 필드값 : "+ Car1.company);
		System.out.println("car1의 model 필드값 : "+ Car1.model);
		System.out.println("car1의 color 필드값 : "+ Car1.color);
		System.out.println("car1의 maxSpeed 필드값 : "+ Car1.maxSpeed);
		System.out.println("---------------------------------------");
		//2. model 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_05_Car Car2 = new ch6_05_Car("SClass");
		System.out.println("car2의 cpmpany 필드값 : "+ Car2.company);
		System.out.println("car2의 model 필드값 : "+ Car2.model);
		System.out.println("car2의 color 필드값 : "+ Car2.color);
		System.out.println("car2의 maxSpeed 필드값 : "+ Car2.maxSpeed);
		System.out.println("---------------------------------------");
		//3. model,color 매개변수 갖는 생성자를 이용한 개체 생성하여 필드값 출력
		ch6_05_Car Car3 = new ch6_05_Car("SClass","검정색");
		System.out.println("car3의 cpmpany 필드값 : "+ Car3.company);
		System.out.println("car3의 model 필드값 : "+ Car3.model);
		System.out.println("car3의 color 필드값 : "+ Car3.color);
		System.out.println("car3의 maxSpeed 필드값 : "+ Car3.maxSpeed);
		System.out.println("---------------------------------------");
		
		
		//4. model,color, maxSpeed 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_05_Car Car4 = new ch6_05_Car("SClass","검정색",250);
		System.out.println("car4의 cpmpany 필드값 : "+ Car4.company);
		System.out.println("car4의 model 필드값 : "+ Car4.model);
		System.out.println("car4의 color 필드값 : "+ Car4.color);
		System.out.println("car4의 maxSpeed 필드값 : "+ Car4.maxSpeed);
		System.out.println("---------------------------------------");
	}

}

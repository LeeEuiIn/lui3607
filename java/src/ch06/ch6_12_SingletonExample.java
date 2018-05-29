package ch06;

public class ch6_12_SingletonExample {

	public static void main(String[] args) {
		//일반적인 객체 생성하는 방식
		ch6_12_Singleton obj2 = new ch6_12_Singleton();
		
		//싱글톤으로 선언한 클래스를 사용하는 
		ch6_12_Singleton obj1 = ch6_12_Singleton.getInstance();
		
	}
}

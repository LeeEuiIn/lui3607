package ch06;

public class ch6_06_CalculatorExample {
	
	public static void main(String[] args) {
		//Calculator 객체 생성
		ch6_06_Calculator cal = new ch6_06_Calculator();
		//powerOn 메소드 호촐
		cal.powerOn();
		
		//plus 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		int result=cal.plus(10, 20);//호출 결과는 30
		System.out.println(result);
		
		
		//divide 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		double result1=cal.divide(10, 20);
		System.out.println(result1);
		
		//powerOff 메소드 호출
		cal.powerOff();
	}
	
}


/*ch6_06_Calculator cal1 = new ch6_06_Calculator();
cal1.powerOn();
cal1.plus(10, 20);
System.out.println(cal1.plus(10, 20));
int result;
cal1.divide(10, 20);
System.out.println(cal1.divide(10, 20));
double result1;*/
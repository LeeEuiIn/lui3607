package java_Eui;

public class Ch3_SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; //result1=-100
		// +*-100 = -100
		int result2 = -x; //result2=100
		// -*-100 = 100
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		//short result3 = -s;  //컴파일 에러
		int result3 = -s;
		System.out.println("result3=" + result3);
	}
}

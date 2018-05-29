package java_Eui;

public class ch2_CastingExample {
	
	public static void main(String[] args) {
		int intValue = 44032;
		//아스키코드로 44032를 "가" 로 변환
		char charValue = (char) intValue;
		//(타입이 안맞는다 int로 타입을 변환할수없다. 크기 용량 문제 char<int)
		//intValue를 char 타입으로 강제 변환
		//char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}

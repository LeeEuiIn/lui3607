package java_Eui;

public class Ch2_OperationsPromotionExample {
//연산식에서 타입변환 예제 p.59
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = (byte) (byteValue1 + byteValue2);  //컴파일에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		char charValue3 = (char) (charValue1 + charValue2);  //컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		//ex)(char)intValue 강제 cher으로 형 변환이라는뜻
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);	
		
		//int 정수형이라 소수점은 빼고 2만 출력
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;  //컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		//double형은 실수형이라 2.5 소수점까지 출력
	}

}

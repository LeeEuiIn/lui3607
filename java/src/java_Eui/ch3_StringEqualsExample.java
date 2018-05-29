package java_Eui;

public class ch3_StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "이의인";
		String strVar2 = "이의인";
		//new 연산자 : 새로운 객체를 생성할 때 사용하는 연산자
		String strVar3 = new String("이의인");
		System.out.println( strVar1 == strVar2);
		//true
		System.out.println( strVar1 == strVar3);
		//false
		System.out.println();
		//.equals()
		System.out.println( strVar1.equals("이의인"));
		System.out.println( strVar1.equals(strVar3));
	}

}

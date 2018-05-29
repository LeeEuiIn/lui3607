package java_Eui;

public class ch4_07_SwitchCharExample {
	
	public static void main(String[] args) {
		String poistion = "과장";
		
		switch(poistion) {
		case "부장":
			System.out.println("부장 입니다.");
			break;
		case "과장":
			System.out.println("과장 입니다.");
			break;
		default:
			System.out.println("사원 입니다.");
			break;
		}
	}

}

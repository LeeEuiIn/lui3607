package ch06;
//CarExample 클래스
public class ch6_03_CarExample {
	
	public static void main(String[] args) {
	    //기본 생성자가 아닌 다른 생성자를 통해 객체 생성
	    ch6_03_Car myCar = new Ch6_03_Car("검정",300);
	  //string color="검정", int cc=300으로 필드 초기화하면서 객체 생성.
	    ch6_03_Car myCar1 = new Ch6_03_Car("빨강",2000);
	    ch6_03_Car myCar1 = new Ch6_03_Car("흰색",4500);
	    
	    ch6_03_Car myCar1 = new Ch6_03_Car("흰색");
	    
	}
}

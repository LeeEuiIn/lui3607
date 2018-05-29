package ch06;
//method overloading p.232
public class ch6_09_Calculator {
	//정사각형의 넓이를 구하는 메소드
	//메소드 이름 : areRctangle
	double height; 
	double width;
	
	
	double areRctangle(double width) {
		double area = width*width;
		return area;
	}
	//직사각형의 넓이를 구하는 메소드
	double areRctangle(double width, double height) {
		return width * height;
	}
}


//main 클래스의 실행 내용
/*
 * 객체 생성해서
 * 정사각형 넓이 구하는 메소드 호출하고 결과 출력
 * 직사각형 넓이 구하는 메소드 호출하고 결과 출력
 *
 */

/*	int areRctangle (int x) {
		int result = x*x;
		return result;
	}
	
	int areRctangle (int x, int y) {
		int  result = (x*y);
		return result;
	
}
	void execute() {
		double result = areRctangle(10,10);
		println("실행결과 : "+result);
	}

	void println(String message) {
		System.out.println(message);
}*/
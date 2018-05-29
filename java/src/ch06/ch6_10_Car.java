package ch06;

public class ch6_10_Car {
	//필드 선언
	String model;
	
	//생성자 선언
	//생성자의 이름은 클래스와 동일하게 선언
	ch6_10_Car(String model){
		//넘겨받은 매개변수 값을 혀재 필드에 저장
		this.model=model;
	}
	
	//메소드 선언
	void run()
	    for(int i=10;i<=50;i+=10) {
	    	System.out.println(this.model+"가 달립니다. (사속 : "+i+"km/");
	    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	//필드선언
		String model;
		int run;

		//메소드
		void setrun(int run) {
			this.run=run;
		}
		
		void run() {
			while(true) {
				if(run<=50) {
					System.out.println(myCar +"달립니다.");
					run += 10;
				} else {
					return;//종료의 의미
				}
			}
		}
	}
*/
package ch06;

public class ch6_05_Car {
	//필드선언
	String company ="현대자동차";
	String model;
	String color;
	String maxSpeed;
	private int maxSpeep;
	private String coler;

	//여러 종류의 생성자 선언해보기
	/*
	 * 1. 기본 생성자
	 * 2. model을 매개변수로 하는 생성자
	 * 3. model, color를 매개변수로 하는 생성자
	 * 4. model, coler, maxSpeep를 매개변수로 하는 생성자
	 * 
	 */
	//기본생성자 선언
	ch6_05_Car() {
		
	}
	
	//model을 매개변수로 하는 생성자
	/*ch6_05_Car(String m){
		model=m;
	}*/
	ch6_05_Car(String model){
		/*this.model=model;*/
		this(model,"은색",300);
		//현재 클래스에 있는 (String, String, int)형태의 생성자를 호출하여 매개값을
		//넘길 때 사용하는 this() 방법
	}
	//model, color를 매개변수로 하는 생성자
	ch6_05_Car(String model, String color){
		this.model=model;
		this.color=color;
	}
	//model, coler, maxSpeep를 매개변수로 하는 생성자
	ch6_05_Car(String model, String color, int maxSpeep){
		this.model=model;
		this.color=coler;
		this.maxSpeep=maxSpeep;
	}
	}
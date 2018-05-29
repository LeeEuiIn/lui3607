package ch04;

public class ch04_ForFloatCounterExample {
	
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) { //float타입으로는 0.1을 정확히 표현이 불가능 실제값은 0.1보다 약간큼으로 9번만 실행
			System.out.println(x);
		}
	}

}

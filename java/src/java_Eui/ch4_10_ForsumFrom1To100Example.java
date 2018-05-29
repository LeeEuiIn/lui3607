package java_Eui;

public class ch4_10_ForsumFrom1To100Example {
	
	public static void main(String[] args) {
		int sum=0;//합계를 담을 변수 sum
		
		for(int i=1; i<100; i++) {
		//1+2+3+4+5+~~~100
		//1+2=3+3=6+4=10+5=15
			sum = sum + i;
		}
		System.out.println("1~10까지의 합 : " + sum);
	}

}

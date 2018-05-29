package java_Eui;

public class ch5_06_ArrayCreateByNewExample {
	
	public static void main(String[] args) {
		int scores[]=new int[5];//총 5개의 값을 담을 수 있는 배열 변수 scores 선언
		int[] arr1 = new int[3]; {
		for(int i=0; i<3; i++) {
/*초기값확인*/ System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
/*초기값확인*/ System.out.println("arr1[" + i + "] : " + arr2[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
/*초기값확인*/ System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		}
	}

}

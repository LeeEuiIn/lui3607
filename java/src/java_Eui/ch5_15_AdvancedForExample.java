package java_Eui;

public class ch5_15_AdvancedForExample {
	
	public static void main(String[] args) {
		/*
		 * 항상된 for문 (for-each문)
		 */
		
		int[] scores= {1,2,3,4,5};
		int sum=0;
		String[] words= {"사과","배","바나나","체리","딸기","포도"};
		
		//for-each문
		//score는 반복을 위한 변수
		for(int score : scores) {
			sum = sum + score;
			System.out.print(score);
			System.out.print(" ");
			
		}
		System.out.println("합은 : " +sum);
		for(String word : words)
		System.out.print(word+" ");
	}

}

package java_Eui;

import java.util.Scanner;

public class ch5_13_ArrayExercise {
	
	public static void main(String[] args) {
		String[][] words= {
				{"chair","의자"},
				{"desk","책상"},
				{"water","불"},
				{"monitor","모니터"},
				{"mouse","마우스"}};
				
				/*Scanner scan = new Scanner(System.in);
				int conut=0;
				int num=1;
				
				for(int i=0;i<words.length;i++);
				System.out.println(words[0][0]+"뜻은 무엇인가요?");
				String answer =scan.nextInt();
				if(answer.equals(words[0][0]));
				System.out.println("정답입니다.");*/
		
		int score=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문제"+(i+1)". "+words[0][0]+"의 뜻은 무엇인가요? ");
		String answer=scan.nextLine();
		
		if(answer.equals(words[i][1])) {
			System.out.println("정답입니다.");
			score++;
			
			System.out.println("틀렸습니다.");
			System.out.println("정답은"+words[i][1]+"입니다.");
		}
		
		for(int i=0;i<words.length.);
		}
	}

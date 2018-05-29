package ch04;

public class ch04_IfNestedExample {
	
	//중첩 if문은 중첩단계가 제한이 없기 때문에 계속해서 사용이 가능하다.
	
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) +81;
		//random숫자 범위를 *20을 곱한후 +81을 더해 81~101까지의 숫자를 정의한다.
		//그후 int random값을 int score에 대입한다.
		System.out.println("점수: " + score);
		
		String grade; //문자열 인 grade을 정의한다.
		
		if(score>=90) { // 조건식 if에서 score가 90보다 크거나 같을 경우 실행한다.
			if(score>=95) { //중첩 if를 한번 더 사용해서 score>=90 조건식안에 score>=95이상의 조건식을 한번 더 적용시킨다.
				grade = "A+"; //score가 95이상이거나 같으면  점수 A+를 적용한다.
			} else { // 위 조건식 95점이 이상이 아닌 90점 이상이면 점수 A를 적용한다.
				grade = "A";
			}
			} else {
				if(score>=85) { //중첩 if를 사용하여 위 조건식 2개가 아닐시 이 else조건식을 실행한다. 
					grade = "B+"; //85점이거나 이상이면 점수 B+를 적용한다. 
				}else {
					grade = "B"; // 아무것도 해당이 안되는 상황일때 이 else 조건식을 실행한다.
			}
				
			
			System.out.println("학점: " + grade);

		}
		
	}

}
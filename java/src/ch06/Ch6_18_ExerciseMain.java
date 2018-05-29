package ch06;

public class Ch6_18_ExerciseMain {
	
	public static void main(String[] args) {
		ch6_18_Exercise stud1 = new Ch6_18_Exercise( );
		stud1.name = "선남"; //이름
		stud1.assignmentScore = 91; //과제점수
		stud1.examScore = 84; //시험점수
		//System.out.println(stud1.toString( ));
		stud1.result();
		
		ch6_18_Exercise stud2 = new Ch6_18_Exercise( );
		stud1.name = "선녀";
		stud1.assignmentScore = 86;
		stud1.examScore = 95;
		//System.out.println(stud1.toString( ));
		stud1.result();
	}

}

package ch06;

public class Ch6_19_Exercise {
	
	public static void main(String[] args) {
		//ch6_19_Exercise stud1 = new Ch6_19_Exercise("선남",91,84);
		ch6_19_Exercise stud1 = new Ch6_19_Exercise();
		stud1.name = "선남";
		stud1.assignmentScore = 91;
		stud1.examScore = 84;
		stud1.result();	
		
		ch6_18_Exercise stud2 = new Ch6_18_Exercise( );
		stud1.name = "선녀";
		stud1.assignmentScore = 86;
		stud1.examScore = 95;
		//System.out.println(stud1.toString( ));
		stud1.result();
	}

}
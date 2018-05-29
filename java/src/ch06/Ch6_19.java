package ch06;

public class Ch6_19 {
	
	//필드 선언
	private String name;
	private int assignmentScore;
	private int examScore;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAssignmentScore() {
		return assignmentScore;
	}
	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	
	public void result() {
		System.out.println("이름 : " + getName());
		System.out.println("과제 점수 : " + getName());
		System.out.println("이름 : " + getName());
		System.out.println("이름 : " + getName());
	}
}
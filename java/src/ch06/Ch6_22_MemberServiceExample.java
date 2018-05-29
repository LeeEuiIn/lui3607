package ch06;

public class Ch6_22_MemberServiceExample {
	
	public static void main(String[] args) {
		Ch6_22_MemberService memberService = new Ch6_22_MemberService;
		boolean result = meberService.login("yourid", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			meberService.logout("yourid");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
				
	}

}

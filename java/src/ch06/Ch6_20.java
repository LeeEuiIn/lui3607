package ch06;

public class Ch6_20 {

	//필드
	private String OwnerName; // 계좌의 예금주를 이름
	private int AccountNumber; // 계좌번호
	private int Balance; // 계좌의 초기 입금액

	
	

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}
	
	public void deposit(int amount){
		this.Balance-this.Balance+amount;
		
	}
	
	public void withdraw(int amount) {
		this.Balance-this.Balance-amount;
		
	}
	public void result() {
		
		System.out.println("예금주 이름 : " + getOwnerName());
		System.out.println("계좌번호 : " + getAccountNumber());
		System.out.println("잔고 :" + getBalance());
}
}
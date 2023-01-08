package mybank;

public class MyKakao extends MyBank{
	
	
	
	public MyKakao() {super();}

	public MyKakao(String name, String phoneNumber, String password, int accountMoney) {
		super(name, phoneNumber, password, accountMoney);
	}

	@Override
	public int moneyInquiry() {
		return this.accountMoney /= 2;
	}
}

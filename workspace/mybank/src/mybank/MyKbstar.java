package mybank;

public class MyKbstar extends MyBank{
	
	
	public MyKbstar() {super();}

	public MyKbstar(String name, String phoneNumber, String password, int accountMoney) {
		super(name, phoneNumber, password, accountMoney);
	}

	@Override
	public int withdraw(int accountMoney) {
		this.accountMoney = this.accountMoney - accountMoney/2;
		return this.accountMoney;
	}
}

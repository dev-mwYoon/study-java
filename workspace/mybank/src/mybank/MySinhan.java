package mybank;

public class MySinhan extends MyBank {
	
	
	
	
	public MySinhan() {super();}

	public MySinhan(String name, String phoneNumber, String password, int accountMoney) {
		super(name, phoneNumber, password, accountMoney);
	}

	@Override
	public int deposit(int accountMoney) {
		this.accountMoney = this.accountMoney - accountMoney/2;
		return this.accountMoney;
	}
	
}

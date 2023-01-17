package bank;

import java.util.Random;

public class KaKao extends Bank implements Runnable{
	
	int principal;
	int stockMoney;
	
	@Override
	public int showBalance() {
		setMoney(getMoney() / 2);
		return super.showBalance();
	}
	
//	주가
	public void stock() {
		Random random = new Random();
		int rating = random.nextInt(31); // 최대 30%
		final boolean isDecrease = random.nextInt(2) == 1;
		
		if(isDecrease) {rating *= -1;}
		
		stockMoney *= (100 + rating) * 0.01;
		
	}
	
//	매도
	public void sell() {
		setMoney(stockMoney);
		stockMoney = 0;
	}
	@Override
	public void run() {
		double rating = 0;
		int earningRate = 0;
		while (true) {
			rating = (double)stockMoney / principal;
			earningRate = (int)(rating < 1 ? rating * -100 : (rating - 1) * 100);
			
			System.out.print("▶ 평가액: " + stockMoney + "원\t\t");
			System.out.print("▶ 수익률: " + earningRate);
			
			try {Thread.sleep(3000);} catch (InterruptedException e) {break;}
		}
	}
	
	
}

package myinterfaceTest;

public class MyCat implements MyPet {

	@Override
	public void giveYourHand() {
		System.out.println("안준다.");
	}

	@Override
	public void bang() {
		System.out.println("못들은척한다.");
	}

	@Override
	public void sitDown() {
		System.out.println("무시한다.");
	}

	@Override
	public void waitNow() {
		System.out.println("안기다린다.");
	}

	@Override
	public void getNose() {
		System.out.println("하악질을한다.");
	}

}

package february2;

public abstract class NetBankingImplementation1 implements NetBanking {
	
	public void setUsername(){
		System.out.println("You can set your username");
	}
	
	public void neft(){
		System.out.println("Transfer money via neft");
	}
	
	public void electricity(){
		System.out.println("Pay your elictricity bills");
	}
	
	public void gas(){
		System.out.println("Book your gas cylinder online");
	}
	

}

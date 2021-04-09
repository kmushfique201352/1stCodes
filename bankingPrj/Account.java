package bankingPrj;

public class Account{
	public String accountName="Saving Account";

	public void showAccName(){
		System.out.println(accountName);
	}

	public static void main(String[] args){
		Account acc=new Account();
		acc.showAccName();
	}
}

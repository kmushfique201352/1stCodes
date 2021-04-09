package bankingPrj;
public class Customer{
	public String name="James Bond";

	public void name(){
		System.out.println(name);
	}

	public static void main(String[] args){
		Account acc=new Account();
		acc.showAccName();
		Customer cus=new Customer();
		cus.name();
	}
}

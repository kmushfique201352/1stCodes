public class AddNumbers{
	private int num1,num2,result;

	public AddNumbers(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void add(){
		result=num1+num2;
		System.out.println("Result="+result);
	}
	public static void main(String[] args){
		AddNumbers adnum=new AddNumbers(10,20);
		adnum.add();
	}
}

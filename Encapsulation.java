class Info{
	private String name;
	private int age;
	private double number;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}

	public void setNumber(double number){
		this.number=number;
	}
	public double getNumber(){
		return number;
	}
}

public class Encapsulation{
	public static void main(String[] args){
		Info info=new Info();
		info.setName("Khaled Md. Mushfique");
		info.setAge(22);
		info.setNumber(3.86);

		System.out.println(info.getName());
		System.out.println(info.getAge());
		System.out.println(info.getNumber());
	}
}

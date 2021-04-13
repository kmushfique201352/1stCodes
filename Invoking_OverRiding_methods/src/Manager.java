
public class Manager extends Employee{
	public String department="Engineering";
	
	public void showDetails() {
		super.showDetails();
		System.out.println(" "+department);
	}
}
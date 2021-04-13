public class Manager extends Employee{
	public String dept;
	
	public Manager(String dept) {
		super("Mahmud",50000F);
		this.dept=dept;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Department: "+dept);
	}
}

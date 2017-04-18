package prob04;

public class Depart extends Employee {

	String department;

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		super.getInformation();
		System.out.print("부서 : " + department);
	}

}

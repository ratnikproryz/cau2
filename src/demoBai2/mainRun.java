package demoBai2;

public class mainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmployee employee1 = new PartTimeEmployee("Anh", 50000, 6);
		System.out.println("Name: " + employee1.getName());
		System.out.println("Salary per day: " + employee1.calculateSalary());

		IEmployee employee2 = new FullTimeEmployee("Ngoc", 65000);
		System.out.println("Name: " + employee2.getName());
		System.out.println("Salary per day: " + employee2.calculateSalary());
	}

}

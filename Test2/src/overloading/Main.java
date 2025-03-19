package overloading;
class Employee{
	public void calSal(double salary) {
		System.out.println("Salary"+salary);
	}
	public void calSal(double salary,double tax) {
		System.out.println("Salary after tax"+(salary-tax));

	}
	public void calSal(double salary,double tax, double bonus) {
		System.out.println("Salary after tax plus bonus"+(salary-tax+bonus));

	}
}
public class Main {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.calSal(1000);
	emp.calSal(1000, 100);
	emp.calSal(1000,100,10);
}
}

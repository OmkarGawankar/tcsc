package overriding;

class Accountant{
	public void calSal(double salary) {
		System.out.println("Salary"+salary);

	}
	public void calSal(double salary,double tax) {
		System.out.println("Salary after tax"+(salary-tax));

	}
	public void calSa(double salary, double tax , double bonus) {
		System.out.println("Salary after tax plus bonus"+(salary-tax+bonus));

	}
}
class Employee extends Accountant{
	@Override
	public void calSal(double salary) {
		System.out.println("Salary"+salary);
	}
	@Override
	public void calSal(double salary, double tax) {
		System.out.println("Salary after tax"+(salary-tax));
	}
	@Override
	public void calSa(double salary, double tax, double bonus) {
		System.out.println("Salary after tax plus bonus"+(salary-tax+bonus));
	}
}
	class Manager extends Accountant{
		@Override
		public void calSal(double salary) {
			System.out.println("Salary"+salary);
		}
		@Override
		public void calSal(double salary, double tax) {
			System.out.println("Salary after tax"+(salary-tax));
		}
		@Override
		public void calSa(double salary, double tax, double bonus) {
			System.out.println("Salary after tax plus bonus"+(salary-tax+bonus));
		}
	}
public class Main {
public static void main(String[] args) {
	Accountant acc=new Accountant();
	acc.calSal(1000);
	acc.calSal(1000, 100);
	acc.calSa(1000, 100, 10);
	Employee emp=new Employee();
	emp.calSal(2000);
	emp.calSal(2000, 200);
	emp.calSa(2000, 200, 20);
	Manager mng=new Manager();
	mng.calSal(3000);
	mng.calSal(3000, 300);
}
}

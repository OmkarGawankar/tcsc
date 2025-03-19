package cons_ex;

class Employee{
	String name="Tom";
	int id=1;
	double salary=12345;
	public Employee() {
	System.out.println("Default Constructor");
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void showInfo() {
		System.out.println("Name:"+name);
		System.out.println("Id"+id);
		System.out.println("Salary"+salary);
	}
}
public class Main {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.showInfo();
	Employee emp1=new Employee();
	emp1.showInfo();
}
}

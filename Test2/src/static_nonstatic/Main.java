package static_nonstatic;
class Employee{
	String name="Tom";
	int id=1;
	double Salary=12345;
	static String cname="abc";
	static String cadd="xyz";
	public void dispInfo() {
		System.out.println("Name"+name);
		System.out.println("Id"+id);
		System.out.println("Salary"+Salary);

	}
	public static void showInfo() {
		System.out.println("Company Name"+cname);
		System.out.println("Company Address"+cadd);

	}
}
public class Main {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.dispInfo();
		Employee.showInfo();
	}
}

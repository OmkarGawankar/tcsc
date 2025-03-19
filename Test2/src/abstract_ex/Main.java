package abstract_ex;

abstract class Policy{
	static String cname="abc";
	static String cadd="xyz";
	public static void showCompanyInfo() {
		System.out.println("Company Name:"+cname);
		System.out.println("Company Address:"+cadd);
	}
	abstract void inTime(int intime);
	abstract void outTime(int outtime);
	abstract void calSal(double salary);
	public  void getLeaves(int leaves) {
		System.out.println("Leaves"+leaves);
	}
}
class Accountant extends Policy{
	@Override
	void inTime(int intime) {
		System.out.println("Acc Intime"+intime);
	}
	@Override
	void outTime(int outtime) {
		System.out.println("Acc Outtime"+outtime);
		
	}
	@Override
	void calSal(double salary) {
		System.out.println("Acc Salary"+salary);
	}
	@Override
	public void getLeaves(int leaves) {
		System.out.println("Leaves "+leaves);
	}
}
class Employee extends Policy{
	@Override
	void inTime(int intime) {
		System.out.println("Intime"+intime);
	}
	@Override
	void outTime(int outtime) {
		System.out.println("Outtime"+outtime);
		
	}
	@Override
	void calSal(double salary) {
		System.out.println("Salary"+salary);
	}
	@Override
	public void getLeaves(int leaves) {
		System.out.println("Leaves "+leaves);
	}
}
class Manager extends Policy{
	@Override
	void inTime(int intime) {
		System.out.println("intime"+intime);
		
	}
	@Override
	void outTime(int outtime) {
		System.out.println("Outtime"+outtime);
		
	}
	@Override
	void calSal(double salary) {
		System.out.println("Salary"+salary);
	}
}

public class Main {
public static void main(String[] args) {
	Accountant acc=new Accountant();
	acc.inTime(1);
	acc.outTime(4);
	acc.calSal(4000);
	Employee emp=new Employee();
	emp.inTime(2);
	emp.outTime(5);
	emp.calSal(10000);
	Manager mng =new Manager();
	mng.inTime(3);
	mng.outTime(4);
	mng.calSal(2000);
}
}

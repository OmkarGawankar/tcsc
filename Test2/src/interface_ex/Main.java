package interface_ex;

interface Policy{
	static String cname="abc";
	static String cadd="xyz";

	abstract void inTime(int intime);
	abstract void outTime(int outtime);
	abstract void calSal(double salary);
	
}
class Accountant implements Policy{
	@Override
	public void inTime(int intime) {
		System.out.println("Acc Intime"+intime);
	}
	@Override
	public void outTime(int outtime) {
		System.out.println("Acc Outtime"+outtime);
		
	}
	@Override
	public void calSal(double salary) {
		System.out.println("Acc Salary"+salary);
	}
}
class Employee implements Policy{
	@Override
	public void inTime(int intime) {
		System.out.println("Intime"+intime);
	}
	@Override
	public void outTime(int outtime) {
		System.out.println("Outtime"+outtime);
		
	}
	@Override
	public void calSal(double salary) {
		System.out.println("Salary"+salary);
	}
}
class Manager implements Policy{
	@Override
	public void inTime(int intime) {
		System.out.println("intime"+intime);
		
	}
	@Override
	public void outTime(int outtime) {
		System.out.println("Outtime"+outtime);
		
	}
	@Override
	public void calSal(double salary) {
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
	emp.calSal(3000);
	Manager mng =new Manager();
	mng.inTime(3);
	mng.outTime(4);
	mng.calSal(3000);
	System.out.println(Policy.cname);
	System.out.println(Policy.cadd);
}
}
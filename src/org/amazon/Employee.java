package org.amazon;

public class Employee extends Company {
	public Employee() {
		super("tech");
		System.out.println("Default constructor");
	}
	public Employee(String name) {
		this(8145);
		
		System.out.println("emp"+name);
	}
	
	public Employee(int id) {
	
	System.out.println("emp"+id);
	

}
	public  Employee(long no) {
		this("rake");
		System.out.println("mob"+no);
	}
	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee(25845l);
		
	}

	

}

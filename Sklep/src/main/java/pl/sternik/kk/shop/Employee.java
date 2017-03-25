package main.java.pl.sternik.kk.shop;

import java.math.BigDecimal;

public class Employee extends Person{

	private static final long serialVersionUID = -7597089908984043562L;
	BigDecimal salary;
	
	public Employee(int id, String name, BigDecimal salary) {
		super(id, name);
		this.salary = salary;
	}

	public Employee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public Employee() {
		super();
	}

	public boolean getAuthorization(){
		if(getName() != null){
			return true;
		}else{
			return false;
		}
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", getName()=" + getName() + ", getId()=" + getId() + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

package main.java.pl.sternik.kk.shop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;

public abstract class Person implements Comparable, Serializable {

	private int id;
	private String name;
	static int counter;
	transient Address address;

	public abstract boolean getAuthorization();

	Person() {
		this.id = counter();
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static int counter() {
		counter++;
		return counter;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	static public int zapiszPracObiekt(String nazwaPliku, Employee emp){
		File file = new File(nazwaPliku);
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file))){
			os.writeObject(emp);
		}catch(IOException e){
			System.out.println("Wyst¹pi³ b³¹d podczas zapisu do pliku " + nazwaPliku);
		}
		return 1;
	}
	
	public static Employee wczytajPracObiekt(String nazwaPliku){
		File file = new File(nazwaPliku);
		Employee emp = new Employee();
		try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(file))){
			emp = (Employee) is.readObject();
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException: " + e.getMessage());
		}catch(IOException e){
			System.out.println("IOException: " + e.getMessage());
		}catch(ClassNotFoundException e){
			System.out.println("ClassNotFoundException " + e.getMessage());
		}
		return emp;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(1,"Stefan", new BigDecimal("5001"));
		emp.setAddress(new Address("Cicha 11"));
		System.out.println("Z:" + emp);
		Person.zapiszPracObiekt("stefan.obj", emp);
		Employee wczytany = Person.wczytajPracObiekt("stefan.obj");
		System.out.println("W:" + wczytany);
	}

}

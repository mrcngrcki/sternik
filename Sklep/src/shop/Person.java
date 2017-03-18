package shop;

public abstract class Person {

	private int id;
	private String name;
	static int counter;
	
	public abstract boolean getAuthorization();
	
	Person(){
		this.id = counter();
	}
	
	public static int counter(){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person osobaA = new Person();
		Person osoba1 = new Employee();
	}

}

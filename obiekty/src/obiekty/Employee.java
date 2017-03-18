package obiekty;

public class Employee extends Person{

	public boolean getAuthorization(){
		if(getName() != null){
			return true;
		}else{
			return false;
		}
	}
}

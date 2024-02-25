package API_Collection;

public class Person {
	String name;
	int ID;
	
	Person(String name , int ID) {
		this.name = name;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ID=" + ID + "]";
	}
	
	
}

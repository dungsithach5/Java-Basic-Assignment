package FILE;
import java.io.*;
import java.io.Serializable;

// SERIALIZABLE
public class Person implements Serializable{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display(){
		System.out.println(name + " " + age);
	}

}

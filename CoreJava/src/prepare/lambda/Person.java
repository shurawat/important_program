package prepare.lambda;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private String email;
	private Integer age;
	private SEX sex;
	
	public Person() {
		
	}
	
	public Person(String name, String email, Integer age, SEX sex) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.sex = sex;
	}
	public enum SEX {
		MALE, FEMALE
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public SEX getSex() {
		return sex;
	}
	public void setSex(SEX sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", sex=" + sex + "]";
	}
	
	public void printPerson() {
		System.out.println(this.toString());
	}
	
	public static List<Person> generateDefaultList(){
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Shubham", "a@g.com", 30, SEX.MALE));
		people.add(new Person("neha", "n@g.com", 29, SEX.FEMALE));
		people.add(new Person("shubhika", "s@g.com", 1, SEX.FEMALE));
		people.add(new Person("mummy", "m@g.com", 56, SEX.FEMALE));
		people.add(new Person("papa", "p@g.com", 59, SEX.MALE));
		return people;	
	}
	
	
}

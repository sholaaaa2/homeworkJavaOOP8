package homework;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String maleFemale;

	public Student(String name, int age, String maleFemale) {
		super();
		this.name = name;
		this.age = age;
		this.maleFemale = maleFemale;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaleFemale() {
		return maleFemale;
	}

	public void setMaleFemale(String maleFemale) {
		this.maleFemale = maleFemale;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", maleFemale=" + maleFemale + "]";
	}

}

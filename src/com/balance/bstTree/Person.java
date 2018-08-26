package com.balance.bstTree;

public class Person implements Comparable<Person>
{

	private String name;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private int age;
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return -(age-o.age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

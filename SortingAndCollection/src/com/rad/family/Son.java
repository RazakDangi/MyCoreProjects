package com.rad.family;

import java.util.Comparator;

public abstract class Son implements Parents,Comparable<Son>{

	private String name;
	
	private int age;
	
	private String quality;
	
	private String father;
	
	private String mother;
		
	protected Son(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract String whatILike();
	
	public String hobies()
	{
		return new StringBuilder("Playing").toString();
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
	
	
	
	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	@Override
	public int compareTo(Son son) {
		int value=name.compareTo(son.name);
		if(value==0)
		{
			return age==son.getAge()?0:age>son.getAge()?1:-1;	
		}
		return value;
	}

		
	
}

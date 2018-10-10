package com.rad.family;

import java.util.Comparator;

public class Razak extends Son implements Parents ,Comparator<Son>{

	Razak(String name,int age)
	{
		super(name, age);
	}
	@Override
	public String getCharecter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String whatILike() {
		// TODO Auto-generated method stub
		return null;
	}
	/*@Override
	public int compareTo(Son o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	@Override
	public int compare(Son o1, Son o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

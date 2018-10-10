package com.rad.family;

public interface FatherInterface {

	default String getFatherColor()
	{
		return "BLACK";
	}
	
	
	
	default String getFatherInterest()
	{
		return "reading";
	}
}

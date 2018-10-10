package com.util.enums;

public enum MainClassesEnum {
	
	ONE("com.mt.one.Webmain.java"),
	TWO("com.rd.two.Main.java"),
	THREE("com.tg.three.WebMain.java"),
	FOUR("com.home.four.Main.java");
	
	String fullQClassName;

	private MainClassesEnum(String fullQClassName) {
		this.fullQClassName = fullQClassName;
	}

	public String getFullQClassName() {
		return fullQClassName;
	}

	

}

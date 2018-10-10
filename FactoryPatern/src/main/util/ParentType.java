package main.util;


import main.bo.Father;
import main.bo.Gaurdian;
import main.bo.Mother;
import main.service.Parent;

public enum ParentType {
	
	FATHER("father")
	{
		@Override
		public Parent getParent() {
			return new Father();
		}
	},
	MOTHER("mother")
	{

		@Override
		public Parent getParent() {
			return new Mother();
		}
		
	},
	GAURDIAN("gaurdin"){

		@Override
		public Parent getParent() {
			return new Gaurdian();
		}
		
	};
	private String name;
	
	public abstract Parent getParent();
	private ParentType(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

}

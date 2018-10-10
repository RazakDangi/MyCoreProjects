package main.bo;


import main.service.Parent;
import main.util.ParentType;

public class Father implements Parent{

	@Override
	public void showDetails() {
		System.out.println("I am Father");
	}

}

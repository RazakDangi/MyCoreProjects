package main.bo;


import main.service.Parent;
import main.util.ParentType;

public class Student implements Parent{

	private ParentType parentType;

	public Student(ParentType parentType) {
		super();
		this.parentType = parentType;
	}

	public ParentType getParentType() {
		return parentType;
	}

	public void setParentType(ParentType parentType) {
		this.parentType = parentType;
	}

	@Override
	public void showDetails() {
		getParentType().getParent().showDetails();
		
	}
		

}

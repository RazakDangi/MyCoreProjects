package test.main;

import main.bo.Student;
import main.util.ParentType;

public class FactroyStudent implements Factory{

	@Override
	public Student getStudent(ParentType parentType) {
	switch (parentType) {
	case FATHER: return new Student(ParentType.FATHER);
		
		
	case MOTHER:return new Student(ParentType.MOTHER);
	
	
	case GAURDIAN: return new Student(ParentType.GAURDIAN);
	
	

	default:
		break;
	}
		return null;
	}

}

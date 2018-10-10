package test.main;

import main.bo.Student;
import main.util.ParentType;

public interface Factory {

	Student getStudent(ParentType parentType);

}

/**
 * 
 */
package test.main;

import java.util.HashMap;
import java.util.Map;

import main.bo.Student;
import main.util.ParentType;

/**
 * @author m1017056
 *
 */
public abstract class TestFactoryPatern {

	/*private static final Map<String,ParentType> parentTypeMap = new HashMap<String, ParentType>();
	
	static{
		parentTypeMap.put("father", ParentType.FATHER);
		parentTypeMap.put("mother",ParentType.MOTHER);
		parentTypeMap.put("gaurdian", ParentType.GAURDIAN);
	}
	*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("using factory patern to get objets");
		
		Student student=new FactroyStudent().getStudent(ParentType.FATHER);
		
		student.showDetails();

	}

}

/**
 * 
 */
package main.bo;


import main.service.Parent;
import main.util.ParentType;

/**
 * @author m1017056
 *
 */
public class Mother implements Parent{

	@Override
	public void showDetails() {
		System.out.println("I am mother");
		
	}

}

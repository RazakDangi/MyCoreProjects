package main.reflectioncheck;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import main.singletonmodel.RazakSingleton;

public class TestReflectionForSingleton {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			//Class myClass=Class.forName("main.singletonmodel.RazakSingleton");
			Constructor constructor = null;
			try {
				constructor = RazakSingleton.class.getDeclaredConstructor(String.class,double.class);
			} catch (NoSuchMethodException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			constructor.setAccessible(true);
			
			RazakSingleton razakSingleton=RazakSingleton.getInstance();
			System.out.println("my instance"+razakSingleton);
			
				RazakSingleton reflexiveInstance = null;
				try {
					reflexiveInstance = (RazakSingleton) constructor.newInstance("Rad",55);
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("my reflexve instance"+reflexiveInstance);
	

	}

}

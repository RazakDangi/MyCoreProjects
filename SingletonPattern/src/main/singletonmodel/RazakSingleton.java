package main.singletonmodel;

import java.io.Serializable;
import java.lang.reflect.ReflectPermission;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Random;

import javax.management.ReflectionException;

/**
 * At any point in time there must be only one instance of this class.
 * 1)clone based object should return same object:yes effective
 * 2)call to getInstance in multithread also has to return same instance:yes effective
 * 3)Object serialization and de-serialization also has to return same class.:yes effective
 * 4)Use of reflection should be restricted to create instances of this class:not efective
 * We know enum is the best way to implement Singleton class ,But below code holds good for most cases.
 *  
 * @author m1017056
 *
 */
public final class RazakSingleton implements Serializable,Cloneable{

	private final String name;
	
	private static 	RazakSingleton INSTANCE= null;
	private double age;
	
	private RazakSingleton(String name, double age){
		ReflectPermission perm=new ReflectPermission("supper check","");
		AccessController.checkPermission(perm);
		this.name=name;;
		this.age =age;
	}
	
	public static RazakSingleton getInstance(){
		if(INSTANCE == null)
		{
			synchronized (RazakSingleton.class) {
				if(INSTANCE ==null)
				{
					AccessController.doPrivileged(new PrivilegedAction<Object>() {
						public Object run() {
							INSTANCE =new RazakSingleton("Razak", 26);		
							return null;
						}			
					});

					return INSTANCE;
				}
				
			}
		}
		return RazakSingleton.INSTANCE;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "RazakSingleton [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
				
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(age);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RazakSingleton other = (RazakSingleton) obj;
		if (Double.doubleToLongBits(age) != Double.doubleToLongBits(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	

}

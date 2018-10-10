package main.threadcheck;

import java.util.HashSet;
import java.util.Set;

import main.singletonmodel.RazakSingleton;

public class MyRuunable1 implements Runnable {

	public static Set<RazakSingleton> setOfInstances=new HashSet<RazakSingleton>();
	
	
	@Override
	public void run() {
		System.out.println("Started thread");
		RazakSingleton rzak= RazakSingleton.getInstance();
		setOfInstances.add(rzak);
		
		System.out.println("number of razak instances"+setOfInstances.size());
		System.out.println(rzak);
		long timeSleep=(long) (1000L* Math.random()*10d);
		try {
			Thread.sleep(timeSleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ended thread");
	
	
		
		
	}

}

package main.cloneCheck;

import java.util.HashSet;
import java.util.Set;

import main.singletonmodel.RazakSingleton;

public class TestCloneOnSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RazakSingleton razak1= RazakSingleton.getInstance();
		System.out.println("my object"+razak1);
		
		RazakSingleton razak2=(RazakSingleton)razak1.clone();
		System.out.println("my cloned object" + razak2);
		
		Set<RazakSingleton> setOfInstances=new HashSet<RazakSingleton>();
		setOfInstances.add(razak1);
		setOfInstances.add(razak2);
		
		System.out.println(setOfInstances.size());
	}

}

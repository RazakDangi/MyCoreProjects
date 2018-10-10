package com.rad.family;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSorting {

	public static void main(String[] args) {
		
		Set<Son> brothers= new HashSet<Son>();
		Imam imam=new Imam("Imamsab",27);
		Razak razak = new Razak("Razak", 26);
		Shoheb shoheb = new Shoheb("Shoheb", 24);
		Zakir zakir = new Zakir("Zakir", 22);
		Razak razakDupe= new Razak("Razak",18);
		
		brothers.add(zakir);
		brothers.add(razak);
		brothers.add(imam);
		brothers.add(shoheb);
		
		//Display as it is without sorting
		//using for each
		/*System.out.println("HashSet Display ramdmly");
		for(Son son:brothers)
		{
			
			System.out.println("------------");
			System.out.println(" name "+son.getName()+" age" +son.getAge());
			System.out.println("-------------");
		}*/
		//Add it to List and dispaly
	List<Son> brothersList= new ArrayList<Son>();
	brothersList.add(zakir);
	brothersList.add(razak);
	brothersList.add(imam);
	brothersList.add(shoheb);
	brothersList.add(razakDupe);
	System.out.println("ArrayList Display in inseration order");
	for(Son son:brothersList)
	{
		
		System.out.println("------------");
		System.out.println(" name "+son.getName()+" age" +son.getAge());
		System.out.println("-------------");
	}

	/*List<Son> linkedList = new LinkedList<Son>();
	linkedList.add(zakir);
	linkedList.add(razak);
	linkedList.add(imam);
	linkedList.add(shoheb);	
	
	System.out.println("LinkedList Display in insertion order");
	for(Son son:linkedList)
	{
		
		System.out.println("------------");
		System.out.println(" name "+son.getName()+" age" +son.getAge());
		System.out.println("-------------");
	}
	*/
	/*Collections.sort(brothersList);
	System.out.println("sort Display in age/name order");
	for(Son son:brothersList)
	{
		
		System.out.println("------------");
		System.out.println(" name "+son.getName()+" age " +son.getAge());
		System.out.println("-------------");
	}
	*/
	Set<Son> brothersSet=new TreeSet<Son>();
	brothersSet.add(zakir);
	brothersSet.add(razak);
	brothersSet.add(imam);
	brothersSet.add(shoheb);
	brothersSet.add(razakDupe);
	
	System.out.println("sort Display in TreeSet");
	for(Son son:brothersSet)
	{
		
		System.out.println("------------");
		System.out.println(" name "+son.getName()+" age " +son.getAge());
		System.out.println("-------------");
	}
	
	//sorting based Comparator first based on name if same then based on age
	
	Collections.sort(brothersList,new Comparator<Son>() {

		@Override
		public int compare(Son o1, Son o2) {
			int value=o1.getName().compareTo(o2.getName());
					if(value==0)
					{
						return o1.getAge()==o2.getAge()?0:o1.getAge()>o2.getAge()?1:-1;
					}
			return value;
		}
	});
	
	System.out.println("sort Display in age/name order");
	for(Son son:brothersList)
	{
		
		System.out.println("------------");
		System.out.println(" name "+son.getName()+" age " +son.getAge());
		System.out.println("-------------");
	}
	//TO DO :Difference between comarable and comparator interface
	
	}
}

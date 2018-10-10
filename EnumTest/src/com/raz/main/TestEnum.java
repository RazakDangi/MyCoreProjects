/**
 * 
 */
package com.raz.main;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.raz.domain.Shirt;
import com.raz.enums.Size;

/**
 * Test use of enum types
 * 
 * @author USER
 * 
 */
public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("LogToFile");
		//logger.log(Level.INFO, "application started");
		try {
			logger.addHandler(new FileHandler("log.xml"));
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Size s:Size.values())
		{
			System.out.println("size types :" +s);
		}
		
		Size size=Size.S;
		logger.info("logging into a file");
		
		Size newSize=size.increaser();
		size.descripter();

		System.out.println("new size "+newSize);
		
		Shirt shirt= new Shirt();
		shirt.setName("formal");
		shirt.setRate(200.20);
		shirt.setSize(Size.M);
		System.out.println(Size.valueOf("XL"));
		System.out.println("My shirt is "+ shirt);
	}

}

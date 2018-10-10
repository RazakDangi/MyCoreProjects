/**
 * 
 */
package com.raz.domain;

import com.raz.enums.Size;

/**
 * @author USER
 *
 */
public class Shirt {
	
	private String name;
	
	private double rate;
	
	private Size size;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * @return the size
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Size size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shirt [name=" + name + ", rate=" + rate + ", size=" + size
				+ "]";
	}
	
	

}

/**
 * 
 */
package com.raz.enums;

import com.raz.service.Increser;

/**
 * Size types available.
 * 
 * @author Razak Dangi
 * 
 */
public enum Size implements Increser{
	S(10,11,"Small"), 
	M(11,12,"Medium"),
	L(12,13,"Large"), 
	XL(13,14,"Big"),
	XXL(14,15,"Huge");
	
	private int rangeStart;
	private int rangeEnd;
	private String name;
	
	
	Size(int start,int end,String desc)
	{
		this.rangeStart=start;
		this.rangeEnd=end;
		this.name=desc;
	}
	

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



	@SuppressWarnings("static-access")
	@Override
	public Size increaser() {
		
		Size[] sizes=this.values();
		int pos=this.ordinal();
		
		if(pos<sizes.length)
			pos++;
		
		return sizes[pos];
				
	}

	public void descripter() {
		switch (this) {
		case S:System.out.println("S is short size");
						break;
         case M:System.out.println("S is medium size");
        	 break;
         case L :System.out.println("S is long size");
        	 break;
         case XL:System.out.println("S is big size");
        	 
		default:System.out.println("invlaid is short size");
			break;
		}
		
	}
}

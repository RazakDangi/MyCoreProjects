package com.wrapper;

import com.util.enums.WrapperRunEnum;

public class MainWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(WrapperRunEnum type:WrapperRunEnum.values())
		{
			type.startThread();
		}

	}

}

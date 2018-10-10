package com.util.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import javax.jws.Oneway;

import com.Runner;

public enum WrapperRunEnum {

	JVM1() {
		@Override
		public Thread startThread() {
			Thread th = new Thread(new Runner());
			th.start();
			return th;

		}

		@Override
		public Map<String, MainClassesEnum> getClasees() {
			// TODO Auto-generated method stub
			return null;
		}


	},
	JVM2() {
		@Override
		public Thread startThread() {
			Thread th = new Thread();
			th.start();
			return th;

		}

		@Override
		public Map<String, MainClassesEnum> getClasees() {
			// TODO Auto-generated method stub
			return null;
		}

	};

	private WrapperRunEnum() {

	}

	public abstract Map<String, MainClassesEnum> getClasees();

	public abstract Thread startThread();

}

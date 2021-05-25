package com.training.turkcell.basic.intf;

import com.training.turkcell.basic.Car;

public class IntfRunner {

	public static void main(final String[] args) {
		IExecute executeLoc = new ExecuteTR();
		
		//code with interface
		String strLoc = executeLoc.execute();
		System.out.println(strLoc);
		
		
		ExecuteTR executeTRLoc = new ExecuteTR();
		//code without interface
		String str2Loc = executeTRLoc.execute();
		String str3Loc = executeTRLoc.hello();
		System.out.println(str2Loc);
		System.out.println(str3Loc);

	}

}

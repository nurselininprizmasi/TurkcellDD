package com.training.turkcell.basic.intf;

import java.util.LinkedList;
import java.util.List;

public class IntfRunner {

	public static void main(final String[] args) {
		//IExecute executeLoc = new ExecuteTR();
		IExecute executeLoc = new ExecuteENG();

		//code with interface
		String strLoc = executeLoc.execute();
		System.out.println(strLoc);
		
		
		ExecuteTR executeTRLoc = new ExecuteTR();
		//code without interface
		String str2Loc = executeTRLoc.execute();
		String str3Loc = executeTRLoc.hello();
		System.out.println(str2Loc);
		System.out.println(str3Loc);

		List<String> strs = new LinkedList<>();

		strs.add("nur1");
		strs.add("nur2");
		//strs.ensureCapacity(100);

	}

}

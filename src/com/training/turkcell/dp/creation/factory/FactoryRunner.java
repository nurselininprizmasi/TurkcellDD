package com.training.turkcell.dp.creation.factory;

import java.util.Scanner;

public class FactoryRunner {
	public void run() {
		try(Scanner scannerLoc = new Scanner(System.in)) {
			IExecute executeLoc = null;
			System.out.println(ExecuteFactory.getMenu());
			
			int nextIntLoc = scannerLoc.nextInt();
			
//			switch (nextIntLoc) {
//			case 1:
//				executeLoc = new ExecuteENG();
//				break;
//			case 2:
//				executeLoc = new ExecuteTR();
//				break;
//			case 3:
//				executeLoc = new ExecuteESP();
//				break;
//			default:
//				executeLoc = new ExecuteENG();
//				break;
//			}
			executeLoc = ExecuteFactory.create(nextIntLoc);
			//polymorfic yapi
			System.out.println(executeLoc.execute());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(final String[] args) {
		FactoryRunner factoryRunnerLoc = new FactoryRunner();
		factoryRunnerLoc.run();
	}

}

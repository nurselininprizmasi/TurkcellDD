package com.training.turkcell.dp.creation.factory;

public class ExecuteFactory {
public static IExecute create(final int nextIntLoc) {
	IExecute executeLoc = null;
	switch (nextIntLoc) {
	case 1:
		executeLoc = new ExecuteENG();
		break;
	case 2:
		executeLoc = new ExecuteTR();
		break;
	case 3:
		executeLoc = new ExecuteESP();
		break;
	default:
		executeLoc = new ExecuteENG();
		break;
	}
	
	return executeLoc;
}

public static String getMenu() {
	StringBuilder builder = new StringBuilder();
	builder.append("Menu\n");
	builder.append("INGILIZCE\\n");
	builder.append("TURKCE\\n");
	builder.append("ISPANYOLCA\\n");
	builder.append("SECIMINIZ\\n?");
	
	return builder.toString();
	
}
}

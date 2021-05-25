package com.training.turkcell.dp.creation;

public class ConnectionRunner {

	public static void main(final String[] args) {
		ConnectionInfo connectionInfoLoc = new ConnectionInfo("name1", "xyz", "198.152.22.10", 1000);
		
		ConnectionInfo connectionInfoLoc2 = new ConnectionInfo("name1", "xyz", "198.152.22.10", 1000,"select 2",4000);
		
		ConnectionInfoBetter connectionInfoBetterLoc = new ConnectionInfoBetter().setName("name1")
																				.setDesc("xyz")
																				.setIp("198.152.22.10")
																				.setPort(8080)
																				.setTestStr("select 3")
																				.setConnectionTimeout(2000);


	}

}

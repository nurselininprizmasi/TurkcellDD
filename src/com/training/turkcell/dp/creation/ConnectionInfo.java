package com.training.turkcell.dp.creation;

public class ConnectionInfo {
	private final String name;
	private final String desc;
	private final String ip;
	private final int port;
	private final String testStr = "select 1";
	private final long connectionTimeout = 3000;
	
	
	public ConnectionInfo(final String name, final String desc, final String ip, final int port) {
		super();
		this.name = name;
		this.desc = desc;
		this.ip = ip;
		this.port = port;
	}
	
	
	public ConnectionInfo(final String name,
			final String desc,
			final String ip,
			final int port,
			final String testStr,
			final long connectionTimeout) {
		super();
		this.name = name;
		this.desc = desc;
		this.ip = ip;
		this.port = port;
	}




	public String getTestStr() {
		return testStr;
	}




	public long getConnectionTimeout() {
		return connectionTimeout;
	}




	public String getName() {
		return name;
	}


	public String getDesc() {
		return desc;
	}


	public String getIp() {
		return ip;
	}


	public int getPort() {
		return port;
	}
	
	
	
	

}

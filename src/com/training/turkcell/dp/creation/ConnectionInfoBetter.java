package com.training.turkcell.dp.creation;
/*mutable class*/
public class ConnectionInfoBetter {
	private  String name;
	private  String desc;
	private  String ip;
	private  int port;
	private  String testStr = "select 1";
	private  long connectionTimeout = 3000;
	
	public String getName() {
		return this.name;
	}
	public ConnectionInfoBetter setName(String name) {
		this.name = name;
		return this;
	}
	public String getDesc() {
		return this.desc;
	}
	public ConnectionInfoBetter setDesc(String desc) {
		this.desc = desc;
		return this;
	}
	public String getIp() {
		return this.ip;
	}
	public ConnectionInfoBetter setIp(String ip) {
		this.ip = ip;
		return this;
	}
	public int getPort() {
		return this.port;
	}
	public ConnectionInfoBetter setPort(int port) {
		this.port = port;
		return this;
	}
	public String getTestStr() {
		return this.testStr;
	}
	public ConnectionInfoBetter setTestStr(String testStr) {
		this.testStr = testStr;
		return this;
	}
	public long getConnectionTimeout() {
		return this.connectionTimeout;
	}
	public ConnectionInfoBetter setConnectionTimeout(long connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
		return this;
	}
	
	
	
}

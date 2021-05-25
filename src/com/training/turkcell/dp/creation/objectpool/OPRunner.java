package com.training.turkcell.dp.creation.objectpool;

public class OPRunner {

	public static void main(final String[] args) {
		ConnectionManager connectionManagerLoc = new ConnectionManager();
		for(int i = 0 ;i < 1000;i++) {
			try (Connection connectionLoc = connectionManagerLoc.getConnection()){
				System.out.println("con" + connectionLoc.getId());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}

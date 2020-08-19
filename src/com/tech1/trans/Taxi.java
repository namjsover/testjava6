package com.tech1.trans;

public class Taxi extends Trans {
	private int xDan;
	public Taxi(int cusCnt, int dis, int xDan) {
		super(cusCnt, dis);
		this.xDan=xDan;
	}
	@Override
	public int getcharge() {
		
		return cusCnt*dis*xDan;
	}

	
}

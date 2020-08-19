package com.tech1.trans;

public class Train extends Trans {
	private int tDan;
	public Train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis);
		this.tDan=tDan;
	}
	@Override
	public int getcharge() {
		return cusCnt*dis*tDan;
		
	}

}

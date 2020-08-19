package com.tech1.trans;

public abstract class Trans {
	protected int cusCnt;
	protected int dis;
	
	public Trans(int cusCnt, int dis) {
		this.cusCnt=cusCnt;
		this.dis=dis;
	}
	public abstract int getcharge();
	
	@Override
	public String toString() {
		return cusCnt+":"+dis;
	}
}

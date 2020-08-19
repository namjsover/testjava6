package com.tech1.trans;

public class Express extends Trans implements Start,End { //���ջ��
	private int eDan;
	public Express(int cusCnt, int dis, int eDan) {
		super(cusCnt, dis);
		this.eDan=eDan;
	}
	@Override
	public int getcharge() {
		
		return cusCnt*dis*eDan;
	}
	@Override
	public String getStartStation() {
		
		return "����";
	}
	@Override
	public String getEndStation() {
		
		return "�λ�";
	}
}

package com.tech3.inter_di2;

public class CoffeeTest {
	public static void main(String[] args) {
//		Coffee co=new Coffee();//Ŀ���� ������ ȣ��
		HotAmericano hot=new HotAmericano();
		IceAmericano ice=new IceAmericano();
		Coffee co=new Coffee(ice);
		
		co.coffeeType();
		
	}
	
}

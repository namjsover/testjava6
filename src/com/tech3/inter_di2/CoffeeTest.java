package com.tech3.inter_di2;

public class CoffeeTest {
	public static void main(String[] args) {
//		Coffee co=new Coffee();//커피의 생성자 호출
		HotAmericano hot=new HotAmericano();
		IceAmericano ice=new IceAmericano();
		Coffee co=new Coffee(ice);
		
		co.coffeeType();
		
	}
	
}

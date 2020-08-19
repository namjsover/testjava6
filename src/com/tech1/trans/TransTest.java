package com.tech1.trans;

public class TransTest {
	public static void printCharge(Trans tran) {
		System.out.println("=============");
		System.out.println(tran);
		System.out.println("-------------");
		System.out.println("지불금액 : "+tran.getcharge()+"원");
		System.out.println("-------------");
	}
	public static void main(String[] args) {
		Trans tr[]=new Trans[4];
		tr[0]=new Train(5,100,200);
		tr[1]=new Express(10,100,100);
		tr[2]=new Taxi(2,10,500);
		tr[3]=new Train(1,100,200);
		//for each문
		for (Trans tran : tr) {
			printCharge(tran);
			
		}
//		for문
//		for (int i = 0; i < tr.length; i++) {
//			printCharge(tr[i]);
//		}
		Express ex=new Express(1, 10, 500);
		System.out.println(ex.getStartStation());
		System.out.println(ex.getEndStation());
	}
}

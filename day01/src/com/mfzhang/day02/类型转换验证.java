/**
 * 
 * @author mingfei.z 2018年11月23日 下午5:26:58
 */
package com.mfzhang.day02;

/**
 * 
 * @author mingfei.z
 */
public class 类型转换验证 {

	public static void main(String[] args) {
		byte b1 = 12;
		long l1 = b1;
		System.out.println("l1: " + l1);
		
		long l2 = 10;
		byte b2 = (byte) l2;
		System.out.println("b2: " + b2);
		
		long l3 = 1242424252534533229l;
		byte b3 = (byte) l3;
		System.out.println("b3: " + b3);
		
		long l4 = 124242425l;
		byte b4 = (byte) l4;
		System.out.println("b4: " + b4);
		
		double d1 = 1114242424;
		long l5 = (long) d1;
		System.out.println("l5: " + l5);
		
		double d2 = 1114242424.324242242;
		long l6 = (long) d2;
		System.out.println("l6: " + l6);
	}
	
}

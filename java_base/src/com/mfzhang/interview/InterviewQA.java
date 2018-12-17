/**
 * 
 * @author mingfei.z 2018年12月17日 下午4:54:06
 */
package com.mfzhang.interview;

/**
 * 
 * @author mingfei.z
 */
public class InterviewQA {

	public static void main(String[] args) {
		qa1();
		System.out.println("****************");
		qa2();
	}
	
	/**
	 * 左移、右移正数、负数
	 * 
	 * @author mingfei.z
	 */
	private static void qa2() {
		int a = 12;
		int b = -12;
		
		System.out.println("a binary: " + Integer.toBinaryString(a));
		System.out.println("a << 2: " + (a << 2));
		System.out.println("a << 2 binary: " + Integer.toBinaryString(a << 2));
		System.out.println("b binary: " + Integer.toBinaryString(b));
		System.out.println("b << 2: " + (b << 2));
		System.out.println("b << 2 binary: " + Integer.toBinaryString(b << 2));

		System.out.println("==============");
		
		System.out.println("a binary: " + Integer.toBinaryString(a));
		System.out.println("a >> 2: " + (a >> 2));
		System.out.println("a >> 2 binary: " + Integer.toBinaryString(a >> 2));
		System.out.println("b binary: " + Integer.toBinaryString(b));
		System.out.println("b >> 2: " + (b >> 2));
		System.out.println("b >> 2 binary: " + Integer.toBinaryString(b >> 2));
		System.out.println("128 >>> 2: " + (128 >>> 2));
		System.out.println("128 >>> 2 binary: " + Integer.toBinaryString(128 >>> 2));
		System.out.println("-128 >>> 2: " + (-128 >>> 2));
		System.out.println("-128 >>> 2 binary: " + Integer.toBinaryString(-128 >>> 2));
	}
	
	/**
	 * 一组整数，除了一个只出现一次以外，其他每个整数都恰好出现三次，要寻找那个特殊的整数。
	 * 
	 * @author mingfei.z
	 */
	private static void qa1() {
		int[] iArr = {23,67,2425,4463,88,12};
		
		int total = 0;
	    for (int a : iArr) {
	    	System.out.println("a: " + Integer.toBinaryString(a));
	    	total ^= a;
	    	System.out.println("total: " + Integer.toBinaryString(total));
	    }
	    
	    System.out.println(total);
	    
	    System.out.println("=======================");
	    
	    
	}

}

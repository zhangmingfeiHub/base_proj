/**
 * 
 * @author mingfei.z 2018年11月22日 下午1:58:59
 */
package com.mfzhang.day01;

/**
 * 
 * @author mingfei.z
 */
public class 验证整型 {

	public static void main(String[] args) {
		System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE); // 1字节
		System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
		System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE);// 2字节 3万
		System.out.println("Short.MAX_VALUE: " + Short.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE); // 4字节 20亿
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE); // 8字节 9亿兆
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
		
		
		long val = 1;
		long val2 = 1l;
		long val3 = 1L;
		long val4 = 10000000000l;
		System.out.println(String.valueOf(val));
		System.out.println(String.valueOf(val2));
		System.out.println(String.valueOf(val3));
		System.out.println(String.valueOf(val4));
		
		// 十六进制 0x | 0X 开头
		long val5 = 0x111;
		System.out.println(String.valueOf(val5));
		System.out.println(0x112);
		
		// 八进制 0 开头
		System.out.println(011);
		
		// 二进制 0b | 0B
		System.out.println(0b11);
		System.out.println(0b1_1);
//		System.out.println(0b123);
		System.out.println(0b1_111_000); // Java 编译器会去除这些下划线
		System.out.println(0b11100);
		System.out.println(0b1_1_10_0);
		
		// Java 编译器会去除这些下划线
		System.out.println(1_1_33_22);
		System.out.println(1_888_111_000);
		System.out.println(1_888_111_000l);
		System.out.println(1_888_111_0000000000L);
		System.out.println(0x112);
		System.out.println(0x1_1_2);
		System.out.println(0111);
		System.out.println(01_11);
		
		short s1 = 1;
		short s2 = 2_2;
		byte b1 = 2;
		byte b2 = 2_0;
		byte b3 = (byte) 2_00;
	}
	
}

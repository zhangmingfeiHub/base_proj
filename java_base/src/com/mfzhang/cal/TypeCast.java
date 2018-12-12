/**
 * 
 * @author mingfei.z 2018年12月12日 上午11:16:58
 */
package com.mfzhang.cal;

/**
 * 
 * @author mingfei.z
 */
public class TypeCast {

	/**
	 * •如果两个操作数中有一个是double 类型， 另一个操作数就会转换为double 类型。
	   •否则， 如果其中一个操作数是float 类型， 另一个操作数将会转换为float 类型。
	   •否则， 如果其中一个操作数是long 类型， 另一个操作数将会转换为long 类型。
	   •否则， 两个操作数都将被转换为int 类型。
	 * 
	 * @param args
	 * @author mingfei.z
	 */
	public static void main(String[] args) {
		// byte > short > int > long 向上转
		byte b = 127;
		short s = 127;
		int i = 127;
		long l = 127;
		
		// byte short char 类型相加，两个加数都会转为int类型
		int bsresult = (b + s);
		int biresult = (b + i);
		long blresult = (b + l);
		
		char c = 'A';
		int cbresult = (c + b);
		System.out.println(cbresult);
		
		double ldresult = (1L + 10.2);
		
		
		
		char c2 = Character.MAX_VALUE - 100;
		System.out.println(c2);
		
		long l2 = (long)10.9d;
		System.out.println(l2);
		int l3 = (int)10.9d;
		System.out.println(l3);
	}

}

/**
 * 
 * @author mingfei.z 2018年11月23日 下午4:40:04
 */
package com.mfzhang.day02;

/**
 * 
 * @author mingfei.z
 */
public class 变量 {

	private static int b;
	private int c;
	
	public static void main(String[] args) {
		int $abc = 1;
		int abc = 2;
		int _abc = 3;
		int _abc中文 = 4;
		int 中文在前_abc323 = 5;
		int _Abc中文 = 6;
		System.out.println($abc);
		System.out.println(abc);
		System.out.println(_abc);
		System.out.println(_abc中文);
		System.out.println(中文在前_abc323);
		System.out.println(_Abc中文);
		
		// 判断哪些Unicode 字符属于Java 中的“ 字母”
		System.out.println(Character.isJavaIdentifierPart('中'));
		System.out.println(Character.isJavaIdentifierStart('中'));
		System.out.println(Character.isJavaIdentifierPart('$'));
		System.out.println(Character.isJavaIdentifierStart('$'));
		System.out.println(Character.isJavaIdentifierPart('&'));
		System.out.println(Character.isJavaIdentifierStart('&'));
		
		// 变量必须初始化？
		int a = 0;
		System.out.println(a);
		System.out.println(b);
		
		变量 变量 = new 变量();
		System.out.println(变量.c);
		
		final int D = 12;
		System.out.println(D);
//		D = 13; // 编译报错
	}
	
}

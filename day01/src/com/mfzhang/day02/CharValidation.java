/**
 * 
 * @author mingfei.z 2018年11月23日 下午3:04:49
 */
package com.mfzhang.day02;

/**
 * 
 * @author mingfei.z
 */
public class CharValidation {

	public static void main(String[] args) {
//		char c1 = ''; // 报错，需包含字符
//		char c2 = 'ad'; // 报错，只能包含一个字符
		char c3 = ';';
		System.out.println("c3: " + c3);
		System.out.println("c3+1: " + (c3 + 1));
		
		char c4 = '\u2122';
		char c5 = '\u03C0';
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("\u00A0 is newline");
	}
	
}

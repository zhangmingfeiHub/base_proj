/**
 * 
 * @author mingfei.z 2018年12月12日 下午1:41:06
 */
package com.mfzhang.cal;

/**
 * 
 * @author mingfei.z
 */
public class Calculate {

	public static void main(String[] args) {
		cal1();
		
		System.out.println("=============================");
		
		cal2();

		System.out.println("=============================");
		
		cal3();

		System.out.println("=============================");
		
		cal4();

		System.out.println("=============================");
		
		cal5();

		System.out.println("=============================");
		
		cal6();

		System.out.println("=============================");
		
		cal7();
	}
	
	/**
	 * 异或
	 * 
	 * @author mingfei.z
	 */
	private static void cal7() {
		System.out.println("235 binary: " + Integer.toBinaryString(235));
		System.out.println("1 ^ 235: " + (1 ^ 235));
		System.out.println("1 ^ 235 binary: " + Integer.toBinaryString(1 ^ 235));
		System.out.println("236 binary: " + Integer.toBinaryString(236));
		System.out.println("1 ^ 236: " + (1 ^ 236));
		System.out.println("1 ^ 236 binary: " + Integer.toBinaryString(1 ^ 236));
	}
	
	private static void cal6() {
		int a = 3, b = 5;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a binary: " + Integer.toBinaryString(a));
		System.out.println("b binary: " + Integer.toBinaryString(b));
		int c = a ^ b;
		System.out.println("c = a ^ b binary: " + Integer.toBinaryString(c));
		a = c ^ a;
		b = c ^ b;
		System.out.println("变量值反转：a = " + a + ", b = " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("变量值反转：a = " + a + ", b = " + b);
	}
	
	/**
	 * 位移运算符分：
	 * 1、逻辑运算符，& | ^ ~；
	 * 2、移位运算符，>> << >>>；
	 * 
	 * 左移<<，有符号右移>>，无符号右移>>>
	 * 
	 * @author mingfei.z
	 */
	private static void cal5() {
		int a = 25; // 
		System.out.println("a: " + Integer.toBinaryString(a));
		int b = (a & 0b1000) / 0b1000;
		System.out.println("b: " + b);
		
		int c = 21 << 3;
		System.out.println("c = 21 << 3: " + c);
		System.out.println("21 binary: " + Integer.toBinaryString(21));
		System.out.println("c binary: " + Integer.toBinaryString(c));
		
		System.out.println("2 binary: " + Integer.toBinaryString(2));
		System.out.println("2 << 5: " + (2 << 5));
		System.out.println("2 << 5 binary: " + Integer.toBinaryString(2 << 5));

		System.out.println("2 binary: " + Integer.toBinaryString(2));
		System.out.println("2 << 35: " + (2 << 35));
		System.out.println("2 << 35 binary: " + Integer.toBinaryString(2 << 35));

		System.out.println("2 binary: " + Integer.toBinaryString(2));
		System.out.println("2 << 32: " + (2 << 32));
		System.out.println("2 << 32 binary: " + Integer.toBinaryString(2 << 32));

		System.out.println("2 binary: " + Integer.toBinaryString(2));
		System.out.println("2 << 30: " + (2 << 30));
		System.out.println("2 << 30 binary: " + Integer.toBinaryString(2 << 30));

		System.out.println("2 binary: " + Integer.toBinaryString(2));
		System.out.println("2 << 29: " + (2 << 29));
		System.out.println("2 << 29 binary: " + Integer.toBinaryString(2 << 29));
		
		System.out.println("****************-----------------**********");
		
		System.out.println("268 binary: " + Integer.toBinaryString(268));
		System.out.println("268 >> 2: " + (268 >> 2));
		System.out.println("268 >> 2 binary: " + Integer.toBinaryString(268 >> 2));

		System.out.println("64 binary: " + Integer.toBinaryString(64));
		System.out.println("64 >> 2: " + (64 >> 2));
		System.out.println("64 >> 2 binary: " + Integer.toBinaryString(64 >> 2));
		

		System.out.println("64 binary: " + Integer.toBinaryString(64));
		System.out.println("64 >>> 2: " + (64 >>> 2));
		System.out.println("64 >>> 2 binary: " + Integer.toBinaryString(64 >>> 2));

		System.out.println("-64 binary: " + Integer.toBinaryString(-64));
		System.out.println("-64 >>> 2: " + (-64 >>> 2));
		System.out.println("-64 >>> 2 binary: " + Integer.toBinaryString(-64 >>> 2));

		System.out.println("****************-----------------**********");
		
		System.out.println("236 binary: " + Integer.toBinaryString(236));
		System.out.println("236 >> 1: " + (236 >> 1));
		System.out.println("236 >> 1 binary: " + Integer.toBinaryString(236 >> 1));

		System.out.println("****************-----------------**********");
		
		System.out.println("236 binary: " + Integer.toBinaryString(236));
		System.out.println("236 >> 2: " + (236 >> 2));
		System.out.println("236 >> 2 binary: " + Integer.toBinaryString(236 >> 2));

		System.out.println("****************-----------------**********");
		
		System.out.println("236 binary: " + Integer.toBinaryString(236));
		System.out.println("236 >> 3: " + (236 >> 3));
		System.out.println("236 >> 3 binary: " + Integer.toBinaryString(236 >> 3));

		System.out.println("****************-----------------**********");
		
		System.out.println("236 binary: " + Integer.toBinaryString(236));
		System.out.println("236 << 1: " + (236 << 1));
		System.out.println("236 << 1 binary: " + Integer.toBinaryString(236 << 1));

		System.out.println("****************-----------------**********");
		
		System.out.println("236 binary: " + Integer.toBinaryString(236));
		System.out.println("236 << 2: " + (236 << 2));
		System.out.println("236 << 2 binary: " + Integer.toBinaryString(236 << 2));
	}
	
	/**
	 * 按位与 &: 只要有一个为0，则为0；
	 * 按位或 |: 只要有一个为1，则为1；
	 * 按位异或 ^: 相同为0，不同为1；
	 * 按位取反~: 非，即取反；
	 * 
	 * 在Java语言中，二进制数使用补码表示(32位)，最高位为符号位，正数的符号位为0，负数为1；
	 * (1)正数的最高位为0，其余各位代表数值本身(二进制数)。 　
	 *  	如：22，即10110
	 * (2)对于负数，通过对该数绝对值的补码按位取反，再对整个数加1。
	 *  	如：-33，绝对值33 对应二进制 100001，按位取反 11111111111111111111111111011110
	 *  	再对整个数加1，即11111111111111111111111111011111
	 * 
	 * @author mingfei.z
	 */
	private static void cal4() {
		Integer a = 21, b = 32;
		System.out.println("a binary: " + Integer.toBinaryString(a));
		System.out.println("b binary: " + Integer.toBinaryString(b));
		
		int aAndb = a & b;
		System.out.println("a & b: " + aAndb);
		int aOrb = a | b;
		System.out.println("a | b: " + aOrb);
		System.out.println("aOrb binary: " + Integer.toBinaryString(aOrb));
		
		int _1And1 = 0b1 & 0b1;
		System.out.println("_1And1: " + _1And1);
		int _1Or1 = 0b1 | 0b1;
		System.out.println("_1Or1: " + _1Or1);
		
		int aXorb = a ^ b;
		System.out.println("a ^ b: " + aXorb);
		System.out.println("aXorb binary: " + Integer.toBinaryString(aXorb));
		
		int nota = ~a;
		int notb = ~b;
		System.out.println("~a: " + nota);
		System.out.println("~a binary: " + Integer.toBinaryString(nota));
		System.out.println("~b: " + notb);
		System.out.println("~b binary: " + Integer.toBinaryString(notb));
	}
	
	private static void cal3() {
		int a = 7;
		a = (a & 0b1000) / 0b1000;
		System.out.println("a: " + a);
		
		int b = 5;
		b = (b & 0b100) / 0b100;
		System.out.println("b: " + b);
		
		int c = 0b1000;
		System.out.println("c: " + c);

		int d = 0b111;
		System.out.println("d: " + d);
	}
	
	private static void cal2() {
		int a = 3;
		System.out.println("a: " + a);
		a++;
		System.out.println("a: " + a);
		++a;
		System.out.println("a: " + a);
		a--;
		System.out.println("a: " + a);
		--a;
		System.out.println("a: " + a);
		
		int b = 5;
		System.out.println("b: " + b);
		int b2 = b++ + 2;
		System.out.println("b2: " + b2);
		System.out.println("b: " + b);
		int b3 = ++b + 2;
		System.out.println("b3: " + b3);
		System.out.println("b: " + b);

		int d = 5, c = 5;
		System.out.println("d: " + d + ", c: " + c);
		int m = d++ + 2;
		System.out.println("m: " + m);
		int n = ++c + 2;
		System.out.println("n: " + n);
	}
	
	/**
	 * 结合运算
	 * 
	 * @author mingfei.z
	 */
	private static void cal1() {
		int x = 3;
		System.out.println("x: " + x);
		x += 4;
		System.out.println("x: " + x);
		x -= 2;
		System.out.println("x: " + x);
		x *= 3;
		System.out.println("x: " + x);
		x /= 2;
		System.out.println("x: " + x);
		x %= 3;
		System.out.println("x: " + x);
		
		x += 2.5; // (int)(x + 2.5)
		System.out.println("x: " + x);
		
		double y = 2.05;
		System.out.println("y: " + y);
		y += 3;
		System.out.println("y: " + y);
	}

}

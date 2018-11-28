/**
 * 
 * @author mingfei.z 2018年11月27日 下午3:50:36
 */
package com.mfzhang.day03;

/**
 * 
 * @author mingfei.z
 */
public class MathTest {

	public static void main(String[] args) {
		System.out.println("Math.E: " + Math.E);
		System.out.println("Math.PI: " + Math.PI);
		System.out.println("Math.sin(1): " + Math.sin(1));
		System.out.println("Math.sinh(1): " + Math.sinh(1));
		
		System.out.println("Math.toRadians(90): " + Math.toRadians(180)); // 角度转弧度
		System.out.println("Math.toDegrees(Math.PI): " + Math.toDegrees(Math.PI)); // 弧度转角度
		System.out.println("Math.Math.sqrt(4): " + Math.sqrt(4)); // 求平方根
		System.out.println("Math.cbrt(27): " + Math.cbrt(27)); // 立方根
		
		// n 等于最接近f1/f2 的 整数
		System.out.println("Math.IEEEremainder(127, 31): " + Math.IEEEremainder(127, 31)); // f1 除以 f2的余数  =(f1-f2*n) =(127-31*4=3)
		System.out.println("Math.IEEEremainder(127, 31): " + Math.IEEEremainder(127, 22)); // f1 除以 f2的余数  =(f1-f2*n) =(127-22*5=17)=(127-22*6=5)
		
		
	}

}

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
		
		// n 等于最接近f1/f2 的 整数
		System.out.println("Math.IEEEremainder(127, 31): " + Math.IEEEremainder(127, 31)); // f1 除以 f2的余数  =(f1-f2*n) =(127-31*4=3)
		System.out.println("Math.IEEEremainder(127, 31): " + Math.IEEEremainder(127, 22)); // f1 除以 f2的余数  =(f1-f2*n) =(127-22*5=17)=(127-22*6=5)
		
		// 向上取整，返回大于指定参数的最小整数
		System.out.println("Math.ceil(2.00001): " + Math.ceil(2.00001)); // 
		System.out.println("Math.ceil(2.99): " + Math.ceil(2.99)); // 
		System.out.println("Math.ceil(-2.99): " + Math.ceil(-2.99)); // 
		
		// 向下取整，返回小于指定参数的最大整数
		System.out.println("Math.floor(2.00001): " + Math.floor(2.00001)); // 
		System.out.println("Math.floor(2.99): " + Math.floor(2.99)); // 
		System.out.println("Math.floor(-2.99): " + Math.floor(-2.99)); // 
		
		// 返回最接近参数的整数
		System.out.println("Math.rint(2.00001): " + Math.rint(2.00001)); // 
		System.out.println("Math.rint(-2.00001): " + Math.rint(-2.00001)); // 
		System.out.println("Math.rint(2.99): " + Math.rint(2.99)); // 
		System.out.println("Math.rint(-2.99): " + Math.rint(-2.99)); // 
		System.out.println("Math.rint(22): " + Math.rint(22)); // 
		System.out.println("Math.rint(22.5): " + Math.rint(22.5)); // 
		System.out.println("Math.rint(22.6): " + Math.rint(22.6)); // 
		
		// a的b次方
		System.out.println("Math.pow(2, 3): " + Math.pow(2, 3)); //
		System.out.println("Math.pow(2, 3.2): " + Math.pow(2, 3.2)); // 
		System.out.println("Math.Math.sqrt(4): " + Math.sqrt(4)); // 求平方根
		System.out.println("Math.cbrt(27): " + Math.cbrt(27)); // 立方根
		
		// 四舍五入，double参数返回long，float参数返回int
		// 取最接近参数的整数，返回double
		System.out.println("Math.round(2.0): " + Math.round(2.0)); // 
		System.out.println("Math.round(2.0): " + Math.round(2.0f)); // 
		System.out.println("Math.round(2.024324253535435454646424141113): " + Math.round(2.024324253535435454646424141113)); // 
		System.out.println("Math.round(2.024324253535435454646424141113f): " + Math.round(2.024324253535435454646424141113f)); // 
		System.out.println("Math.round(232424242342424242424242432424242464242.02324): " + Math.round(232424242342424242424242432424242464242.02324)); // 
		System.out.println("Math.round(232424242342424242424242432424242464242.02324f): " + Math.round(232424242342424242424242432424242464242.02324f)); //
		System.out.println("Math.round(2.434242): " + Math.round(2.434242)); // 
		System.out.println("Math.round(2.534242): " + Math.round(2.534242)); // 
		System.out.println("Math.round(2.4): " + Math.round(2.4)); // 结果: 2
		System.out.println("Math.round(2.5): " + Math.round(2.5)); // 结果: 3
		System.out.println("Math.rint(2.4): " + Math.rint(2.4)); // 结果: 2.0
		System.out.println("Math.rint(2.5): " + Math.rint(2.5)); // 结果: 2.0
		System.out.println("Math.rint(2.6): " + Math.rint(2.6)); // 结果: 3.0
		
		// 返回 >=0.0 和 <1.0 之间的随机double数
		// 产生一个[0，1)之间的随机数
		System.out.println("Math.random(): " + Math.random());
		System.out.println(generateRandom(0, 10));
		System.out.println(generateRandom(2, 100));
		printRandomC();
		
		// 无溢出计算，溢出则抛异常
		System.out.println(5 & 6);
		System.out.println("Math.addExact(2, 3): " + Math.addExact(2, 3));
		System.out.println("Math.addExact(22, 36): " + Math.addExact(22, 36));
		System.out.println("Math.addExact(2L, 3l): " + Math.addExact(2L, 3l));
	}
	
	private static int generateRandom(int m, int n) {
		int result = (int)((Math.random()*(n-m)) + m);
		return result;
	}
	
	private static void printRandomC() {
		
		int cInt = (int)(Math.random()*128);
		System.out.println("cInt: " + cInt);
		System.out.println("A: " + (int)'A');
		System.out.println("Z: " + (int)'Z');
		if (cInt >= 'A' && cInt <= 'Z')
			System.out.println("yes");
		else 
			System.out.println("no");
	}

}

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
		System.out.println("Math.addExact(2, 3): " + Math.addExact(2, 3)); // 加
		System.out.println("Math.addExact(22, 36): " + Math.addExact(22, 36));
		System.out.println("Math.addExact(2L, 3l): " + Math.addExact(2L, 3l));
		System.out.println("Math.subtractExact(2, 13): " + Math.subtractExact(2, 13)); // 减
		System.out.println("Math.subtractExact(2L, 13l): " + Math.subtractExact(2L, 13l));
		System.out.println("Math.multiplyExact(2, 16): " + Math.multiplyExact(2, 16)); // 乘
		System.out.println("Math.multiplyExact(2L, 16L): " + Math.multiplyExact(2L, 16L));
		System.out.println("Math.incrementExact(100): " + Math.incrementExact(100)); // 自增
		System.out.println("Math.incrementExact(1323L): " + Math.incrementExact(1323L)); // 自增
		System.out.println("Math.decrementExact(100): " + Math.decrementExact(100)); // 自减
		System.out.println("Math.decrementExact(1323L): " + Math.decrementExact(1323L)); // 自减
		System.out.println("Math.negateExact(100): " + Math.negateExact(100)); // 非
		System.out.println("Math.negateExact(1323L): " + Math.negateExact(1323L)); // 
		System.out.println("Math.negateExact(-1323L): " + Math.negateExact(-1323L)); // 
		
		try {
			System.out.println("Math.toIntExact(120000000033l): " + Math.toIntExact(120000000033l)); // 
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Math.toIntExact(12000033l): " + Math.toIntExact(12000033l)); // 
		
		// x除数，y被除数，返回小于或等于x/y的商的最大整数
		System.out.println("Math.floorDiv(23, 3): " + Math.floorDiv(23, 3)); 
		System.out.println("Math.floorDiv(1233333333333333l, 3): " + Math.floorDiv(1233333333333333l, 3));
		System.out.println("Math.floorDiv(23, -4): " + Math.floorDiv(23, -4)); 
		
		// 求余
		System.out.println("Math.floorMod(23, 3): " + Math.floorMod(23, 3)); 
		System.out.println("Math.floorMod(1233333333333333l, 4): " + Math.floorMod(1233333333333333l, 4));
		System.out.println("Math.floorMod(23, -4): " + Math.floorMod(23, -4)); 
		
		System.out.println("Math.abs(-1.2): " + Math.abs(-1.2)); // 绝对值
		System.out.println("Math.max(1.2, 1.3): " + Math.max(1.2, 1.3));
		System.out.println("Math.max(1.2, -1.3): " + Math.max(1.2, -1.3));
		System.out.println("Math.max(-1.2, -1.3): " + Math.max(-1.2, -1.3));
		System.out.println("Math.min(1.2, 1.3): " + Math.min(1.2, 1.3));
		System.out.println("Math.min(1.2, -1.3): " + Math.min(1.2, -1.3));
		System.out.println("Math.min(-1.2, -1.3): " + Math.min(-1.2, -1.3));
		
		// ulp 最小的精度单位
		System.out.println("Math.ulp(3.0): " + Math.ulp(3.0));
		
		// = sqrt(x2 +y2)
		System.out.println("Math.hypot(3.0, 4.0): " + Math.hypot(3.0, 4.0));
		
		// 返回第一个参数和第二个参数之间与第一个参数相邻的浮点数。如果两个参数比较起来相等，则返回第二个参数
		System.out.println("Math.nextAfter(4.0, 5.0): " + Math.nextAfter(4.0, 5.0));
		System.out.println("Math.nextAfter(5.0, 5.0): " + Math.nextAfter(5.0, 5.0));
		System.out.println("Math.nextAfter(4.0, 3.0): " + Math.nextAfter(4.0, 3.0));
		System.out.println("Math.nextAfter(413.0, 2.0): " + Math.nextAfter(413.0, 2.0));
		System.out.println("Math.nextUp(2.2): " + Math.nextUp(2.2));
		System.out.println("Math.nextDown(3.5): " + Math.nextDown(3.5));
		
		// scalb(x, y) = x * 2的y次幂
		System.out.println("Math.scalb(2.0, 3): " + Math.scalb(2.0, 3));
		
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

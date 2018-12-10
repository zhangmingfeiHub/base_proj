/**
 * 
 * @author mingfei.z 2018年11月23日 下午1:39:32
 */
package com.mfzhang.day02;

/**
 * 
 * @author mingfei.z
 */
public class 浮点型验证 {

	public static void main(String[] args) {
//		float v = 3.14; // 默认dubble类型
		float v2 = 3.14f;
		float v3 = 3.14F;
		float v4 = 3.143424222909089208490284092F;
		double v5 = 3.143424222909089208490284092;
		double v6 = 3.143424222909089208490284092F;
		double v7 = 3.143424222909089208490284092d;
		double v8 = 3.143424222909089208490284092D;
		double v9 = 3.143424222909089208490284092809280948240928908D;
		float v10 = 3.634058198_39508329583095_390580985309805080935F;
		double v11 = 3.634058198395083_29583095_390580985309805080935D;
		
		System.out.println("f: " + v2);
		System.out.println("f: " + v3);
		System.out.println("f: " + v4);
		System.out.println("d: " + v5);
		System.out.println("f: " + v6);
		System.out.println("d: " + v7);
		System.out.println("d: " + v8);
		System.out.println("d: " + v9);
		System.out.println("f: " + v10);
		System.out.println("d: " + v11);
		
		System.out.println("Float.MAX_VALUE：" + Float.MAX_VALUE);
		System.out.println("Float.MIN_VALUE：" + Float.MIN_VALUE);
		System.out.println("Double.MAX_VALUE：" + Double.MAX_VALUE);
		System.out.println("Double.MIN_VALUE：" + Double.MIN_VALUE);
		
		double v12 = 3.52566 / 0;
//		int v13 = 1 / 0;
		System.out.println("d: " + v12);
//		System.out.println("int: " + v13);
		
		System.out.println("Float.POSITIVE_INFINITY: " + Float.POSITIVE_INFINITY);
		System.out.println("Float.NEGATIVE_INFINITY: " + Float.NEGATIVE_INFINITY);
		System.out.println("Float.NaN: " + Float.NaN);
		System.out.println("Double.POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY);
		System.out.println("Double.NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY);
		System.out.println("Double.NaN: " + Double.NaN);
		
		if (Double.isNaN(v12))
			System.out.println("v12 isNan");

		if (v12 == v12) {
			System.out.println("v12: " + v12);
			System.out.println("v12 ==");
		}
		
		if (Double.isInfinite(v12))
			System.out.println("v12 isInfinite");
		
		System.out.println("2.0-0.1: " + (2.0-0.1));
		System.out.println("2.0-1.1: " + (2.0-1.1));
	}
	
}

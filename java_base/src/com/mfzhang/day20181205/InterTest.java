/**
 * 
 * @author mingfei.z 2018年12月5日 下午5:06:59
 */
package com.mfzhang.day20181205;

/**
 * 
 * @author mingfei.z
 */
public interface InterTest {

	static void get() {
		System.out.println("get()");
	}
	
	default void get1() {
		System.out.println("get1()");
	}
	
	void get2();
	
}

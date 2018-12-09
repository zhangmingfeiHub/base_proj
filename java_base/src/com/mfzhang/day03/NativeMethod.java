/**
 * 
 * @author mingfei.z 2018年11月28日 上午10:23:39
 */
package com.mfzhang.day03;

/**
 * 
 * @author mingfei.z
 */
public class NativeMethod {

	/**
	 * 与非java语言接口关联<br/>
	 * 定义native方法由非java语言实现<br/>
	 * 通过DLL文件加载方法的实现<br/>
	 * 调用java.system.loadLibrary()
	 * 
	 * @return
	 * @author mingfei.z
	 */
	public static native String getVal();
	
}

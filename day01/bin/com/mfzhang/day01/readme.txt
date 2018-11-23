1、类名只能以【 _ 或 $ 或 字母 或 中文】 开头，后面以【 _ 或 $ 或 字母 或 中文 或 数字】
2、类名不区分大小写
3、类中field 和 method 名称区分大小写
4、规范命名，驼峰方式

5、		long val = 1;
		long val2 = 1l;
		long val3 = 1L;
		long val4 = 10000000000l;
long基本类型，超过int类型最大值，则需要后面带上l 或 L
6、
	byte b1 = 2;
	byte b2 = 2_0;
	byte b3 = (byte) 2_00;
赋值时超过byte最大值，需强制转换

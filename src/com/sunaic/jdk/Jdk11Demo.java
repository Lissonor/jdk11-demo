package com.sunaic.jdk;

/**
 * @description 第一个jdk11的demo
 * @author Ian
 * @date 2019年2月19日 下午1:11:59
 * @version v1.0
 */
public class Jdk11Demo {
	public static void main(String[] args) {
		Jdk11Demo obj = new Jdk11Demo();
		obj.getJdkInfo();
		System.out.println("***********");
		obj.getSystemInfo();
	}

	/**
	 * @description 获取jdk的相关信息
	 * @author Ian
	 * @date 2019年2月19日 下午1:19:57
	 * @return void
	 */
	private void getJdkInfo() {
		System.out.println(getProperty("java.version"));
		System.out.println(getProperty("java.vendor"));     
        System.out.println(getProperty("java.vendor.url"));     
        System.out.println(getProperty("java.home"));     
        System.out.println(getProperty("java.vm.specification.version"));     
        System.out.println(getProperty("java.vm.specification.vendor"));     
        System.out.println(getProperty("java.vm.specification.name"));     
        System.out.println(getProperty("java.vm.version"));     
        System.out.println(getProperty("java.vm.vendor"));     
        System.out.println(getProperty("java.vm.name"));     
        System.out.println(getProperty("java.specification.version"));     
        System.out.println(getProperty("java.specification.vendor"));     
        System.out.println(getProperty("java.specification.name"));     
        System.out.println(getProperty("java.class.version"));     
        System.out.println(getProperty("java.class.path"));     
        System.out.println(getProperty("java.library.path"));     
        System.out.println(getProperty("java.io.tmpdir"));     
        System.out.println(getProperty("java.compiler"));     
        System.out.println(getProperty("java.ext.dirs")); 
	}

	/**
	 * @description 获取系统相关信息
	 * @author Ian
	 * @date 2019年2月19日 下午1:21:13
	 * @return void
	 */
	private void getSystemInfo() {
		System.out.println(getProperty("os.name"));     
        System.out.println(getProperty("os.arch"));     
        System.out.println(getProperty("os.version"));     
        System.out.println(getProperty("file.separator"));     
        System.out.println(getProperty("path.separator"));     
        System.out.println(getProperty("line.separator"));     
        System.out.println(getProperty("user.name"));     
        System.out.println(getProperty("user.home"));                     
        System.out.println(getProperty("user.dir")); 
        System.out.println("————————end");
	}
	
	/**
	 * @description 获取属性
	 * @author Ian
	 * @date 2019年2月19日 下午2:44:22
	 * @return String
	 */
	private static String getProperty(String para) {
		return System.getProperty(para);
	}
}


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
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vendor"));     
        System.out.println(System.getProperty("java.vendor.url"));     
        System.out.println(System.getProperty("java.home"));     
        System.out.println(System.getProperty("java.vm.specification.version"));     
        System.out.println(System.getProperty("java.vm.specification.vendor"));     
        System.out.println(System.getProperty("java.vm.specification.name"));     
        System.out.println(System.getProperty("java.vm.version"));     
        System.out.println(System.getProperty("java.vm.vendor"));     
        System.out.println(System.getProperty("java.vm.name"));     
        System.out.println(System.getProperty("java.specification.version"));     
        System.out.println(System.getProperty("java.specification.vendor"));     
        System.out.println(System.getProperty("java.specification.name"));     
        System.out.println(System.getProperty("java.class.version"));     
        System.out.println(System.getProperty("java.class.path"));     
        System.out.println(System.getProperty("java.library.path"));     
        System.out.println(System.getProperty("java.io.tmpdir"));     
        System.out.println(System.getProperty("java.compiler"));     
        System.out.println(System.getProperty("java.ext.dirs")); 
	}

	/**
	 * @description 获取系统相关信息
	 * @author Ian
	 * @date 2019年2月19日 下午1:21:13
	 * @return void
	 */
	private void getSystemInfo() {
		System.out.println(System.getProperty("os.name"));     
        System.out.println(System.getProperty("os.arch"));     
        System.out.println(System.getProperty("os.version"));     
        System.out.println(System.getProperty("file.separator"));     
        System.out.println(System.getProperty("path.separator"));     
        System.out.println(System.getProperty("line.separator"));     
        System.out.println(System.getProperty("user.name"));     
        System.out.println(System.getProperty("user.home"));                     
        System.out.println(System.getProperty("user.dir")); 
        System.out.println("————————end");
	}
	
}


package com.mycompany.app; /** * 一个简单的 Hello World 应用 * 这是 simple-java-maven-app 的核心类 */ 
public class App { 
	private static final String MESSAGE = "Hello World!";
	public App() {} 
	public static void main(String[] args) { 
		System.out.println(MESSAGE); 
	} /** * 返回程序消息 * @return "Hello World!" */
 	public String getMessage() { 
		return MESSAGE; 
	} 
}
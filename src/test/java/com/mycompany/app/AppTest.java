package com.mycompany.app; 
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals; /** * App 类的单元测试 * 使用 JUnit Jupiter (JUnit 5) 框架 */ 
public class AppTest { // 测试1：构造器 — 多个实例的 getMessage() 应返回相同值 
	@Test public void testAppConstructor() { 
		App app1 = new App(); 
		App app2 = new App(); 
		assertEquals(app1.getMessage(), app2.getMessage(), "所有 App 实例应返回相同的消息"); 
	} // 测试2：getMessage() 应返回 "Hello World!" 
	@Test public void testAppMessage() { 
		App app = new App(); 
		assertEquals("Hello World!", app.getMessage(), "getMessage() 应返回 'Hello World!'"); 
	} 
}
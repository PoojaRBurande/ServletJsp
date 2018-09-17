package com.some;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=ClassPathXmlApplicationContext("spring.xml");
		HellWorld hello = contex.getBean("hello");
		hello.getMessage();
	}

}

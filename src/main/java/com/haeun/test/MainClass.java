package com.haeun.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		//implements 해서 Pencil로 객체를 받음
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		//bean id, 클래스명
		
		pencil.use();
		
		ctx.close();
	}
}

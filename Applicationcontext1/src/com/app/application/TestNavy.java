package com.app.application;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNavy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String xml="beans.xml";
          ApplicationContext ac      = new ClassPathXmlApplicationContext(xml);
       NavyBean navy2   = ac.getBean("navy2", NavyBean.class);
       System.out.println(navy2.getRegimentName());
	}

}

package com.app.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Swiggy {
	public static void main(String args[]) {
		String xml = "MenuCard.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(xml);
		
		Hotel single = app.getBean("single", Hotel.class);
		single.setName("Singleton Element1");
		System.out.println("Setting Name: "+single.getName());
		Hotel single2 = app.getBean("single", Hotel.class);
		single.setName("Singleton Element2");
		System.out.println("Both are same: "+(single==single2));
		System.out.println("Address of element 1: "+single
				+'\n'+"Address of element 2: "+single2);
		
		
		Hotel proto = app.getBean("proto", Hotel.class);
		proto.setName("Prototype Element1");
		System.out.println("Setting Name: "+proto.getName());
		Hotel proto2 = app.getBean("proto", Hotel.class);
		proto2.setName("Prototype Element2");
		System.out.println("Changed Name: "+proto2.getName());
		System.out.println("Both are same: "+(proto==proto2));
		System.out.println("Address of element 1: "+proto
				+'\n'+"Address of element 2: "+proto2);
		
	}

}
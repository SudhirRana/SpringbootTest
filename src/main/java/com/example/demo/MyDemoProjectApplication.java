package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoProjectApplication.class, args);
		System.out.println("Hello Dear");
		MyBeanclass a = new MyBeanclass();
		int d = a.MyBeanFunction();
		System.out.print(d);
		
	}

}

package com.epicode.U5D1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class U5D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5D1Application.class, args);

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);
//
//		Menu m = (Menu) ctx.getBean("menu");
//
//		m.printMenu();
//		ctx.close();
        System.out.println("CIAO");
    }

}

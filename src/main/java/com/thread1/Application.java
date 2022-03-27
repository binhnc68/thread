package com.thread1;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        System.out.println("test1");
        System.out.println("Main thread running... ");
        
        ThreadDemo T1 = new ThreadDemo("Thread-1-HR-Database");
//        T1.start();
 
        ThreadDemo T2 = new ThreadDemo("Thread-2-Send-Email");
        T2.start();
 
        System.out.println("Main thread stopped!!! ");
    }
}


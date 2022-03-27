package com.thread.Runnable2;


public class Application {
	public static void main(String args[]) {
        System.out.println("Main thread running... ");
 
        ThreadDemo R1 = new ThreadDemo("Thread-1-HR-Database");
        R1.start();
 
        ThreadDemo R2 = new ThreadDemo("Thread-2-Send-Email");
        R2.start();
 
        System.out.println("==&amp;gt; Main thread stopped!!! ");
    }
}

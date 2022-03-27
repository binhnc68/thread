package com.thread.staticsyncmethod;

public class ShareMemory {
    public static synchronized void printData(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}

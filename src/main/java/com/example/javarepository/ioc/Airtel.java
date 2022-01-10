package com.example.javarepository.ioc;

public class Airtel implements Sim {
    public void call() {
        System.out.println("calling through airtel");
    }
    public void message() {
        System.out.println("messaging through airtel");
    }
    public void dataUsage() {
        System.out.println("dataUsage through airtel");
    }
}
package com.example.javarepository.ioc;

public class Jio implements Sim {
    public void call() {
        System.out.println("calling through jio");
    }
    public void message() {
        System.out.println("messaging through jio");
    }
    public void dataUsage() {
        System.out.println("dataUsage through Jio");
    }
}
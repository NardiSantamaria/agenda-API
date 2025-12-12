package com.agendapp.agenda.controller;
@FunctionalInterface
public interface FuncionalInterTest {


    public void method1();

   default void method2() {
        System.out.println("Default method does not count for functional interface");
    }

    static void method3() {
        System.out.println("Static method does not count for functional interface");
    }

} 

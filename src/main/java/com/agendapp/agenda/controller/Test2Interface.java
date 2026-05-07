package com.agendapp.agenda.controller;

public interface Test2Interface extends TestInterface {
    
    default void testmethod(){
        System.out.println("testmethod");
    }
    static void methodStatic(){
        
    }
}

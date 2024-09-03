package com.agendapp.agenda.controller;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import com.agendapp.agenda.entity.Notification;
import com.agendapp.agenda.entity.Task;
import com.agendapp.agenda.entity.Registry;

public abstract class ItemFactory {
    public static Object createItem(String classString) throws ClassNotFoundException{
        try {
            Class<?> clazz;
            clazz = Class.forName(classString);
            Object obj=clazz.getDeclaredConstructor().newInstance();
            return obj;
        } catch (InstantiationException e) {            
            e.printStackTrace();
        } catch (IllegalAccessException e) {            
            e.printStackTrace();
        } catch (IllegalArgumentException e) {          
            e.printStackTrace();
        } catch (InvocationTargetException e) {           
            e.printStackTrace();
        } catch (NoSuchMethodException e) {     
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        return classString;
    } 
}

package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public final class App {
    
    private static ArrayList <String> list1 = new ArrayList<>();
    private static ArrayList <Boolean> list2 = new ArrayList<>();
    private int taskNumber = 0;
    private static Scanner sc = new Scanner(System.in);
    private boolean selectMenuOption = true; 
    private boolean addNewTask = true;

    public static void agregarTask() {
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list2.add(true);
        list2.add(true);
        list2.add(false);
    }

    public static void deleltetask() {
        System.out.println("seleccione cual tarea quiere eleminar: " + list1);
        int del = sc.nextInt();
        list1.remove(del-1);
        list2.remove( del-1);
    }


    public static void main(String[] args) {

        agregarTask();
        System.out.println("Tamaño inicial de la lista: " + list1.size());
        System.out.println("Contenido inicial de la lista: " + list2 + " " + list1);
        deleltetask();
        System.out.println("El Contenido  elminado fue: " + list2 + " " + list1);
    }


}
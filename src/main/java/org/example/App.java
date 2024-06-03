package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public final class App {

    private ArrayList<String> list1 = new ArrayList<>();
    private ArrayList<Boolean> list2 = new ArrayList<>();
    private int taskNumber = 0;
    private Scanner sc = new Scanner(System.in);
    private boolean selectMenuOption = true;


    public void updateTasks() {
        printStaticMessage();
        int taskNumber = sc.nextInt();
        boolean taskCompleted;
        list2.set(taskNumber-1, true);
        System.out.println("Modified ArrayList: " + list2);
        System.out.println("Your task has been modified");
    }

    public static void printStaticMessage() {
        System.out.println("What task do you want to mark as completed? Enter the number of task: ");
    }
    //readTasks();
    public static void main(String[] args) {
        App app = new App();
        app.updateTasks();
    }
}
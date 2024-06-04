package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public final class App {

    private ArrayList<String> list1 = new ArrayList<>();
    private ArrayList<Boolean> list2 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
 
    private void addTask() {
        System.out.print("\n" +
                "Enter the description of the new task");
        String task = sc.nextLine();
        list1.add(task);
        list2.add(false);
        System.out.println("Task added successfully.");
    }
     public void readTasks() {
        System.out.println("This is your current Task List: ");
        
        for (int i=0; i<list1.size();i++) {
            boolean crossedTask = list2.get(i);
            String crossed = "";
            if( crossedTask == true)
                {
                crossed = ".[X]";
                }
            else 
                {
                crossed = ".[ ]";
                }
            System.out.println((i+1)+crossed+list1.get(i));
            }
    }

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
    
    public static void main(String[] args) {
        App app = new App();
        app.updateTasks();
    }
  public static void deletetask() {
        System.out.println("Choose which task would you  like to delete: ");
        readTasks()
        int del = sc.nextInt();
        list1.remove(del-1);
        list2.remove( del-1);
    }

}
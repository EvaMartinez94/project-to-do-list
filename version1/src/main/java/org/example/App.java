package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public final class App {

  private ArrayList<String> list1 = new ArrayList<>();
  private ArrayList<Boolean> list2 = new ArrayList<>();
  private Scanner sc = new Scanner(System.in);
  boolean otherOption = true;

  public void run() {

    do {
      System.out.println(
          """ 
             Welcome to the ToDo List:
              1. Add Task.
              2. List Task.
              3. Mark Task as Complete.
              4. Delete Task.
              5. Exit.
              Select an option:
              """);
      String optionNumber = sc.next();
      sc.nextLine();
      if (optionNumber.equals("1")) {
        addTasks();
      } else if (optionNumber.equals("2")) {
        readTasks();
      } else if (optionNumber.equals("3")) {
        updateTasks();
      } else if (optionNumber.equals("4")) {
        deleteTasks();
      } else if (optionNumber.equals("5")) {
        System.out.println(
            "If you have come this far it is because you have read our work, thank you for your time ;P");
        otherOption = false;
      } else {
        System.out.println("It is not a option number.");
      }
    } while (otherOption);
  }

  public void addTasks() {
    System.out.print("\n" + "Enter the description of the new task: ");
    String task = sc.nextLine();
    System.out.println(task);
    list1.add(task);
    list2.add(false);
    System.out.println("Task added successfully.");
  }

  public void readTasks() {
    System.out.println("This is your current Task List: ");

    for (int i = 0; i < list1.size(); i++) {
      boolean crossedTask = list2.get(i);
      String crossed = "";
      if (crossedTask == true) {
        crossed = ".[X]";
      } else {
        crossed = ".[ ]";
      }
      System.out.println((i + 1) + crossed + list1.get(i));
    }
  }

  public void updateTasks() {
    printStaticMessage();
    int taskNumber = sc.nextInt();
    boolean taskCompleted;
    list2.set(taskNumber - 1, true);
    System.out.println("Your task has been modified");
    readTasks();
  }

  public static void printStaticMessage() {
    System.out.println("What task do you want to mark as completed? Enter the number of task: ");
  }

  public static void main(String[] args) {
    App app = new App();
    app.run();
  }

  public void deleteTasks() {
    System.out.println("Choose which task would you like to delete: ");
    readTasks();
    int del = sc.nextInt();
    list1.remove(del - 1);
    list2.remove(del - 1);
  }
}

package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public final class App {
    
    private ArrayList <String> list1 = new ArrayList<>();
    private ArrayList <Boolean> list2 = new ArrayList<>();
    private int taskNumber = 0;
    private Scanner sc = new Scanner(System.in);
    private boolean selectMenuOption = true; 
    private boolean addNewTask = true;
    
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
    public static void main(String[] args) {}
}
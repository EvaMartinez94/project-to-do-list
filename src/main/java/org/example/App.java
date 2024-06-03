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

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        boolean isRunning;
        while (isRunning) {
            printMenu();
            int option = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    markTaskAsCompleted();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private void markTaskAsCompleted() {
    }

    private void listTasks() {
    }

    private void deleteTask() {
    }

    private void printMenu() {
        System.out.println("Menú:");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Eliminar Tarea");
        System.out.println("3. Listar Tareas");
        System.out.println("4. Marcar Tarea como Completada");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void addTask() {
        System.out.print("Ingrese la descripción de la nueva tarea: ");
        String task = sc.nextLine();
        list1.add(task);
        list2.add(false); // Tarea agregada como no completada
        System.out.println("Tarea agregada con éxito.");
    }
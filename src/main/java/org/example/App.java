

    public static void deletetask() {
        System.out.println("Choose which task would you  like to delete: " + list1);
        readTasks()
        int del = sc.nextInt();
        list1.remove(del-1);
        list2.remove( del-1);
    }




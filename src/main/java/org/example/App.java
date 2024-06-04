
    private void addTask() {
        System.out.print("\n" +
                "Enter the description of the new task");
        String task = sc.nextLine();
        list1.add(task);
        list2.add(false);
        System.out.println("Task added successfully.");
    }
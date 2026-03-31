import java.util.ArrayList;
import java.util.Scanner;

public class tasklist {
    
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static boolean isRunning = true;
    public static void main(String[] args) {
        
        while(isRunning){
        System.out.println("\nWelcome to the tasklist program!");
        System.out.println("1: Add a task");
        System.out.println("2: Show all tasks");
        System.out.println("3: Remove a task");
        System.out.println("4: Exit program");
        System.out.print("What would you like to do today?: ");
        
        int choice = 0;
        if(input.hasNextInt()){
        choice = input.nextInt();
        input.nextLine();
        }
        else{
            System.out.println("ERROR! Invalid input!");
            input.nextLine();
            continue;
        }
        
        switch (choice) {
            case 1 -> AddTask();
            case 2 -> showTasks();
            case 3 -> removeTask();
            case 4 -> isRunning = false;       
        }
    }
    System.out.println("Thanks for using our program. See you soon!");
        input.close();

    }
    static void AddTask(){
        System.out.print("How many tasks would you like to add: ");
        int numOfTasks = 0;
        if(input.hasNextInt()){
        numOfTasks = input.nextInt();
        input.nextLine();
        }
        else{
            System.out.println("ERROR! Invalid input!");
            input.nextLine();
            return;
        }

        for (int i = 0; i < numOfTasks; i++) {
            System.out.print("Enter a task you would like to add: ");
            String newTask = input.nextLine();
            tasks.add(newTask);
           System.out.println("Congratulations! " + newTask + " has been added to your tasklist\n");
            }
            
        
    }
    static void showTasks(){
        if(tasks.size() == 0){
            System.out.println("Your tasklist is empty!");
        }
        else{
             System.out.println("These are the all the tasks in your tasklist: \n");
            for(String task : tasks){
            System.out.println(task);
        }
    }
    }

    static void removeTask(){
        if(tasks.size() == 0){
            System.out.println("There are no tasks to remove"); 
            return;
        }
        else{
        System.out.print("What task would you like to remove?: ");
        }
        String remove = input.nextLine();
            for(String task : tasks){
                if(remove.toLowerCase().equals(task.toLowerCase())){
                    System.out.println("You have successfully removed " + remove + " from your tasklist");
                    tasks.remove(task);
                    return;
                }
            }
            System.out.println("This task, " + remove + " is not in your tasklist!");
                return;
            
    }
}



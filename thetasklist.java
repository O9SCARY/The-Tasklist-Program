import java.util.ArrayList;
import java.util.Scanner;

public class thetasklist {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();
    static int numOfTasks;
    public static void main(String[] args) {
        boolean isRunning = true;

        System.out.println("Welcome to the task list program!");
        while(isRunning){
        System.out.println("\nOPTIONS:");
        System.out.println("1: Add a task");
        System.out.println("2: Show all tasks");
        System.out.println("3: Remove a task");
        System.out.println("4: Exit program");

        System.out.print("What would you like to do today?: ");
        int choice = input.nextInt();
        input.nextLine();

        switch(choice){
            case 1 -> addTask();
            case 2 -> showTasks();
            case 3 -> removeTask();
            case 4 -> isRunning = false;
        }
        
    }
    System.out.println("Thanks for using our program.");
    System.out.println("See you soon!");
    }
    static void addTask(){
        System.out.print("How many tasks would you like to add?: ");
        numOfTasks = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < numOfTasks; i++){
            System.out.print("Enter a task: ");
            String addedTask = input.nextLine();
            tasks.add(addedTask);
            System.out.println("Congratulations, you have successfully added" + addedTask + "to your tasks list.\n" );
        }
    }
    static void showTasks(){
        System.out.println("These are all the tasks in your tasklist:\n");

        for(String task : tasks){
            System.out.println(task);
        }
    }
    static void removeTask(){
        String toRemove = "";
        if(tasks.size() > 0){
            System.out.print("What task would you like to remove?: ");
            toRemove = input.nextLine();
        }
        else{
            System.out.println("There are no tasks in your task list");
        }    
        for(String task : tasks){
            if(toRemove.equals(task)){
                System.out.println(toRemove + " has been removed from your tasklist!");
                tasks.remove(toRemove);
                break;
            }
            else{
                System.out.println(toRemove + " is not in your tasklist");
                break;
            }
        }

}
}

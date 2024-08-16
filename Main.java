import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<Task> tasks= new ArrayList<>();
    private  static Scanner sc = new Scanner(System.in);


    public static void showMenu(){
        System.out.println("************To-Do-Manager*********************");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Edit Task");
        System.out.println("4. Mark Task as Completed");
        System.out.println("5. Delete Task");
        System.out.println("6. exit");
        System.out.println("Enter the number of your choice");
    }

    public static void addtask(){

        System.out.println("Enter the task title");
        String title = sc.nextLine();
        System.out.println("Enter the task description");
        String desc = sc.nextLine();
        System.out.println("Enter the task priority");
        int priority = sc.nextInt();
        sc.nextLine();  //Consumes the leftover new line

        Task newTask = new Task(title , desc, null , priority);
        tasks.add(newTask);
        System.out.println("Task Added Successfully");
    }

    public static void viewtask(){
        if (tasks.isEmpty()){
            System.out.println("There is no task to view");
        }else {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println("This is task no. " + i);
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Status of Completion: " + task.isCompleted());
                System.out.println("Task Priority: " + task.getPriority());
                System.out.println();
            }
        }


    }

    public static void edittask(){
        if (tasks.isEmpty()){
            System.out.println("There is no task to edit");
        }else{
             System.out.println("enter the number of the task you would like to edit");
            int taskNo = sc.nextInt();
            tasks.get(taskNo);
            sc.nextLine();  //Consumes the leftover new line

            if(taskNo>=0 && taskNo<tasks.size()) {
                System.out.println("Enter the task title");
                String title = sc.nextLine();
                tasks.get(taskNo).setTitle(title);
                System.out.println("Enter the task description");
                String desc = sc.nextLine();
                tasks.get(taskNo).setDescription(desc);
                System.out.println("Enter the task priority");
                int priority = sc.nextInt();
                tasks.get(taskNo).setPriority(priority);
                System.out.println("Task edited successfully");
            }else{
                System.out.println("Invalid Choice");
            }
        }
    }

    public static void marktask(){
         if (tasks.isEmpty()){
            System.out.println("There is no task to mark");
        }else {

             System.out.println("enter the number of the task");
             int taskNo = sc.nextInt();

             System.out.println("Is the task completed: 'Y' or 'N'");
             char ch = sc.next().charAt(0);
             if (ch == 'Y' || ch == 'y') {
                 tasks.get(taskNo).setCompleted(true);
                 System.out.println("Task Marked Successfully");
             } else if (ch == 'N' || ch == 'n') {
                 tasks.get(taskNo).setCompleted(false);
                 System.out.println("Task Marked Successfully");
             } else {
                 System.out.println("Invalid Choice");
             }
         }
    }
    public static void deletetask(){
         if (tasks.isEmpty()){
            System.out.println("There is no task to Delete");
        }else {
             System.out.println("Enter the number of the task you want to delete");
             int taskNo = sc.nextInt();
             if (tasks.contains(tasks.get(taskNo))) {
                 tasks.remove(taskNo);
                 System.out.println("Task is successfully removed");
             } else System.out.println("The given task does not exist");
         }
    }
    public static void exit(){
        System.out.println("Exiting the To-DO-List program");
        System.exit(0);
    }



    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        showMenu();

       while(true){
           switch (sc.nextInt()) {
               case 1 -> addtask();
               case 2 -> viewtask();
               case 3 -> edittask();
               case 4 -> marktask();
               case 5 -> deletetask();
               case 6 -> exit();
               default -> System.out.println("Wrong choice");
           }

        }
    }
}
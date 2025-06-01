import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*  Threading----allows multiple parts of a program to run simultaneously
            Improves performance by doing tasks in parallel
            Useful for tasks like downloading, animation, or heavy computation
            Achieved by:
              1. Extending the Thread class and overriding run()
                 ✔️ Simple to use, direct access to Thread methods
                 ❌ Cannot extend another class (Java supports single inheritance)

              2. Implementing the Runnable interface and passing it to a Thread
                 ✔️ More flexible, supports multiple inheritance
                 ✔️ Better separation of task and thread logic
                 ❌ Slightly more complex syntax

            Start execution by calling start(), not run()
 */


        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();
        System.out.println("You have 10 seconds to enter your name!");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);



        scanner.close();

    }
}
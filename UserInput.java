import java.util.Scanner;
 class UserInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter age and salary:");
            System.out.println("Enter username");
            int age = myScanner.nextInt();
            double salary = myScanner.nextDouble();
            String username = myScanner.nextLine();
            System.out.println("Username is: " + username);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }

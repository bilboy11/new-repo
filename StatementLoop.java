import java.util.Scanner;
public class StatementLoop{
    public static void main(String[] args){
                while(true){
            Scanner inputs = new Scanner(System.in);
            System.out.print("Enter the day : ");
            int days;
            days = inputs.nextInt();
            switch (days) {
                case 1:
                System.out.println("wed");
                    break;
                case 2 :
                System.out.println("thurs");
                break;
                case 3:
                System.out.println("mon");
                break;
                case 4:
                System.out.println("fri");
                break;
                case 5:
                System.out.println("sat");
                break;
                case 6:
                System.out.println("sun");
                break;
                default:
                    System.out.println("No days Match");
            }
    }
}
}
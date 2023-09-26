import java.util.Scanner;
public class FunTest{
    public static void main(String[] args){
        while (true) {
        int scores;
        Scanner in = new Scanner(System.in);
        System.out.println("Grading System");
        System.out.print("Enter your score : ");
        scores = in.nextInt();
        if (scores > 69){
            System.out.println("Your Grade is A");
          } else if ((scores > 59) | (scores == 60)){
                System.out.println("Your Grade is B");
                } else if ((scores > 49) | (scores == 59)){
                    System.out.println("Your Grade is C");
                     } else if ((scores > 44) | (scores == 49)){
                    System.out.println("Your Grade is D");
                     } else if ((scores > 39) | (scores == 44)){
                    System.out.println("Your Grade is E");
            }
            else{
                System.out.println("Your Grade is F");
            }
        }
                }
            }    
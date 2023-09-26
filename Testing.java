public class Testing{
 public static void A(){
    /* CASTING AND FUNCTION CALLING
     * WIDENING */
        int a = 200;
        float b = a;
    System.out.println(b);
    byte myByte = 50;
    long myLong = myByte;
    System.out.println(myLong);
    // NARROWING
    double myDouble = 200.0;
    int myInt = (int) myDouble;
    System.out.println(myInt);
    }
    public static void main(String[] args) {
        A();
        // USING STRING
        String n = "90";
        String o = "10";
        String p = n + o;
        System.out.println(p);
        String name = "Musa";
        int s = 10;
        String t = name + s;
        System.out.println(t); 
        String FirstName = "Bilal";
        String NickName = "Jr";
        String FullName = FirstName + " " + NickName;
        System.out.println(FullName);
        System.out.println(FirstName.concat(NickName));
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.indexOf("d"));
        System.out.println(txt.length());
        System.out.println("we \tare the starting \"players of\" JR football club.");
        System.out.println("I\'ll be there \nno matter what");
        System.out.println("the laptop \\is \fblack in color.");
        // USING INT
        int a = 10;
        int b = 15;
        int c = 2;
        int d = 25;
        System.out.println(a + b * c / d);
        // OPERATORS
        int m = 60 + 30;
        System.out.println(m);
        System.out.println("JR FC have" + " " + 15 + " " + "amount of players with" + " " + "2 goalkeepers" );
        int sum1 = 10 + 10;
        int sum2 = sum1 + 20;
        int sum = sum1 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum);
        int x = 10;
        int y = 5;
        System.out.println(x != y);
        int Age = 25;
        int regAge = 18;
        if (Age <= regAge){
            System.out.println("Accept.");
        } else{
            System.out.println("Decline.");
            }
        }
    }
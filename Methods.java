public class Methods {
    int a = 100;
    String b = "Hi";
    public static void cars(){
        System.out.println("this is my car");
    }
    static void car(){
        System.out.println("hello my program");
    }
    static int numbers(){
        return 10+20;
    }
    static int numbers(int num1, int num2){
        return num1 * num2 + 123;
    }

    public static void main(String[] args) {
        Methods mymethod = new Methods();
        System.out.println(mymethod.a+ " "+ mymethod.b);
        mymethod.cars();
        car();
        System.out.println(numbers());
       int result =  numbers(200, 300);
       System.out.println(result);
       System.out.println("I LOVE YOU ZAINAB MUHAMMAD BUBA");
    }
    }

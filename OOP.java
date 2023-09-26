public class OOP {
    static void myCodes() {
    System.out.println("I am a coder!");
    }
   final int x = 5;
    int y = 7;
    String name = "Jr";
     class Second{}
    public static void main(String[] args) {
        myCodes();
        OOP myObj = new OOP();
        OOP myObj2 = new OOP();
        myObj2.y = 20;
        System.out.println("name:" + myObj.name + " " + "age:" + myObj2.y);
        System.out.println(myObj.x);
        System.out.println(myObj2.y);
    }
}

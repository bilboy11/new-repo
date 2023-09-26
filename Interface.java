interface FirstInterface {
    public void myMethod();
}
interface SecondInterface {
    public void myOtherMethod();
}
class PracticeClass implements FirstInterface, SecondInterface {
public void myMethod(){
    System.out.println("ABCD...");
}
public void myOtherMethod(){
    System.out.println("1234....");
}
}
class Main {
    public static void main(String[] args) {
        PracticeClass myPracticeClass = new PracticeClass();
        myPracticeClass.myMethod();
        myPracticeClass.myOtherMethod();
    }
}
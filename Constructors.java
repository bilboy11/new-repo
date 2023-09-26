public class Constructors {
    int modelYear;
    String modelName;
public Constructors(int year, String name){
modelYear = year;
modelName = name;
}
public static void main(String[] args) {
    Constructors myBoot = new Constructors(2020, "Nike");
    System.out.println(myBoot.modelYear + " " + myBoot.modelName);
}
}

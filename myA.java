import java.util.ArrayList;
class myA {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Ford");
        System.out.println(cars);
        System.out.println(cars.get(2));
        System.out.println(cars.set(1, "Mazda"));
        System.out.println(cars.remove(4));
        System.out.println(cars.size());
    }
}
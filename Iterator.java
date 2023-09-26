import java.util.ArrayList;
import java.util.Iterator;
class Main {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> clothes = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(9);
        numbers.add(15);
        clothes.add("Vaserce");
        clothes.add("Puma");
        clothes.add("Adidas");
        clothes.add("Nike");
        // Get the iterator
         Iterator<String> it = clothes.iterator();
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.hasNext();
            if(i < 20) {
                it.remove();
            }
        }
        System.out.println(numbers);
        // Prints first item
        System.out.println(it.next());
        while (it.hasNext()){
            System.out.println(it.hasNext());
        } 
    }
}
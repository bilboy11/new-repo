import java.util.HashSet;
class HashS {
    public static void main(String[] args) {
        HashSet<String> club = new HashSet<String>();
        HashSet<Integer> numbers = new HashSet<Integer>();
        club.add("Barcelona");
        club.add("Juventus");
        club.add("Dortmund");
        club.add("City");
        club.add("United");
        club.add("City");
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        for (int i = 1; i <= 15; i ++) {
            if (numbers.contains(i)){
                System.out.println(i + "valid");
            } else {
                System.out.println(i + "invald");
            }
        }
        System.out.println(club);
        System.out.println(club.contains("United"));
        System.out.println(club.remove("Juventus"));
        System.out.println(club.size());
        for (String i : club){
        System.out.println(i);
        }
    }
}
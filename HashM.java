import java.util.HashMap;
class HashM {
    public static void main(String[] args) {
    HashMap<String, String> teamPlayers = new HashMap<String, String>();
    HashMap<String, Integer> teamNumbers = new HashMap<String, Integer>();
    teamPlayers.put("Barce", "Pedri");
    teamPlayers.put("City", "Halaand");
    teamPlayers.put("Bayern", "Kane");
    teamNumbers.put("Pedri", 8);
    teamNumbers.put("Halaand", 9);
    teamNumbers.put("Kane", 9);
    for (String i : teamNumbers.keySet()){
        System.out.println("key: " + i + " value: " + teamNumbers.get(i));
    }
    System.out.println(teamPlayers);
    teamPlayers.get("Barce");
    teamPlayers.remove("City");
    teamPlayers.size();
    System.out.println(teamPlayers.get("Barce"));
    System.out.println(teamPlayers.remove("City"));
    System.out.println(teamPlayers.size());
    for (String i : teamPlayers.keySet()){
    System.out.println("key: " + i + "value: " + teamPlayers.get(i));
}
    }
}
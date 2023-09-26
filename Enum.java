public class Enum {
    enum Level {
        LOW,
        MEDIUM,
        HIGH,
    }
    public static void main(String[] args) {
        for (Level myLevel : Level.values()){
            System.out.println(myLevel);
        }
        Level myLevel = Level.HIGH;
        switch(myLevel){
            case LOW:
            System.out.println("Low Level");
            break;
            case MEDIUM:
            System.out.println("Medium Level");
            break;
            case HIGH:
            System.out.println("High Level");
            break;
        }
    }
}

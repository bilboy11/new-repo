import java.io.FileWriter;
import java.io.IOException;
class WriteTojrdoc {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("jrdoc.txt");
            myWriter.write("My name is JR, I am a Barce fan! \n I love football");
            myWriter.close();
            System.out.println("file open successfully!");
        } catch (IOException e){
            System.out.println("An error occured..");
            e.printStackTrace();
        }
    }
}
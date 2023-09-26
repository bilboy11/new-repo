import java.io.File;
import java.io.IOException;
class CreatFile {
    public static void main(String[] args) {
        try{
            File myFile = new File("jrdoc.txt");
            if (myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
import java.io.File;
class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("bilaldoctodelete.txt");
        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete file.");
        }
    }
}
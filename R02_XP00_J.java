import java.io.File;

public class R02_XP00_J {

    public static void main(String[] args) {
        File someFile = new File("someFileName.txt");

        // Non-compliant: ignores return value
        someFile.delete();

        // Compliant: checks return value
        if (!someFile.delete()) {
            System.out.println("File deletion failed");
        }
    }
}
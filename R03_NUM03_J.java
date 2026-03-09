import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static void main(String[] args) throws IOException {
        byte[] data = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};

        DataInputStream is1 = new DataInputStream(new ByteArrayInputStream(data));
        // Non-compliant: int cannot hold full unsigned 32-bit value
        int nonCompliant = is1.readInt();
        System.out.println("Non-compliant: " + nonCompliant);

        DataInputStream is2 = new DataInputStream(new ByteArrayInputStream(data));
        // Compliant: long can hold full unsigned 32-bit value
        long compliant = is2.readInt() & 0xFFFFFFFFL;
        System.out.println("Compliant: " + compliant);
    }
}
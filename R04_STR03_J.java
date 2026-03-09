import java.math.BigInteger;

public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");

        // Non-compliant: encodes noncharacter data as string
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
        System.out.println("Non-compliant: " + x);

        // Compliant: uses toString() for valid character data
        String s2 = x.toString();
        byte[] byteArray2 = s2.getBytes();
        String ns = new String(byteArray2);
        x = new BigInteger(ns);
        System.out.println("Compliant: " + x);
    }
}
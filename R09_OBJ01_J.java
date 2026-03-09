public class R09_OBJ01_J {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};

        // Non-compliant: returns reference to internal array
        int[] nonCompliant = data;
        nonCompliant[0] = 99;
        System.out.println("Non-compliant data[0]: " + data[0]); // changed!

        // Compliant: returns a copy
        int[] compliant = data.clone();
        compliant[0] = 55;
        System.out.println("Compliant data[0]: " + data[0]); // unchanged
    }
}
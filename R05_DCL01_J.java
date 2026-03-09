public class R05_DCL01_J {
    public static void main(String[] args) {
        int x = 10;

        // Non-compliant: variable shadowing
        {
            int x2 = 20; // should be x but shadows outer x
            System.out.println("Non-compliant: " + x2);
        }

        // Compliant: clear distinct variable names
        {
            int innerX = 20;
            System.out.println("Compliant: " + (x + innerX));
        }
    }
}
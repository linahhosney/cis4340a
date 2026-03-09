public class R07_ERR00_J {
    public static void main(String[] args) {
        // Non-compliant: catches generic Exception
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("Non-compliant caught: " + e.getMessage());
        }

        // Compliant: catches specific exception
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Compliant caught: " + e.getMessage());
        }
    }
}
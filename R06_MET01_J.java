public class R06_MET01_J {
    public static void main(String[] args) {
        // Non-compliant: uses assertions to validate
        // assert x != Integer.MIN_VALUE;
        // assert y != Integer.MIN_VALUE;

        int x = 3, y = 4;

        // Compliant: uses exceptions to validate
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }
        System.out.println("Result: " + (absX + absY));
    }
}
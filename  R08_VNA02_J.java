public class R08_VNA02_J {

    // Non-compliant: not volatile
    static int sharedValue = 0;

    // Compliant: volatile ensures visibility across threads
    static volatile int safeValue = 0;

    public static void main(String[] args) {
        sharedValue++;
        safeValue++;
        System.out.println("Non-compliant value: " + sharedValue);
        System.out.println("Compliant value: " + safeValue);
    }
}
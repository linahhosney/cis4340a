import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    static Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        String username = "hacker\nAdmin";

        // Non-compliant: logs unsanitized input
        logger.severe("User login failed for: " + username);

        // Compliant: sanitize before logging
        String safe = Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
        logger.severe("User login failed for: " + safe);
    }
}
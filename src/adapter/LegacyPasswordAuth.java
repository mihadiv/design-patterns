package src.adapter;

// OldSystem
public class LegacyPasswordAuth implements AbstractOldAuthSystem {

    private static final int MAX_ATTEMPTS = 3;
    private int attemptCount = 0;

    @Override
    public boolean login(int password) {

        if (attemptCount >= MAX_ATTEMPTS) {
            System.out.println("Too many failed attempts. Access locked.");
            return false;
        }

        if (password == 1234) {
            System.out.println("Authenticating with password... Success.");
            attemptCount = 0;
            return true;
        } else {
            attemptCount++;
            System.out.println("Authentication failed. Attempt " + attemptCount + "/" + MAX_ATTEMPTS);
            return false;
        }
    }
}

// Legacy inseamna cod vechi, dar inca functional, ce poate fi inlocuit sau adaptat cu ceva nou
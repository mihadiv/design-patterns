package src.adapter;

import java.util.Scanner;

// OLd to New
public class AuthObjectAdapter implements AbstractNewAuthSystem {

    private AbstractOldAuthSystem oldAuthSystem;

    public AuthObjectAdapter(AbstractOldAuthSystem oldAuthSystem) {
        this.oldAuthSystem = oldAuthSystem;
    }

    @Override
    public boolean biometricLogin() {
        System.out.println("Facial scan cannot be performed. Enter password:");
        Scanner scanner = new Scanner(System.in);
        int password = scanner.nextInt();
        return oldAuthSystem.login(password);
    }
}

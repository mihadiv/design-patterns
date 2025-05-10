package src.adapter;

import java.util.Scanner;

public class AuthClassAdapterLegacy extends LegacyPasswordAuth implements AbstractNewAuthSystem {
    @Override
    public boolean biometricLogin() {
        System.out.println("Facial scan cannot be performed. Enter password:");
        Scanner scanner = new Scanner(System.in);
        int password = scanner.nextInt();
        return this.login(password);
    }
}

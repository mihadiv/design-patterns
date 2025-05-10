package src.adapter;

public class FaceIDAuth implements AbstractNewAuthSystem {

    @Override
    public boolean biometricLogin() {
        System.out.println("Authenticating with FaceID...Success.");
        return true;
    }
}

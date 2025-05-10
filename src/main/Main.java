package src.main;

import src.proxy.AbstractStreamingService;
import src.proxy.StreamingAccessProxy;
import src.proxy.StreamingService;

public class Main {

    public static void main(String[] args) {

        // ------- 1. ADAPTER -------
        // cand nu mai merge scanarea faciala se va introduce parola
        /*
        AbstractNewAuthSystem newAuthSystem = new FaceIDAuth();
        newAuthSystem.biometricLogin();

        //v1 - src.adapter pe baza de compozitie
        newAuthSystem = new AuthObjectAdapter(new LegacyPasswordAuth());
        newAuthSystem.biometricLogin();
        //v2 - src.adapter pe baza de mostenire
        newAuthSystem = new AuthClassAdapter();
        newAuthSystem.biometricLogin();
        */

        //------- 2. FACADE -------

       /*
        SmartHomeFacade smartHome = new SmartHomeFacade();
        smartHome.leaveHome();
        smartHome.arriveHome();
        smartHome.goodNight();
        */


        //------- 3. PROXY -------

        /*
        // Test direct al serviciului real
        AbstractStreamingService streamingService = new StreamingService();
        boolean result = streamingService.watchVideo("Titanic");
        System.out.println("Watch Titanic (direct): " + (result ? "SUCCESS" : "FAILURE"));
        System.out.println();

        // Folosim proxy-ul care limiteaza accesul
        streamingService = new StreamingAccessProxy(new StreamingService());
        for (int i = 0; i < 5; i++) {
            // streamingService.watchVideo("Planeta maimutelor");
            result = streamingService.watchVideo("Avatar");
            System.out.println("Watch attempt " + (i + 1) + ": " + (result ? "SUCCESS" : "BLOCKED"));
        }
        // Inca un test dupa limita
        result = streamingService.watchVideo("Avatar");
        System.out.println("Final attempt after limit: " + (result ? "SUCCESS" : "BLOCKED"));
        */

        //------- 4. COMPOSITE -------


    }
}

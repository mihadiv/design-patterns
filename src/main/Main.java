package src.main;

import src.chain.HRDepartment;
import src.chain.LeaveRequestHandler;
import src.chain.Manager;
import src.chain.TeamLead;
import src.composite.NotificationGroup;
import src.composite.NotificationTarget;
import src.composite.UserDevice;
import src.decorator.Beverage;
import src.decorator.CoffeeWithMilk;
import src.decorator.CoffeeWithSugar;
import src.decorator.SimpleCoffe;
import src.flyweight.CustomEmojiFactory;
import src.flyweight.EmojiPosition;
import src.flyweight.EmojiSymbol;
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

        /*
        NotificationTarget iCloudGroup = new NotificationGroup();
        NotificationTarget phone = new UserDevice("Mihaela's Iphone");
        NotificationTarget tablet = new UserDevice("Mihaela's Ipad");
        NotificationTarget laptop = new UserDevice("Mihaela's Macbook");

        iCloudGroup.addTarget(phone);
        iCloudGroup.addTarget(tablet);
        iCloudGroup.addTarget(laptop);

        iCloudGroup.send("System update available!");
        */

        //------- 5. FLYWEIGHT -------

        /*
        CustomEmojiFactory factory = new CustomEmojiFactory();
        EmojiSymbol emojiSymbol1 = factory.getEmoji("heart");
        emojiSymbol1.display(new EmojiPosition(1, 1));

        EmojiSymbol emojiSymbol2 = factory.getEmoji("smiley-face");
        emojiSymbol2.display(new EmojiPosition(1, 2));

        EmojiSymbol emojiSymbol3 = factory.getEmoji("heart");
        emojiSymbol3.display(new EmojiPosition(1, 3));

        EmojiSymbol emojiSymbol4 = factory.getEmoji("monkey");
        emojiSymbol4.display(new EmojiPosition(1, 7));

        System.out.println("Factory is currently having: "
                + factory.getEmojisCreated() + " unique emoji instances.");
         */

        //------- 6. DECORATOR -------

        /*
        Beverage coffe = new SimpleCoffe();
        coffe.prepare();

        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(coffe);
        coffeeWithMilk.addMilk();

        CoffeeWithSugar coffeeWithSugar = new CoffeeWithSugar(coffe);
        coffeeWithSugar.setSugarTeaspoons(2);
        System.out.println("Adding " + coffeeWithSugar.getSugarTeaspoons() + " teaspoon(s) of sugar...");
        coffeeWithSugar.serve();
        */

        //------- 7. CHAIN OF RESPONSABILITY -------

        /*
        LeaveRequestHandler teamLead = new TeamLead();
        LeaveRequestHandler manager = new Manager();
        LeaveRequestHandler hr = new HRDepartment();
        teamLead.setNextHandler(manager);
        manager.setNextHandler(hr);

        teamLead.approve(1);
        teamLead.approve(4);
        teamLead.approve(10);

        manager.approve(2);
        manager.approve(5);
        manager.approve(9);
        */

        //------- 8. COMMAND -------

    }
}

















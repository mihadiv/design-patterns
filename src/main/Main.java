package src.main;

import src.command.Canvas;
import src.command.DrawCircleCommand;
import src.command.DrawRectangleCommand;
import src.command.DrawingBoard;
import src.observer.CityWeatherStation;
import src.observer.WeatherAppClient;
import src.observer.WeatherStation;
import src.strategy.AscendingSort;
import src.strategy.DescendingSort;
import src.strategy.Sorter;

import java.util.ArrayList;
import java.util.List;

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

        /*
        Canvas canvas = new Canvas();
        DrawCircleCommand circle = new DrawCircleCommand(canvas);
        DrawRectangleCommand rectangle = new DrawRectangleCommand(canvas);

        DrawingBoard board = new DrawingBoard();
        board.addCommand(circle);
        board.addCommand(rectangle);
        board.drawAll();

        DrawCircleCommand otherCircle = new DrawCircleCommand(canvas);
        board.addCommand(otherCircle);
        board.drawAll();
        */

        //------- 9. STRATEGY -------

        /*
        Sorter sorter = new Sorter();
        List<Integer> values = List.of(4, 1, 7, 3);
        System.out.println("List before sorting: " + values);

        sorter.setSortStrategy(new AscendingSort());
        List<Integer> result = sorter.sort(values);
        System.out.println("Ascending: " + result);

        sorter.setSortStrategy(new DescendingSort());
        System.out.println("Descending: " + sorter.sort(values));

        sorter.setSortStrategy(list -> list.stream()
                .filter(i -> i % 2 != 0)
                .sorted()
                .toList()
        );
        result = sorter.sort(values);
        System.out.println("Odd numbers only (sorted): " + result);
        */

        //------- 10. OBSERVER -------

        CityWeatherStation westCoastStation = new CityWeatherStation("Los Angeles");
        WeatherAppClient user1 = new WeatherAppClient();
        WeatherAppClient user2 = new WeatherAppClient();
        westCoastStation.subscribe(user1);
        westCoastStation.subscribe(user2);
        westCoastStation.notifiObservers("Thank you for subscribing!");
        westCoastStation.updateWeather("Rain expected tomorrow");
        westCoastStation.unsubscribe(user1);
        westCoastStation.updateWeather("Sunny and warn today");

    }
}

















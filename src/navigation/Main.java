package navigation;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Location start = new Location("Baiterek", 51.1283, 71.4305);
        Location finish = new Location("Expo", 51.0900, 71.4160);

        Map<String, RouteStrategy> strategies = new LinkedHashMap<>();
        strategies.put("car", new CarStrategy());
        strategies.put("walk", new WalkStrategy());
        strategies.put("cycle", new CycleStrategy());

        Navigator navigator = new Navigator(strategies.get("car"));

        System.out.println("From " + start.name() + " to " + finish.name());
        for (Map.Entry<String, RouteStrategy> entry : strategies.entrySet()) {
            navigator.setStrategy(entry.getValue());
            System.out.println(navigator.planRoute(start, finish));
        }
    }
}

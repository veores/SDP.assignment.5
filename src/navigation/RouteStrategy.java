package navigation;

public interface RouteStrategy {

    Route buildRoute(Location from, Location to);
}

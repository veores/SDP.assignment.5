package navigation;

public class CycleStrategy implements RouteStrategy {

    private static final String MODE_NAME = "cycle";
    private static final double PATH_WINDING_FACTOR = 1.20;
    private static final double AVERAGE_SPEED_KMH = 15.0;

    @Override
    public Route buildRoute(Location from, Location to) {
        double distanceKm = DistanceCalculator.straightLineKm(from, to) * PATH_WINDING_FACTOR;
        int durationMinutes = (int) Math.round(distanceKm / AVERAGE_SPEED_KMH * 60);
        return new Route(MODE_NAME, distanceKm, durationMinutes);
    }
}

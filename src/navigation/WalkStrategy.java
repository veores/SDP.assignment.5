package navigation;

public class WalkStrategy implements RouteStrategy {

    private static final String MODE_NAME = "walk";
    private static final double PATH_WINDING_FACTOR = 1.15;
    private static final double AVERAGE_SPEED_KMH = 5.0;

    @Override
    public Route buildRoute(Location from, Location to) {
        double distanceKm = DistanceCalculator.straightLineKm(from, to) * PATH_WINDING_FACTOR;
        int durationMinutes = (int) Math.round(distanceKm / AVERAGE_SPEED_KMH * 60);
        return new Route(MODE_NAME, distanceKm, durationMinutes);
    }
}

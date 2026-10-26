package navigation;

public record Route(String mode, double distanceKm, int durationMinutes) {

    @Override
    public String toString() {
        return String.format("%-6s | %5.2f km | %3d min", mode, distanceKm, durationMinutes);
    }
}

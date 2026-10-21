public class exercise6 {
    public static void main(String[] args) {
        double fullTank = 40;               // full tank capacity in litres
        double fuelPer100kmNormal = 8;      // 8 liters per 100 km on normal road
        double fuelPer100kmRough = fuelPer100kmNormal * 1.15; // 15% more fuel on rough roads

        // Fuel consumption per kilometer
        double fuelPerKmNormal = fuelPer100kmNormal / 100;
        double fuelPerKmRough = fuelPer100kmRough / 100;

        // Maximum travel distance = total fuel / fuel per km
        double distanceNormalRoad = fullTank / fuelPerKmNormal;
        double distanceRoughRoad = fullTank / fuelPerKmRough;

        System.out.println("Maximum travel distance on normal roads: " + distanceNormalRoad + " km");
        System.out.println("Maximum travel distance on rough roads: " + distanceRoughRoad + " km");
    }
}

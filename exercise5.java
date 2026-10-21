public class exercise5 {
    public static void main(String[] args) {
        final double PI = 3.14;
        double sunDiameter = 865000;     // miles
        double earthDiameter = 7600;     // miles

        // Calculate radius: radius = diameter / 2
        double sunRadius = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;

        // Sphere volume formula: Volume = (4/3) * pi * r^3
        double sunVolume = (4.0 / 3) * PI * Math.pow(sunRadius, 3);
        double earthVolume = (4.0 / 3) * PI * Math.pow(earthRadius, 3);

        // Volume ratio of Sun to Earth
        double volumeRatio = sunVolume / earthVolume;

        // Print outputs
        System.out.println("Volume of the Earth in cubic miles: " + earthVolume);
        System.out.println("Volume of the Sun in cubic miles: " + sunVolume);
        System.out.println("Ratio of Sun volume to Earth volume: " + volumeRatio);
    }
}

public class EarthVolume {
  public static void main(String[] args) {

    // Radius of Earth in kilometers
    double radiusKm = 6378.0;

    // 1 km = 0.621371 miles
    double radiusMiles = radiusKm * 0.621371;

    // Volume of a sphere = (4/3) * π * r³
    double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
    double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

    System.out.printf("The volume of earth in cubic kilometers is %.2f%n", volumeKm);
    System.out.printf("The volume of earth in cubic miles is %.2f%n", volumeMiles);
  }
}
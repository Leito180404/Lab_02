package Ciudad;

/** Representa una ubicacion de la ciudad. */

public class Location {
    private final String nombre;
    private final double lat;
    private final double lon;

    public Location(String nombre, double lat, double lon) {
        this.nombre = nombre;
        this.lat = lat;
        this.lon = lon;
    }

    public String getNombre() { return nombre; }
    public double getLat() { return lat; }
    public double getLon() { return lon; }
}

package exercise4;

public class KmlService {

    public String toKML(double[] coordinates) {
        String kml = "<Placemark>\n";
        kml += "<name>GeoJSON Point</name>\n";
        kml += "<Point>" + "Point" + "</Point>\n";
        kml += "<coordinates>" + coordinates[0] + "," + coordinates[1] + "," + coordinates[2] + "</coordinates>\n";
        kml += "</Placemark>\n";
        return kml;
    }
}

package exercise4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KmlAdapter implements Adapter{

    private KmlService kml;

    public KmlAdapter() {
        this.kml = new KmlService();
    }

    @Override
    public String processData(double[] coordinates) {
        Pattern pattern = Pattern.compile("<coordinates>(.*?)</coordinates>");
        Matcher matcher = pattern.matcher(kml.toKML(coordinates));

        String coordinatesFound = "";
        if (matcher.find()) {
            coordinatesFound = matcher.group(1);
        }

        String[] parts = coordinatesFound.split(",");
        String geoJson = "{ \"type\": \"Point\", \"coordinates\": " + Arrays.toString(parts) + " }";

        return geoJson;
    }

}

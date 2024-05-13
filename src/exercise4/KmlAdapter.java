package exercise4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KmlAdapter implements IGeo {

    private IKml kml;

    public KmlAdapter(IKml kml) {
        this.kml = kml;
    }

    @Override
    public String processData() {
        Pattern pattern = Pattern.compile("<coordinates>(.*?)</coordinates>");
        Matcher matcher = pattern.matcher(kml.toKML());

        String coordinates = "";
        if (matcher.find()) {
            coordinates = matcher.group(1);
        }

        String[] parts = coordinates.split(",");
        String geoJson = "{ \"type\": \"Point\", \"coordinates\": " + Arrays.toString(parts) + " }";

        return geoJson;
    }

}

package exercise4;

import java.util.Arrays;

public class GeoJsonData implements IGeoJson {
    private double[] coordinates;

    public GeoJsonData(double[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toJson() {
        return "{ \"type\": \"Point\", \"coordinates\": " + Arrays.toString(coordinates) + " }";
    }
}

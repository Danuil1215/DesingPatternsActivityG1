package src.exercise4;

import java.util.Arrays;

public class GeoJsonData {
    private double[] coordinates;

    public GeoJsonData(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public String toJson() {
        return "{ \"type\": \"Point\", \"coordinates\": " + Arrays.toString(coordinates) + " }";
    }
}

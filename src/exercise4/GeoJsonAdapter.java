package exercise4;

public class GeoJsonAdapter implements IGeo {

    private IGeoJson iGeoJson;

    public GeoJsonAdapter(IGeoJson iGeoJson) {
        this.iGeoJson = iGeoJson;
    }

    @Override
    public String processData() {
        return iGeoJson.toJson();
    }
}

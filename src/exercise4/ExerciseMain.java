package exercise4;

public class ExerciseMain {

    public static void main(String[] args) {

        double[] coordinates = {100.0, 0.0, 0.0};

        IGeoJson geoJsonData = new GeoJsonData(coordinates);
        IGeo geo = new GeoJsonAdapter(geoJsonData);
        String geoJson = geo.processData();
        System.out.println("Procesar coordenadas con GeoJson : " + geoJson);

        IKml kmlData = new KmlData(coordinates);
        IGeo geoKml = new KmlAdapter(kmlData);
        System.out.println("Procesar coordenadas con KML: "+geoKml.processData());

    }

}
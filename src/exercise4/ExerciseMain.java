package src.exercise4;

public class ExerciseMain {

    public static void main(String[] args) {

        double[] coordinates = {100.0, 0.0, 0.0};

        /*
        Usually the system used to use the GeoJsonData.java library but due to a security risk It was declared deprecated
         */
        GeoJsonData geoJsonData = new GeoJsonData(coordinates);
        String response = geoJsonData.toJson();
        System.out.println("The response with the previous library was : "+response);

        /*
        Now, we have to use a KML library KmlService.java and parse the data with KmlAdapter.java to get GeoJSON response
         */

        Adapter adapter = new KmlAdapter();
        String response2= adapter.processData(coordinates);
        System.out.println("The response with the new library was : "+response2);

    }

}
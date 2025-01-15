package Map;

public class Main {
    public static void main(String[] args) {
        var commonHouses = new House[] {
                new House("Lanini Bhavan", "102.3456,-420.5234"),
                new House("Grand villa", "202.7567,-125.6519"),
                new House("Killer House", "422.3453,-342.5342")
        };

        Layer<House> houseObject = new Layer<>(commonHouses);

        houseObject.renderLayer();

        var commonRivers = new River[] {
                new River("Bay of bengal", "102.3234,123.6564,789.4343"),
                new River("Ganga", "2124.5435,786.5424")
        };

        Layer<River> reverObject = new Layer<>(commonRivers);

        reverObject.renderLayer();

        reverObject.addElements(
                new River("kaveri", "143.4334,432.1245"),
                new River("Jamuna", "645.6435,234.6454"));

        reverObject.renderLayer();
    }
}

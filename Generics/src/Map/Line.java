package Map;

import java.util.Arrays;

public class Line implements MapableInterface {

    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];

        int index = 0;
        for (var i : locations) {
            this.locations[index++] = MapableInterface.stringToLatLong(i);
        }
    }

    public void render() {
        System.out.println("Render " + this + "as LINE(" + locations() + ")");
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }
}

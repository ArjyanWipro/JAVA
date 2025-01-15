package Map;

import java.util.Arrays;

abstract class Point implements MapableInterface {

    private double[] location = new double[2];

    public Point(String location) {

        this.location = MapableInterface.stringToLatLong(location);
    }

    public void render() {
        System.out.println("Render " + this + "- POINT(" + location() + ")");
    }

    public String location() {
        return Arrays.toString(location);
    }
}

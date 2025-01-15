package Map;

public class House extends Point {

    String houseName;

    public House(String houseName, String location) {
        super(location);
        this.houseName = houseName;

    }

    @Override
    public String toString() {

        return houseName + " House";
    }
}

package Map;

public class River extends Line {

    String riverName;

    public River(String riverName, String... locations) {
        super(locations);
        this.riverName = riverName;

    }

    @Override
    public String toString() {
        return riverName + " River";
    }
}
package InterfaceChallenge;



public class Building implements MappingInterface{
    private String name;
    private UsageType usage; //enum reference

    public Building(String name, UsageType usage){
        this.name=name;
        this.usage=usage;
    }

    @Override
    public String getLabel() {
        return name+"("+usage+")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
       return switch (usage) {
            case ENTERTAINMENT->colors.GREEN +" "+ PointMaker.TRIANGLE;
            case GOVERNMENT->colors.RED+" "+PointMaker.STAR;
            case RESIDENTIAL->colors.BLUE+" "+PointMaker.SQUARE;
            case SPORTS->colors.ORANGE+" "+PointMaker.PUSH_PIN;

            default-> colors.BLACK+" "+PointMaker.CIRCLE;
        };
    }

    @Override
    public String toJson(){
        return MappingInterface.super.toJson()+"""
                "name"+{%s},"usage"+{%s}
                """.formatted(name,usage);
    }
}

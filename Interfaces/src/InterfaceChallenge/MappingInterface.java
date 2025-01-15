package InterfaceChallenge;

//Enum classes
enum colors{RED,GREEN,BLUE,WHITE,ORANGE,BLACK}

enum PointMaker{CIRCLE,PUSH_PIN,STAR,SQUARE,TRIANGLE}

enum LineMaker{DASHED,DOTTED,SOLID}

enum Geometry{POLYGONE,POINT,LINE}

enum UsageType {ENTERTAINMENT,GOVERNMENT,RESIDENTIAL,SPORTS}

public interface MappingInterface {
String JSON_PROPERTY="""
        "Properties": {%s}
        """;
    String getLabel();
    Geometry getShape();
    String getMarker();

default String toJson(){
        return"""
                "type":{%s},"lable":{%s},"marker":{%s}
                """.formatted(getShape(),getLabel(),getMarker());
    }

   static void mapIt(MappingInterface mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJson()));
    }
}

public class Car {
    private String carName="Tesla";
    private String carModel="X";
    private int totalDoors=4;
    private boolean fule= true;

    //gettes
    public String getCarname(){
        return carName;
    }

    public String getCarModel(){
        return carModel;
    }

    public int getTotalDoors(){
        return totalDoors;
    }

    public boolean getFule(){
        return fule;
    }


    //setters
    public void setCarname(String carName){
       this.carName=carName;
    }

    public void setCarModel(String carModel){
        this.carModel=carModel;
    }

    public void setTotalDoors(int totalDoors){
        this.totalDoors=totalDoors;
    }

    public void setFule(boolean fule){
        this.fule=fule;
    }

    public void carDescription(){
        System.out.println("car name is "+carName+" car model is "+carModel+" Total doors is "+totalDoors+" The car is running on "+(fule?"Electric":"desel"));
    }

}

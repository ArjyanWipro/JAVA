
interface Manufatureing extends Fly,Making,Refule{
     String COUNTRY= "India";
     double TOTALKM= 10000;
     void makingCost();
}


interface Fly{
    void takeOff();
    void flightDetails();
    void landing();
}

interface Making{
    void parts();
    void cost();
}

interface Refule{
    void tankDetails();
    void fulePrice();
}

public abstract class BasicInterface {
    
    public abstract void abstractClassDetails();
}

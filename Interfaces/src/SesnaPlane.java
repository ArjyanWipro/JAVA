
public class SesnaPlane extends BasicInterface implements Fly,Making,Refule{

    //Implemanting fly interface methods
    public void takeOff(){
        System.out.println(getClass().getSimpleName()+" is taking off");
    }

    public void flightDetails(){
        System.out.println("Total 300 passengers are sitting in this "+getClass().getSimpleName()+" plane");    
    }

    public void landing(){
        System.out.println(getClass().getSimpleName()+" is landing now");
    }

    //Implementing making interface methods

    public void parts(){
        System.out.println("Total parts is 235");
    }

    public void cost(){
        System.out.println("Total costed 2.5 bilion for this "+getClass().getSimpleName());    
    }

    //abstract class method

    public void abstractClassDetails(){
        System.out.println("This is the abstract class method");
    }

    public void tankDetails(){
        System.out.println("150 liter tank");
    }
    public void fulePrice(){
        System.out.println("200 rupees");
    }

}

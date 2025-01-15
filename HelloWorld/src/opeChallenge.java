public class opeChallenge {
    public static void main(String[] args){
        double step1= 20.00d;
        double step2=80.00d;
        double step3= (step1+step2)*100.00;
        double step4= step3 % 40.00;
        boolean step5= step4==0.00?true:false;
        System.out.println(step5);
            if (!step5){
            System.out.println("You got some reminder");
            }
    }
}

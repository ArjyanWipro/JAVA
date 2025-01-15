public class console {
    public static void main(String[] args){
        inputFormConsole(2024);
    }

    public static void inputFormConsole(int currentYear){
        String name= System.console().readLine("What is your name");
        System.out.println("Hi,"+name);
        String ageInString= System.console().readLine("What is your date of Birth");
        int age=Integer.parseInt(ageInString);
        age=currentYear-age;
        System.out.println("So, You are "+age+" year old");
    }
    
}
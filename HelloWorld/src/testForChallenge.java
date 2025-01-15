public class testForChallenge {
public static void main(String args[]){

String string="23/10/2002";
int indexOf=string.indexOf("2002");
String subString=string.substring(indexOf);
System.out.println("-".repeat(10));
System.out.println(subString);
}
}
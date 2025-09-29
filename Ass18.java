import java.util.*;
class Ass18{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
if(s1.toLowerCase().contains(s2.toLowerCase()))
System.out.println("The sentence contains the substring \""+s2.toLowerCase()+"\".");
else
System.out.println("Not Found");
}
}
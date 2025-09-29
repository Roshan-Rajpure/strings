import java.util.*;
class Ass16{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer sb=new StringBuffer(s);
if(s.equals(sb.reverse().toString()))
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
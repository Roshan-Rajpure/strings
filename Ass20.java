import java.util.*;
class Ass20{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String arr[]=s.split(" ");
for(String w:arr){
StringBuffer sb=new StringBuffer(w);
System.out.print(sb.reverse().toString()+" ");
}
}
}
import java.util.*;
class Ass11{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
if(s1.equals(s2))
System.out.println("Difference = 0");
else{
for(int i=0;i<Math.min(s1.length(),s2.length());i++){
if(s1.charAt(i)!=s2.charAt(i)){
System.out.println("Difference = "+Math.abs(s1.charAt(i)-s2.charAt(i)));
break;
}
}
}
}
}
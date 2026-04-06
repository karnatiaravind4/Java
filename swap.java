import java.util.*;
public class swap{
public static void main(String args[]){
int c;
Scanner in=new Scanner(System.in);
System.out.println("Enter the numbers");
int a=in.nextInt();//2
int b=in.nextInt();//5
System.out.println("Before Swaping: a=" + a + ", b = "+ b);
c=a;//2
a=b;//5
b=c;//2
System.out.println("After Swapping: a=" + a + ", b = " + b);
}}
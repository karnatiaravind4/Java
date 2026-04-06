import java.util.*;
public class factorial{
public static void main(String args[]){
int n,num,fact;
Scanner in=new Scanner(System.in);
System.out.print("Enter the number : ");//4
n=in.nextInt();
num=n;
fact=1;
while(n>0){//4>0T 
fact=fact*n;//1*4=4 4*3=12 12*2
n--;
}
System.out.print("the factorial of " + num + " is " + fact);
}}




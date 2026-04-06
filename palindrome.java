import java.util.*;
public class palindrome{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,temp,rev=0;
System.out.println("enter the number");//121
n=in.nextInt();
temp=n;
while(n>0){//121
int digit=n%10;
rev=rev*10+digit;
n=n/10;
}
if(rev==temp){
System.out.print(temp + "is a palindrome");
}
else{
System.out.print(temp + "is not a palindrome");
}}}
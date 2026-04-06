import java.util.*;
public class armstrong{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int temp=n;
int arm=0;
while(temp>0){ //153
int digit=temp%10;//3
arm=arm+(digit*digit*digit);
temp=temp/10;
}
if(arm==n){
System.out.println(n + "is a Armstrong number");
}
else{
System.out.println("it is not an armstrong number");
}}}


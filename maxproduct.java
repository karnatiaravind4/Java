//Maximum Product of Two Elements
import java.util.*;
public class maxproduct{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();//-10,-3,5
}
int max=a[0]*a[1];
for(int i=0;i<n;i++){//-10
for(int j=i+1;j<n;j++){//-3
int mul=a[i]*a[j];//-10*-3=30 -50
if(mul>max){
max=mul;
}}}
System.out.println(max);
}}






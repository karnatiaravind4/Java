import java.util.*;
public class seperate{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the array size :");
int n=in.nextInt();
System.out.println("Enter the array elements :");
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
System.out.print("The even numbers are :");
for(int i=0;i<n;i++){
if(a[i]%2==0){
System.out.print(a[i] + " ");
}}
System.out.println();
System.out.print("The odd numbers are :");
for(int i=0;i<n;i++){
if(a[i]%2!=0){
System.out.print(a[i] + " ");
}}
}}
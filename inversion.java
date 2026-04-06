import java.util.*;
public class inversion{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt(); //2 4 1 3 5
}
int c=0;
for(int i=0;i<n;i++){ //
for(int j=i+1;j<n;j++){ //2
if(a[i]<a[j]){ //2<4 2<1 //1 4 2 3 5 4<2 1 2 4 3 5 
c=a[j];
//1 //2
}c++; 

}}
System.out.print(c);
}}






import java.util.*;
class largest{
public static void main(String args[]){
int c=0;
Scanner in=new Scanner(System.in);
System.out.print("enter the size of the elements :");
int n=in.nextInt();
System.out.print("enter the array elements :");
int a[]=new int[n];    //1,2,3,4
for(int i=0;i<n;i++){  //2
a[i]=in.nextInt();
}
c=a[0];//2
for(int i=1;i<n;i++){
if(a[i]>c){//3>2
c=a[i];//3
}}
System.out.println("The largest element is :" +c);

}}


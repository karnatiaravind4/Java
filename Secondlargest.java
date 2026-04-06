import java.util.*;
public class Secondlargest{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n=in.nextInt();
int a[]=new int[n];
System.out.println("Enter the array elements:");
for(int i=0;i<n;i++){
a[i]=in.nextInt();//1,2,3,4
}
Arrays.sort(a);
System.out.println("Second largest element is: " + a[n - 2]);
}}



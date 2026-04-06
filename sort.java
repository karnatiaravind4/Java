import java.util.*;
public class sort{
public static void main(String args[]){
System.out.print("Enter the size:");
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];
System.out.println("Enter the array elements:");
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
Arrays.sort(a);
System.out.print("Sorted array is :"+ Arrays.toString(a));
Collections.reverse(Arrays.asList(a));
}}

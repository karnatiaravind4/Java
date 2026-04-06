import java.util.*;
public class decending{
public static void main(String args[]){
System.out.print("Enter the Size:");
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];//4,5,7,1
System.out.print("Enter the array elements:");
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
Arrays.sort(a);//1 12 21 32
System.out.print("The decending order is :");
for(int i=a.length-1;i>=0;i--){//32 21
System.out.print(a[i] + " ");
}}}
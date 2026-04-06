//Count Pairs with Difference
import java.util.*;
public class difference{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
int count=0;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
int diff=a[i]-a[j];
if(diff<0){
diff=-diff;
}
if(diff==k){
count++;
}
}}
System.out.println(count);
}}

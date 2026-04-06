import java.util.*;
class leader{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
int small=a[n-1];
for(int i=n-2;i>=0;i--){
if(a[i]>small){
System.out.print(a[i]+" ");
small=a[i];

}}

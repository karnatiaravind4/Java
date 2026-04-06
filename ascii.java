import java.util.*;
class ascii{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int start=in.nextInt();
int end=in.nextInt();
for(int i=start;i<=end;i++){
char ch=(char)i;
System.out.println(i+":" +ch +" ");
}}}
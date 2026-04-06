import java.io.*;
import java.util.*;
public class digitmaximum{
    public static void main(String[] args){
     Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c[]=new int[10];
        for(int i=0;i<n;i++){
            int num=in.nextInt();
            while(num!=0){
                c[num%10]++;
                num=num/10;
            }
        }
        int maxcount=0,maxdigit=0;
        for(int i=0;i<=9;i++){
            if(c[i]>maxcount){
                maxcount=c[i];
                maxdigit=i;
            }
        }
        System.out.print(maxdigit);
    }
}
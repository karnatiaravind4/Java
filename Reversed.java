import java.util.*;

public class Reversed {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();   // size of array
        int a[] = new int[n];

        // Taking input
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        // Reversing the array
        int start = 0;
        int end = n - 1;

        while(start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        // Printing reversed array
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        in.close();
    }
}

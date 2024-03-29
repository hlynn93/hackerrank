import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation {

    static int[] solve(int k, int[] a) {
        int[] solvedArr = new int[a.length];
        for(int i=0; i<a.length; i++) {
            solvedArr[(i+k)%(a.length)] = a[i];
        }
        return solvedArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] solvedArr = solve(k, a);
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(solvedArr[m]);
        }
    }
}

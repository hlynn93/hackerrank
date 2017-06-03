import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b){
        
        int largestA = a[a.length-1];
        int smallestA = a[0];
        int smallestB = b[0];

        int total = 0, curVal = largestA;

        while(curVal <= smallestB) {

            boolean flag = true;
            for (int eleA : a) {
                if(curVal%eleA != 0) {
                    flag = false;
                }
            }

            if(flag) {
                for (int eleB : b) {
                    if(eleB%curVal != 0) {
                        flag = false;
                    }
                }
            }

            curVal++;
            if(flag)
                total++;
        }
        
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}

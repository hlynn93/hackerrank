import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetite {

    static int solve(int c, int[] dishes, int k) {
        int total = 0;
        for (int dish : dishes) {
            total += dish;
        }
        int annaShare = total/2;
        annaShare -= dishes[k]/2;
        return c-annaShare;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] dishes = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            dishes[s_i] = in.nextInt();
        }
        int c = in.nextInt();
        
        int diff = solve(c, dishes, k);
        System.out.println(diff == 0 ? "Bon Appetit" : diff);
    }
}
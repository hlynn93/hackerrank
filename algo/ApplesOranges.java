import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ApplesOranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apples = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apples[apple_i] = in.nextInt();
        }
        int[] oranges = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            oranges[orange_i] = in.nextInt();
        }

        int numApples = 0, numOranges = 0;

        for (int apple : apples) {
            if(isInRange(apple + a, s, t)) {
                numApples++;
            }
        }

        for (int orange : oranges) {
            if(isInRange(orange + b, s, t)) {
                numOranges++;
            }
        }
        
        System.out.println(numApples);
        System.out.println(numOranges);
    }

    static boolean isInRange(int value, int start, int end) {
        return value >= start && value <= end;
    }
}

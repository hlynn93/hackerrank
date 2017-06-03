import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        boolean flag = false;
        int prevDiff = Integer.MAX_VALUE, curDiff = Integer.MAX_VALUE - 1;
        if (x1 == x2) {
            flag = true;
        }
        while(curDiff < prevDiff) {
            prevDiff = curDiff;
            x1 += v1;
            x2 += v2;   
            curDiff = Math.abs(x1 - x2);
            if (curDiff == 0) {
                flag = true;
                continue;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}

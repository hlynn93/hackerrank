import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingRecords {

    static int[] getRecord(int[] s){
        int min = s[0], max=s[0];
        int[] records = {0,0};
        for (int score : s) {
            if (score > max) {
                max = score;
                records[0] += 1;
            }
            if (score < min) {
                min = score;
                records[1] += 1;
            }
        }
        return records;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}

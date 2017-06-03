import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratingBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        int max=0, count=0, maxId=0, id=0;
        Arrays.sort(types);
        for (int ele : types) {
            if(id != ele) 
                count = 0;
            id = ele;
            count++;
            if(count > max) {
                max = count;
                maxId = id;
            }
        }
        System.out.println(maxId);
    }
}

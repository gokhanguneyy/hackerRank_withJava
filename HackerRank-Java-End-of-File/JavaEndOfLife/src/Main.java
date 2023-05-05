import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner x = new Scanner(System.in);
        int i = 1;
        while(x.hasNextLine()){
            String message = x.nextLine();
            System.out.println(i + " " + message);
            i++;
        }
    }
}
/**
 * Created by khushali on 3/25/15.
 */

import java.io.*;

public class _01_hello_world {


    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!!");
        int intArray[] = new int[100];

      String s = getString();
        System.out.println(s);

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}

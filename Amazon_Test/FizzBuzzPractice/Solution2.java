/* Both have Big O of n, but this is more efficient code as it removes redundancy */

package Amazon_Test.FizzBuzzPractice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
    for (int i = 1; i <= 100; i++) { 
        String result = ""; 
        if (i % 3 == 0) { 
            result += "Fizz"; 
        } 
        if (i % 5 == 0) { 
            result += "Buzz"; 
        } 
        if (result.isEmpty()) { 
            System.out.println(i); } 
        else { 
            System.out.println(result); 
        } 
    }
    }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}


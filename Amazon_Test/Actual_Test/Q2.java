package Amazon_Test.Actual_Test;

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
    // Define a constant MOD with the value of 1000000007
        private static final int MOD = 1000000007;
    /*
     * Complete the 'getSystemVulnerabilitySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY vulnerability as parameter.
     */

    public static int getSystemVulnerabilitySum(List<Integer> vulnerability) {
    // Write your code here
        // Get the size of the list vulnerability 
        int n = vulnerability.size(); 
        // Initialize arrays to store total and weight values 
        long[] totals = new long[n + 1]; 
        long[] w = new long[n + 1]; 
        // Initialize a stack to store indices
         Stack<Integer> stk = new Stack<>(); 
         // Loop through each element in the list vulnerability
         for (int i = 1; i <= n; i++) { 
            // Get the current element 
            int curr = vulnerability.get(i - 1); 
            // Pop elements from the stack while conditions are met 
            while (!stk.isEmpty() && vulnerability.get(stk.peek() - 1) <= curr) 
                stk.pop(); 
            // Get the index j 
            int j = stk.isEmpty() ? 0 : stk.peek(); 
            // Compute w[i] using the current and previous values 
            w[i] = (w[j] + (long) curr * (i - j)) % MOD; 
            // Compute totals[i] using the current and previous values 
            totals[i] = (totals[j] + w[j] * (i - j) + (long) curr * (i - j) * (i - j + 1) / 2) % MOD; 
            // Push the current index onto the stack 
            stk.push(i); 
            } 
            // Reduce the totals array to a single value and return it 
            return (int) Arrays.stream(totals).reduce(0L, (a, b) -> (a + b) % MOD); 
        }
}
public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int vulnerabilityCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vulnerability = IntStream.range(0, vulnerabilityCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.getSystemVulnerabilitySum(vulnerability);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

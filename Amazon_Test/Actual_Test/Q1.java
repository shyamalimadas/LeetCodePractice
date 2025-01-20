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

    /*
     * Complete the 'getMinimumValue' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY power
     *  2. INTEGER armor
     */

    public static long getMinimumValue(List<Integer> power, int armor) {
    // // Write your code here
    //     //get the size of the power vector
    //     int n = power.size();
        
    //     //Initialise maxVal to -1 to store the maximum value in the power vector
    //     // Initialise totalHealth to 1 (assuming some initial health)
    //     long maxVal = -1, totalHealth = 1;
    //     // a for loop to iterate through each element in the power vector
    //     for (int x: power){
    //         // update maxVal to be the maximum of the current element and maxVal
    //         maxVal = Math.max((long)x, maxVal);
    //         // Add the current element to totalHealth
    //         totalHealth += x;
    //     }
    //     //If the maximum value in the power vector is greater tha armor
    //     if(maxVal > armor) {
    //         // subtract armor from totalHealth
    //         totalHealth -= armor;
    //     } else {
    //         //otherwise, subtract the maximum value from totalHealth 
    //         totalHealth -= maxVal;
    //     }
    //     // return the calculated totalHealth as an integer
    //     return (int) totalHealth;
    long total = 0; // Initialize total to 0 (using long for larger values) 
    int maxEle = 0; // Initialize maxEle to 0 
    // Iterate through the list power to calculate the total and find the maximum element 
    for (int i = 0; i < power.size(); i++) { total += power.get(i); // Add each element to total 
    maxEle = Math.max(maxEle, power.get(i)); // Update maxEle to be the maximum element found so far 
    } 
    // Calculate the value to reduce, which is the minimum of armor and maxEle 
    int toReduce = Math.min(armor, maxEle); 
    // Return the total minus the value to reduce, plus 1 
    return total - toReduce + 1;
    }

}
public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int powerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> power = IntStream.range(0, powerCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int armor = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Result.getMinimumValue(power, armor);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

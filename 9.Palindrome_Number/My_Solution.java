// Using a StringBuilder Class 
//Overall big O notation is O(n) because we are iterating through the string once. There is only assignments and comparisons in the code. 
import java.util.*;

class MySolution {
    public boolean isPalindrome(int x) {
         // conversion of int to string 
        String temp = "" + x; 
  
        // creating stringbuilder obj 
        StringBuilder sb = new StringBuilder(temp); 
        // using reverse method to 
        // reverse the obj 
        StringBuilder str = sb.reverse(); 
        // printing reverse number 
        System.out.println(str.toString());
        // checking if the number is palindrome 
        if (temp.equals(str.toString())){
            return true;
        } else{
            return false;
        }
    }
}
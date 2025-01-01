public class Solution {
    // Method to merge two strings alternately
    public String mergeAlternately(String word1, String word2) {
        // Create a StringBuilder to construct the merged string
        StringBuilder merged = new StringBuilder();
        
        // Initialize pointers for word1 and word2
        int i = 0, j = 0;
        
        // Loop through both strings while there are characters left in both
        while (i < word1.length() && j < word2.length()) {
            // Append character from word1 and increment pointer
            merged.append(word1.charAt(i++));
            // Append character from word2 and increment pointer
            merged.append(word2.charAt(j++));
        }
        
        // Append remaining characters from word1, if any
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }
        
        // Append remaining characters from word2, if any
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }
        
        // Convert StringBuilder to string and return the result
        return merged.toString();
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Test the mergeAlternately method with different inputs
        System.out.println(solution.mergeAlternately("abc", "pqr"));  // Output: "apbqcr"
        System.out.println(solution.mergeAlternately("ab", "pqrs"));  // Output: "apbqrs"
        System.out.println(solution.mergeAlternately("abcd", "pq"));  // Output: "apbqcd"
    }
}

// Java Program to Check if a 
// String is a Palindrome

public class Geeks
{
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
      
        // Convert string to lowercase for 
        // case-insensitive comparison
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
            System.out.println(rev);
        }

        // Compare the original string with 
        // the reversed string
        return s.equals(rev);
    }

    public static void main(String[] args) {
      
        // Input string
        String s = "window";

        // Check if the string is a palindrome
        boolean res = isPalindrome(s);

        // Print the result with enhanced output
        if (res) {
            System.out.println('"' + s + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + s + '"' + " is not a palindrome.");
        }
        }
    }
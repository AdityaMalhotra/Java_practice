package leetcode;

public class PalindromeLeetCode
{
    public static void main(String[] args) {
        System.out.println(isPalindrome(9090909));
    }
    /*
        O(n) solution to https://leetcode.com/problems/palindrome-number/
     */
    public static boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        int length = input.length();
        for (int iterator = 0; iterator < Math.ceil(length / 2); iterator++) {
            if (input.charAt(iterator) != input.charAt(length - iterator - 1)) {
                return false;
            }
        }
        return true;
    }
}



// Palindrome

public class Main {

    public static void main(String[] args) {
        if(isPalindrome("nitina")) {
            System.out.println("Is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        if(str == null) {
            return false;
        }

        char[] stringArr = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(stringArr[left] != stringArr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

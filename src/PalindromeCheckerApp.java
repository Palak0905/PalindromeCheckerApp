public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        boolean isPalindrome = true;

        System.out.println("Checking if the word \"" + input + "\" is a palindrome...");


        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("Result: " + input + " is a palindrome.");
        } else {
            System.out.println("Result: " + input + " is not a palindrome.");
        }

    }
}

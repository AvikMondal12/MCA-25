import java.util.Scanner;

public class pl {

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;       // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;             // remove last digit
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}

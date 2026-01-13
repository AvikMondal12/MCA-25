import java.util.*;
class checkNo{
    void display(int num){
        if(num>0){
            System.out.println("The number is positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }

}


class checkEvenOdd{
    void eo_Display(int num){

        if(num>0 || num==0){
            if(num%2==0){
                System.out.println("It is an Even number !!");
            }

            else{
                System.out.println("It is an odd number !!");
            }
        }
    }
}
class checkPrime{
    void prime_display(int num){
        if (num<=1){
            System.out.println("It is not a Prime number !!");
            return;
        }
        
        boolean isPrime = true;
        for(int i=2;i<=(num/2);i++)
        {
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("It is a prime number !!");
        }
        else{
            System.out.println("The number is not prime !!");
        }
    }
}

class CheckPalindrome {

    // Function that returns true if num is palindrome
    boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;       // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;             // remove last digit
        }

        return original == reversed; // return boolean
    }

    // Function to display result
    void palindrome_Display(int num) {
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }


}


public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        try { 
            int num = sc.nextInt(); // Call the function 
            checkNo obj = new checkNo();
            obj.display(num);

            checkEvenOdd oj = new checkEvenOdd();
            oj.eo_Display(num);

            checkPrime obje = new checkPrime();
            obje.prime_display(num);

            // checkPalindrome o = new checkPalindrome();
            // o.palindrome_Display(num);
            CheckPalindrome cp = new CheckPalindrome();
        cp.palindrome_Display(num);  // Example test
        // cp.palindrome_Display(123);  // Example test


        }
         catch (Exception e) {
             System.out.println("Invalid input. Please enter an integer.");
              }
}
}
import java.util.Scanner;
public class posNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
    try{
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }

        if(num>0){
            if(num%2==0){
                System.out.print("It is an Even number !!");
            }

            else{
                System.out.print("It is an odd number !!");
            }
        }
        }
        catch(Exception e){
            System.out.println("Invalid input. Please enter an integer.");
            }
    }
}


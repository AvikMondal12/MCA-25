import java.util.*;

public class max_num {
    double num1;
    double num2;
    double num3;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first element :");
        num1 = sc.nextInt();
        System.out.print("Enter the second element :");
        num2 = sc.nextInt();
        System.out.print("Enter the third element :");
        num3 = sc.nextInt();

    }

    void display() {
        try {
            if (num1 > num2 && num1 > num3) {
                System.out.println("Number 1 is the largest number.");

            } else if (num2 > num3 && num2 > num1) {
                System.out.println("Number 2 is the largest number.");
            }

            else if (num3 > num1 && num3 > num2) {
                System.out.println("Number 3 is the largest number.");
            } else {
                System.out.println("Equal number found.");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input !, Please enter the valid input.");
        }
    }

    public static void main(String[] args) {

        max_num m = new max_num();
        m.getData();
        m.display();
    }

}

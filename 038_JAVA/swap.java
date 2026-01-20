//Develop a java program that swap two neumeric value entered by the user. The program should demonstrate the swaping process using a just two variable and display the values before and after swaping.
import java.util.Scanner;

public class swap {
    int First_Number;
    int Second_Number;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        First_Number = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        Second_Number = sc.nextInt();
    }

    void display() {
        System.out.println();
        System.out.println("======  Before Swaping  =====");
        System.out.println("The First number is : "+First_Number);
        System.out.println("The Second number is : "+Second_Number);

        First_Number = First_Number + Second_Number;
        Second_Number = First_Number - Second_Number;
        First_Number = First_Number - Second_Number;

        System.out.println();
        System.out.println("======  After Swaping  =====");
        System.out.println("The First number is : "+First_Number);
        System.out.println("The Second number is : "+Second_Number);
    }

    public static void main(String[] args) {

        swap s = new swap();
        s.getData();
        s.display();

    }

}

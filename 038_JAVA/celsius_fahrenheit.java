
// Create a java application that converts tempareature from celsius to fahrenheit. The program should accept the temparature value as input , apply the appropiate conversion formula , and display the converted result.
import java.util.Scanner;

public class celsius_fahrenheit {

    double celValue;

    void getData() {
        System.out.print("Enter the Celsious Value : ");
        Scanner sc = new Scanner(System.in);
        celValue = sc.nextInt();

    }

    void showResult() {
        System.out.println(celValue);
        double fahrenheit = ((celValue / 5) * 9) + 32;
        System.out.println("The Farenheit value of " + celValue + " is : " + fahrenheit);

    }

    public static void main(String[] args) {
        celsius_fahrenheit cf = new celsius_fahrenheit();
        cf.getData();
        cf.showResult();
    }
}


// Create a user-defined java package that groups together academic utilit classes.The package should contain classes reponsible for managing student information and calculating grades based on marks. A separate java program should import this package and acces it classes to perform academic computations,therebu demonstrating packgae creation,acces,and code mudularization across multiple source files.

package academicutils;

import java.util.Scanner;

// Student class
class Student {7uyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }

    int getMarks() {
        return marks;
    }
}

// Grade calculator class
class GradeCalculator {
    String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "Fail";
    }
}

// Main class
public class AcademicApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Student s = new Student(name, marks);
        GradeCalculator g = new GradeCalculator();

        s.display();
        System.out.println("Grade: " + g.calculateGrade(s.getMarks()));

        sc.close();
    }
}
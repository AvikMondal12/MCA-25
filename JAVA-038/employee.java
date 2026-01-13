//  Develope a java program that store details of an employee in suitable variable and display the data back to the user in a well formatted structure , the program should accept details such as emp id , emp name , designation , salary ,company name store rhem temorarily in memory and then retrive and print them to demostrate input processing and structured output representation use get data(),to take inputs show data(),to 1


import java.util.Scanner;

public class employee{
    int emp_id;
    double salary;
    String emp_name;
    String company_name;
    String designation;

   
    public void get_data(){
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Employee ID :");
        emp_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Employee name :");
        emp_name = sc.nextLine();

        System.out.print("Enter the Employee designation name :");
        designation = sc.nextLine();

        System.out.print("Enter the Company name :");
        company_name = sc.nextLine();

        System.out.print("Enter the Employee Salary :");
        salary = sc.nextDouble();

    }

    public void display(){

        
         System.out.println("Employee ID :"+emp_id);
         
         System.out.println("Employee name :"+emp_name);
         System.out.println("Employee designation :"+designation);
    
        System.out.println("Company name :"+company_name);

        System.out.println("Employee Salary :"+salary);


    }




    public static void main(String args[]){

        employee d = new employee();
        d.get_data();
        d.display();
    }
}
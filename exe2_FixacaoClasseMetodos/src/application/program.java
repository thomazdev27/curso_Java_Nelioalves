package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("NAME: ");
        emp.name = sc.nextLine();
        System.out.print("GROSS SALARY: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("TAX: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Wich percentage to increase Salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + emp);

        sc.close();


    }
}

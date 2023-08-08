package MockPapersMarch;

import java.util.Scanner;

class Dept {
    int deptId;
    String deptName;

    public Dept(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}

class Employee {
    int id;
    String name;
    Dept dept;

    public Employee(int id, String name, Dept dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}

public class Q18 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Department ID: ");
            int deptId = scanner.nextInt();

            System.out.print("Department Name: ");
            String deptName = scanner.next();

            Dept dept = new Dept(deptId, deptName);
            Employee employee = new Employee(id, name, dept);

            employees[i] = employee;
        }

        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.id);
            System.out.println("Name: " + employee.name);
            System.out.println("Department ID: " + employee.dept.deptId);
            System.out.println("Department Name: " + employee.dept.deptName);
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}




//O/P------>
//Employee Details:
//ID: 1
//Name: ram
//Department ID: 2
//Department Name: hr
//-------------------------
//ID: 2
//Name: shyam
//Department ID: 3
//Department Name: admin
//-------------------------
//ID: 3
//Name: geta
//Department ID: 1
//Department Name: account
//-------------------------


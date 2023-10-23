package com.crud.test;

import java.util.Scanner;

import com.crud.operation.EmployeeOperations;
import com.crud.pojo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int empid;
		String empname;
		double empsal;
		int choice;
		char ch;
		int num=0;
		int i;
		Employee empobj = null;
		EmployeeOperations eopr = new EmployeeOperations();
		do {
			System.out.println("----EMPLOYEE OPERATION LIST----\n");
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. UPDATE EMPLOYEE");
			System.out.println("3. DELETE EMPLOYEE");
			System.out.println("4. SHOW EMPLOYEE LIST");
			System.out.println("5. SEARCH EMPLOYEE BY ID");
			System.out.println("6. SEARCH EMPLOYEE BY ID 1:");
			System.out.println("--------------------------------");
			System.out.println("Enter  your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("----add employee operation----");
				System.out.println("How Many Employees You Want Add In Array:\n");
				num = sc.nextInt();
				for (i = 0; i < num; i++) {
					System.out.println("Enter Employee Id:");
					empid = sc.nextInt();
					System.out.println("Enter Employee Name:");
					empname = sc.next();
					System.out.println("Enter Employee Salary:");
					empsal = sc.nextDouble();
					empobj = new Employee(empid, empname, empsal);
					eopr.addEmployee(empobj);
				}
				break;
			case 2:
				System.out.println("----update employee by id----");
				System.out.println("Enter employee by id:");
				empid=sc.nextInt();
				empobj=eopr.searchEmployeeById1(empid);
				if(empobj!=null) {
					System.out.println("Enter Employee Name:");
					empname = sc.next();
					System.out.println("Enter Employee Salary:");
					empsal = sc.nextDouble();
					empobj=new Employee(empid, empname, empsal);
					eopr.updateEmployee(empobj);
					System.out.println("Employee updated successfully");
				}
				else {
					System.out.println("Employee record not found!!");
				}
				break;
			case 3:
				break;
			case 4:
				System.out.println("----EMPLOYEE LIST-----");
				
				if(num==0) {
					System.out.println("Employee list is empty");
				}
				else {
					eopr.showEmployees();
				}
				break;
			case 5:
				System.out.println("-----search employee by id-----");
				System.out.println("\nEnter id:");
				empid=sc.nextInt();
				int result=eopr.searchEmployeeById(empid);
				if(result==0) {
					System.out.println("Employee record not found");
				}
				break;
				
			case 6:
				System.out.println("----search employee by id----");
				System.out.println("Enter employee by id:");
				empid=sc.nextInt();
				empobj=eopr.searchEmployeeById1(empid);
				if(empobj!=null) {
					System.out.println(empobj);
				}
				else {
					System.out.println("Employee record not found");
				}
				break;
			}// switch case close
			System.out.println("Do you want to continue if yes enter y:");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		System.out.println("-------End--------");
	}

}

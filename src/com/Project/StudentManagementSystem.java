package com.Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private String name;
    private int id;
    private String course;
    private int grade;

	public StudentManagementSystem(String name, int id, String course, int grade) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.grade = grade;
    }
	 


public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}


}
public class StudentManagementSystem {
    private List<Student4> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student4 student) {
        students.add(student);
    }

    public void removeStudent(Student4 student) {
        students.remove(student);
    }

    public Student4 searchStudentByName(String name) {
        for (Student4 student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null; // Student not found
    }

    public List<Student4> getAllStudents() {
        return students;
    }

    public List<Student4> getStudentsByCourse(String course) {
        List<Student4> studentsByCourse = new ArrayList<>();
        for (Student4 student : students) {
            if (student.getCourse().equalsIgnoreCase(course)) {
                studentsByCourse.add(student);
            }
        }
        return studentsByCourse;
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Student Management System Menu:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search for a student by name");
            System.out.println("4. Display a list of all students");
            System.out.println("5. Display a list of students by course");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student course: ");
                    String course = scanner.nextLine();
                    Student4 student = new Student4(name, course);
                    system.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String removeName = scanner.nextLine();
                    Student4 removeStudent = system.searchStudentByName(removeName);
                    if (removeStudent != null) {
                        system.removeStudent(removeStudent);
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    String searchName = scanner.nextLine();
                    Student4 searchStudent = system.searchStudentByName(searchName);
                    if (searchStudent != null) {
                        System.out.println("Student found:");
                        System.out.println("Name: " + searchStudent.getName());
                        System.out.println("Course: " + searchStudent.getCourse());
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    List<Student4> allStudents = system.getAllStudents();
                    System.out.println("List of all students:");
                    for (Student4 s : allStudents) {
                        System.out.println("Name: " + s.getName() + ", Course: " + s.getCourse());
                    }
                    break;
                case 5:
                    System.out.print("Enter course name: ");
                    String searchCourse = scanner.nextLine();
                    List<Student4> studentsByCourse = system.getStudentsByCourse(searchCourse);
                    System.out.println("List of students in course " + searchCourse + ":");
                    for (Student4 s : studentsByCourse) {
                        System.out.println("Name: " + s.getName() );
                    }
            }
        }while(choice!=6);
    }}
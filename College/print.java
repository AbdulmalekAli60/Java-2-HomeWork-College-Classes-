import java.util.Scanner;

public class print { 

    public void Start() {
        //objects of each class
        HeadOfDepartment headOfDepartment = new HeadOfDepartment();
        Employee employee = new Employee();
        Student student = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for Head of department or 2 for employee or 3 for student");
        int a = input.nextInt();

        switch(a){
        //Head of department class
        // setters
        case 1:
        System.out.println("Enter First Name");
        headOfDepartment.setFirst_Name(input.next());

        System.out.println("Enter Last Name");
        headOfDepartment.setLast_Name(input.next());

        System.out.println("Enter Mobile number");
        headOfDepartment.setMobile_Number(input.next());

        System.out.println("Enter number of employee");
        headOfDepartment.setNumber_of_employee(input.nextInt());
        //getters
        System.out.println("Head Of department info:");
        System.out.println("First Name: " + headOfDepartment.getFirst_Name());
        System.out.println("Last Name: " + headOfDepartment.getLast_Name());
        System.out.println("Mobil Number: " + headOfDepartment.getMobile_Number());
        System.out.println("Number of employees: " + headOfDepartment.getNumber_of_employee());
            break;
        // Employee class
        // setters
        case 2:
        System.out.println("Enter First Name");
        employee.setFirst_Name(input.next());

        System.out.println("Enter Last Name");
        employee.setLast_Name(input.next());

        System.out.println("Enter Mobile number");
        employee.setMobile_Number(input.next());

        System.out.println("Enter Major");
        employee.setMajor(input.next());
        //getters
        System.out.println("Employee info:");
        System.out.println("First Name: " + employee.getFirst_Name());
        System.out.println("Last Name: " + employee.getLast_Name());
        System.out.println("Mobil Number: " + employee.getMobile_Number());
        System.out.println("Major: " + employee.getMajor());
            break;
       
        case 3:
         // student class
        // setters
        System.out.println("Enter First Name");
        student.setFirst_Name(input.next());

        System.out.println("Enter Last Name");
        student.setLast_Name(input.next());

        System.out.println("Enter Mobile number");
        student.setMobile_Number(input.next());

        System.out.println("Enter Your Department");
        student.setDepartment(input.next());

        System.out.println("Enter your level");
        student.setLevel(input.nextInt());

        System.out.println("Active or not, enter true or false");
        student.setActive(input.nextBoolean());

        // getters
        System.out.println("Student info:");
        System.out.println("First Name: " + student.getFirst_Name());
        System.out.println("Last Name: " + student.getLast_Name());
        System.out.println("Mobil Number: " + student.getMobile_Number());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Level: " + student.getLevel());
        System.out.println("Active or not: " + student.getisActive());
            break;
        default:
        System.out.println("Please enter 1 for Head of department or 2 for employee or 3 for student"); 
            a = input.nextInt();
        } // switch
    } // start method
}

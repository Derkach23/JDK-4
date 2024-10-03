package com.example.EmployeeDirectory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();


        directory.addEmployee(new Employee(1, "8-922-005-5449", "Влад", 5));
        directory.addEmployee(new Employee(2, "8-800-554-3688", "Никита", 3));
        directory.addEmployee(new Employee(3, "8-495-158-5073", "Михаил", 5));


        List<Employee> employeesWith5YearsExperience = directory.findEmployeesByExperience(5);
        System.out.println("Сотрудники с 5-летним опытом работы: " + employeesWith5YearsExperience);


        List<String> Phones = directory.getPhoneNumberByName("Влад");
        System.out.println("Номера телефонов Влада: " + Phones);


        Employee employeeById = directory.findEmployeeById(2);
        System.out.println("Сотрудник с табельным номером 2: " + employeeById);
    }
}
// File: src/main/java/com/ohasss/usecases/ShowAllEmployees.java

package com.ohasss.usecases;

import java.util.List;
import com.ohasss.dao.EmployeeDao;
import com.ohasss.dao.EmployeeDaoImpl;
import com.ohasss.model.Employee;

public class ShowAllEmployees {

    public static void showAllEmp() {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        List<Employee> employees = employeeDao.getAllEmployees();
        
        if (employees.isEmpty()) {
            System.out.println("\nNo employees found.");
            return;
        }
        
        System.out.println("\n\nShow All Employees");
        System.out.println("==================\n");

        // Print the table header
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-30s %-20s\n", "EmpID", "Name", "Status", "Email");
        System.out.println("------------------------------------------------------------");
        
        // Print each employee's details in a formatted way
        for (Employee emp : employees) {
            System.out.printf("%-10d %-20s %-30s %-20s\n", emp.getId(), emp.getName(), emp.getEmail(), emp.getDepartment());
        }
        
        System.out.println("------------------------------------------------------------");
    }
}

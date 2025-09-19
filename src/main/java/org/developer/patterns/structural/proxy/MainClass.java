package org.developer.patterns.structural.proxy;

public class MainClass {

    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOProxy();
        employeeDAO.create("admin", new Employee());
        employeeDAO.create("user", new Employee());

        System.out.println();

        employeeDAO.delete("admin", 1);
        employeeDAO.delete("user", 1);

        System.out.println();

        employeeDAO.get("admin", 1);
        employeeDAO.get("user", 1);
    }
}

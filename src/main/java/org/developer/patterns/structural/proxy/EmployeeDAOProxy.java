package org.developer.patterns.structural.proxy;

public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDAO;

    public EmployeeDAOProxy() {
        this.employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, Employee employee) {
        if (client.equalsIgnoreCase("admin")) {
            employeeDAO.create(client, employee);
        } else {
            System.out.println("Access Denied");
        }
    }

    @Override
    public void delete(String client, int id) {
        if (client.equalsIgnoreCase("admin")) {
            employeeDAO.delete(client, id);
        } else {
            System.out.println("Access Denied");
        }
    }

    @Override
    public Employee get(String client, int id) {
        if (client.equalsIgnoreCase("admin") || client.equalsIgnoreCase("user")) {
            return employeeDAO.get(client, id);
        }
        return null;
    }
}

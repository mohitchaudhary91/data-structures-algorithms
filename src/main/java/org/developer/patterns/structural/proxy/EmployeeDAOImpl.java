package org.developer.patterns.structural.proxy;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void create(String client, Employee employee) {
        System.out.println("Created Employee");
    }

    @Override
    public void delete(String client, int id) {
        System.out.println("Deleted Employee");
    }

    @Override
    public Employee get(String client, int id) {
        System.out.println("Fetched Employee");
        return null;
    }
}

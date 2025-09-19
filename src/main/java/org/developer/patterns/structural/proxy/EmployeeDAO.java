package org.developer.patterns.structural.proxy;

public interface EmployeeDAO {

    void create(String client, Employee employee);

    void delete(String client, int id);

    Employee get(String client, int id);
}

package br.edu.infnet.infrastructure;

import br.edu.infnet.domain.Employee;
import br.edu.infnet.domain.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeRepository implements Repository<Employee> {
    private static EmployeeRepository _instance;
    private ConnectionFactory connectionFactory;
    private List<Employee> employees;

    private EmployeeRepository() {
        _instance = this;
        connectionFactory = MySQLConnectionFactory.getInstance();
        employees = new ArrayList<>();
    }

    public static EmployeeRepository getInstance() {
        if (_instance != null) return _instance;
        return new EmployeeRepository();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee getByRegistration(UUID registration) {
        return null;
    }

    @Override
    public Employee add(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void remove(UUID registrarion) {

    }
}

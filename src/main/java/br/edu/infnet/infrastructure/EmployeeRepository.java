package br.edu.infnet.infrastructure;

import br.edu.infnet.domain.Employee;
import br.edu.infnet.domain.Repository;

import java.util.List;
import java.util.UUID;

public class EmployeeRepository implements Repository<Employee> {
    private static EmployeeRepository _instance;

    private EmployeeRepository() {}

    public static EmployeeRepository getInstance() {
        if (_instance != null) return _instance;
        _instance = new EmployeeRepository();
        return _instance;
    }

    @Override
    public List<Employee> getAll() {
        return null;
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

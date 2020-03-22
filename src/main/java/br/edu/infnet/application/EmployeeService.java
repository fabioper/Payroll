package br.edu.infnet.application;

import br.edu.infnet.domain.Employee;
import br.edu.infnet.domain.Repository;

public class EmployeeService {
    private Repository<Employee> repository;

    public EmployeeService(Repository<Employee> repository) {
        this.repository = repository;
    }
}

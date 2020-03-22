package br.edu.infnet.domain;

import java.util.UUID;

public abstract class Employee {
    protected UUID registration;
    protected String name;
    protected String role;

    public abstract void calculateSalary();
}

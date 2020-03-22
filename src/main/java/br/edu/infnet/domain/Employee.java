package br.edu.infnet.domain;

import java.util.UUID;

public abstract class Employee {
    protected UUID registration;
    protected String name;
    protected String role;

    public abstract void calculateSalary();

    public UUID getRegistration() {
        return registration;
    }

    public void setRegistration(UUID registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

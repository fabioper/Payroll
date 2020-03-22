package br.edu.infnet.domain;

import java.util.List;
import java.util.UUID;

public interface Repository<T> {
    List<T> getAll();
    T getByRegistration(UUID registration);
    T add(T employee);
    T update(T employee);
    void remove(UUID registrarion);
}

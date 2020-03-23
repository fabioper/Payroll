package br.edu.infnet.infrastructure;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection connect();
}

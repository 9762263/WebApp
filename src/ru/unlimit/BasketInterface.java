package ru.unlimit;

import java.sql.SQLException;

public interface BasketInterface<Radiator> {
public void insert(Radiator rad) throws SQLException;
}

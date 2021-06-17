package com.nlu.repository;

import com.nlu.model.Product;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface Repository<T> {

    Collection<T> findAll() throws SQLException;

    List<Product> findByName(String name) throws SQLException;
}

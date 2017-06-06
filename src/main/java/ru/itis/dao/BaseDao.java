package ru.itis.dao;

import java.util.List;

/**
 * 03.05.2017
 * BaseDao
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface BaseDao<T> {
    int save(T model);
    void update(T model);
    T find(int id);
    void delete(int id);

    List<T> findAll();
}

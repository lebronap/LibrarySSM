package com.test.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<Entity extends Serializable ,ID> {
    Entity findById(ID id);
    List<Entity> findByName(String name);
    List<Entity> findAll();
    //List<Entity> findBySQL(final String sql, final Object... params);

    int insert(Entity entity);
    int update(Entity entity);
    int delete(Entity entity);
    int delete(ID id);
}

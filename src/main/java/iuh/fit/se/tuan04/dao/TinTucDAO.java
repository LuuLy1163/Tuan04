package iuh.fit.se.tuan04.dao;

import iuh.fit.se.tuan04.model.TinTuc;

import java.util.List;

public interface TinTucDAO {
    List<TinTuc> findAll();
    void insert(TinTuc tintuc);
    void delete(int maTT);
}

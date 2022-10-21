package dataAccess;

import entities.Category;

public interface CatagoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
}

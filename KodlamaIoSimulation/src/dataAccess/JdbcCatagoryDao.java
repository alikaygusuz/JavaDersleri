package dataAccess;

import entities.Category;

public class JdbcCatagoryDao implements CatagoryDao{
    @Override
    public void add(Category category) {
        System.out.println("jdbc kullanılarak kategori eklendi : " + category);

    }
    @Override
    public void delete(Category category) {
        System.out.println("jdbc kullanılarak kategori silindi : " + category);
    }

    @Override
    public void update(Category category) {
        System.out.println("jdbc kullanılarak kategori güncellendi : " + category);

    }
}

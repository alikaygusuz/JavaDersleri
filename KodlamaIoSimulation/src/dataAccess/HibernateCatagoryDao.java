package dataAccess;

import entities.Category;

public class HibernateCatagoryDao implements CatagoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate kullanılarak yeni kategori oluşturuldu : "+ category);
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate kullanılarak kategori silindi : " + category);
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate kullanılarak kategori güncellendi : " + category);
    }
}

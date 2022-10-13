package oopwithNLayeredApp.dataAccsess;

import oopwithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        //sadece ve daece DB erişim kodları buraya yazılır... SQL
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}

package oopwithNLayeredApp.dataAccsess;

import oopwithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //sadece ve daece DB erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}

package oopwithNLayeredApp;

import oopwithNLayeredApp.business.ProductManager;
import oopwithNLayeredApp.core.logging.FileLogger;
import oopwithNLayeredApp.core.logging.Logger;
import oopwithNLayeredApp.core.logging.MailLogger;
import oopwithNLayeredApp.core.logging.databaseLogger;
import oopwithNLayeredApp.dataAccsess.HibernateProductDao;
import oopwithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 9000);
        Logger[] loggers = {new databaseLogger(), new FileLogger(), new MailLogger()};
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);

    }
}
package business;

import core.logging.Logger;
import dataAccess.CatagoryDao;
import entities.Category;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    CatagoryDao catagoryDao;
    List<Logger> loggers;
    List<Category> catagorys = new ArrayList<>();
    public CategoryManager(CatagoryDao catagoryDao, List<Logger> loggers) {
        this.catagoryDao = catagoryDao;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception {
        for (Category c:catagorys) {
            boolean isExist= c.getCategoryName().equals(category.getCategoryName());
            boolean isEqual = java.util.Objects.equals(c.getId(), category.getId());
            if(isExist && isEqual) throw new Exception("Kategori ismi ve id aynı olamaz!!!");
            if(isExist) throw new Exception("Kategori ismi tekrar edemez!!!");
            if(isEqual) throw new Exception("ıd'ler tekrar edemez!!!");

        }

        catagorys.add(category);
        catagoryDao.add(category);
        for (Logger logger:loggers) {
            logger.log(category.getCategoryName());
        }
        System.out.println("TestList:" + catagorys);


    }
}
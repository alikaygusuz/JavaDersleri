package business;

import core.logging.Logger;
import dataAccess.CatagoryDao;
import entities.Category;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    CatagoryDao catagoryDao;
    List<Logger> loggers=new ArrayList<>();
    public CategoryManager(CatagoryDao catagoryDao, List<Logger> loggers) {
        this.catagoryDao = catagoryDao;
        this.loggers = loggers;
    }
    List<Category> catagorys = new ArrayList<>();
    public void add(Category category) throws Exception {
        if(catagorys.contains(category)) throw new Exception("Kategori ismi tekrar edemez!!!");



        catagorys.add(category);
        catagoryDao.add(category);
        for (Logger logger:loggers) {
            logger.log(category.getCategoryName());
        }


    }
}
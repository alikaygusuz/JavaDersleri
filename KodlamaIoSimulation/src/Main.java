import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCatagoryDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Logger> loggers = new ArrayList<Logger>(Arrays.asList(new DataBaseLogger(),new FileLogger(),new MailLogger()));
        CategoryManager categoryManager = new CategoryManager(new JdbcCatagoryDao(), loggers);
        Category category = new Category(1, "java");
        categoryManager.add(category);
        Category category_ = new Category(2, "java");
        categoryManager.add(category_);
        Course course=new Course(1,"java","Engin Demiroğ", 0);
        CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course);
        Instructor instructor=new Instructor("1111111111","Engin Demiroğ", 30, 2);
        InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);
    }
}
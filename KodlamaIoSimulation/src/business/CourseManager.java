package business;


import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;


public class CourseManager {
    CourseDao courseDao;
    List<Logger> loggers=new ArrayList<>();
    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    List<Course> courses=new ArrayList<>();
    public void add(Course course)throws Exception {

        if(courses.contains(course))
            throw new Exception("Kurs ismi tekrar edemez!!!");
        if(course.getPrice()<0)throw new Exception("Kurs Fiyatı 0 dan küçük olamaz!!!");

        courses.add(course);
        courseDao.add(course);
        for (Logger logger:loggers) {
            logger.log(course.getCourseName());
        }
    }
}

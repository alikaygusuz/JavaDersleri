package business;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;



public class InstructorManager {
    InstructorDao instructorDao;
    List<Logger> loggers=new ArrayList<>();
    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for (Logger logger:loggers) {
            logger.log(instructor.getName());
        }

    }
}

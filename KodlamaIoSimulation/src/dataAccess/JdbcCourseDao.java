package dataAccess;

import entities.Category;
import entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("jdbc kullanılarak kurs eklendi : " + course);

    }
    @Override
    public void delete(Course course) {
        System.out.println("jdbc kullanılarak kurs silindi : " + course);
    }

    @Override
    public void update(Course course) {
        System.out.println("jdbc kullanılarak kurs güncellendi : " + course);

    }
}

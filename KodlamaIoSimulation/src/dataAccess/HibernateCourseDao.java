package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate kullanılarak kurs eklendi : " + course);
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate kullanılarak kurs silindi : " + course);
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate kullanılarak kurs güncellendi : " + course);
    }
}

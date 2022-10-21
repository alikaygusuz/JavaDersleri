package dataAccess;

import entities.Instructor;

public class HibernateınstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate kullanılarak Eğitmen eklendi : " + instructor);
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate kullanılarak Eğitmen silindi : " + instructor);
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate kullanılarak Eğitmen güncellendi : " + instructor);
    }
}

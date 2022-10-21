package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println("jdbc kullanılarak eğitmen eklendi : " + instructor);
    }
    @Override
    public void delete(Instructor instructor) {
        System.out.println("jdbc kullanılarak eğitmen silindi : " + instructor);

    }
    @Override
    public void update(Instructor instructor) {
        System.out.println("jdbc kullanılarak eğitmen güncellendi : " + instructor);

    }
}

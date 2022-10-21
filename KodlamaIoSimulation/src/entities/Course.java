package entities;

public class Course {
    private int id;
    private String courseName;
    private String Instructor;
    private int price;

    public Course() {

    }

    public Course(int id, String courseName, String instructor, int price) {
        this.id = id;
        this.courseName = courseName;
        Instructor = instructor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String instructor) {
        Instructor = instructor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

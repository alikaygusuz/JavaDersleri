package entities;

public class Instructor {
    private String nationalityId;
    private String Name;
    private int age;
    private int courseNumber;

    public Instructor() {

    }

    public Instructor(String nationalityId, String name, int age, int courseNumber) {
        this.nationalityId = nationalityId;
        Name = name;
        this.age = age;
        this.courseNumber = courseNumber;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
}

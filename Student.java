public class Student {
    String name;
    int id;
    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + course;
    }
}

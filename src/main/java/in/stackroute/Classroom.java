package in.stackroute;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students;

    private Location location;

    public Classroom() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void display() {
        System.out.println("Location: " + location);
        System.out.println( "Student Details ");
        for (Student student : this.students) {
            System.out.println(student);
        }
    }
}

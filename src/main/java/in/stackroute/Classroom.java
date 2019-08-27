package in.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private Mentor mentor;
    private List<Student> studentList;

    @Autowired
    private Location location;

    public Classroom(Mentor mentor) {
        studentList = new ArrayList<>();
        this.mentor = mentor;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public void setStudents(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean checkMentorEquality(Student student) {
        return mentor.getMentorId() == student.getStudentId();
    }

    public boolean checkStudentsEquality(Student s1, Student s2) {
        return s1.getStudentId() == s2.getStudentId();
    }

    public void display() {
        System.out.println("Mentor:\n" + mentor);
        System.out.println( "Student Details ");
        System.out.printf("%-10s%-30s%-20s%-20s\n", "Student Id", "Name", "Gender", "Age");
        for (Student student : this.studentList) {
            System.out.println(student);
        }
        System.out.println("Location:\n" + location);
    }
}

package in.stackroute;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Classroom() {
        students = new ArrayList<>();
    }

    public void display() {
        System.out.println( "Student Details -" );
        for (Student student : this.students) {
            System.out.println(student);
        }
    }
}

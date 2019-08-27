package in.stackroute.config;

import in.stackroute.Gender;
import in.stackroute.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean("class1list")
    public List<Student> getList1() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1);
        s1.setName("Visnu");
        s1.setAge(22);
        s1.setGender(Gender.Male);
        list.add(s1);

        Student s2 = new Student(2);
        s2.setName("Aparna");
        s2.setAge(20);
        s2.setGender(Gender.Female);
        list.add(s2);

        return list;
    }

    @Bean("class2list")
    public List<Student> getList2() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1);
        s1.setName("Shubham");
        s1.setAge(25);
        s1.setGender(Gender.Male);
        list.add(s1);

        Student s2 = new Student(2);
        s2.setName("Garima");
        s2.setAge(19);
        s2.setGender(Gender.Female);
        list.add(s2);

        Student s3 = new Student(3);
        s3.setName("Manoj");
        s3.setAge(21);
        s3.setGender(Gender.Male);
        list.add(s3);

        return list;
    }

    @Bean("class3list")
    public List<Student> getList3() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1);
        s1.setName("Divyansh");
        s1.setAge(22);
        s1.setGender(Gender.Male);
        list.add(s1);

        Student s2 = new Student(2);
        s2.setName("Khushal");
        s2.setAge(20);
        s2.setGender(Gender.Male);
        list.add(s2);

        return list;
    }

}

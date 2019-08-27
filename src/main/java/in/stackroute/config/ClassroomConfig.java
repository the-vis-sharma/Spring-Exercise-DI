package in.stackroute.config;

import in.stackroute.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
@ComponentScan( { "in.stackroute" } )
@Import({MentorConfig.class, StudentConfig.class, LocationConfig.class})
public class ClassroomConfig {

    @Autowired
    @Qualifier("mentor1")
    Mentor mentor1;

    @Autowired
    @Qualifier("mentor2")
    Mentor mentor2;

    @Autowired
    @Qualifier("mentor3")
    Mentor mentor3;

    @Autowired
    Location location1;

    @Autowired
    @Qualifier("jaipur")
    Location location2;

    @Autowired
    @Qualifier("class1list")
    List<Student> list1;

    @Autowired
    @Qualifier("class2list")
    List<Student> list2;

    @Autowired
    @Qualifier("class3list")
    List<Student> list3;

    @Bean("class1")
    public Classroom getClass1() {
        Classroom class1 = new Classroom(mentor1);
        class1.setLocation(location1);
        class1.setStudents(list1);
        return class1;
    }

    @Bean("class2")
    public Classroom getClass2() {
        Classroom class2 = new Classroom(mentor2);
        class2.setLocation(location2);
        class2.setStudents(list2);
        return class2;
    }

    @Bean("class3")
    public FlippedClassRoom getClass3() {
        FlippedClassRoom class3 = new FlippedClassRoom(mentor3);
        class3.setLocation(location1);
        class3.setStudents(list3);
        class3.setDuration(5);
        return class3;
    }

}

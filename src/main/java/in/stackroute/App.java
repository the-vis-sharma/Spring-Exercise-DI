package in.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classroomConfig.xml");
        Classroom classroom = (Classroom) context.getBean("classroom");
        classroom.display();
    }
}

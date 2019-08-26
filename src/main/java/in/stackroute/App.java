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

        //class 1
        System.out.println("Class Room 1");
        Classroom classFirst = (Classroom) context.getBean("class1");
        classFirst.display();

        System.out.println("Class Room 2");
        Classroom classSecond = (Classroom) context.getBean("class2");
        classSecond.display();

    }
}

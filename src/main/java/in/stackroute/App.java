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
        ApplicationContext context = new ClassPathXmlApplicationContext("classroom-config.xml");

        //class 1
        System.out.println("Class Room 1");
        Classroom classFirst = (Classroom) context.getBean("class1");
        classFirst.display();
        System.out.println("Student Equality: " + classFirst.checkStudentsEquality(classFirst.getStudents().get(0), classFirst.getStudents().get(1)));

        System.out.println("\nClass Room 2");
        Classroom classSecond = (Classroom) context.getBean("class2");
        classSecond.display();
        System.out.println("Mentor Equality: " + classSecond.checkMentorEquality(classSecond.getStudents().get(0)));

        System.out.println("\nFlipped Class Room 3");
        Classroom classThird = (Classroom) context.getBean("class3");
        classThird.display();
        System.out.println("Mentor Equality: " + classThird.checkMentorEquality(classThird.getStudents().get(0)));

    }
}

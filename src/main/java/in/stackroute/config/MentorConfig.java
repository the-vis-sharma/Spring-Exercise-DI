package in.stackroute.config;

import in.stackroute.Gender;
import in.stackroute.Mentor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MentorConfig {

    @Bean("mentor1")
    public Mentor getMentor1() {
        Mentor mentor = new Mentor(6);
        mentor.setName("Divyansh");
        mentor.setGender(Gender.Male);
        return mentor;
    }

    @Bean("mentor2")
    public Mentor getMentor2() {
        Mentor mentor = new Mentor(1);
        mentor.setName("Shubham");
        mentor.setGender(Gender.Male);
        return mentor;
    }

    @Bean("mentor3")
    public Mentor getMentor3() {
        Mentor mentor = new Mentor(8);
        mentor.setName("Vish");
        mentor.setGender(Gender.Male);
        return mentor;
    }

}

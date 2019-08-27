package in.stackroute.config;

import in.stackroute.Location;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class LocationConfig {

    @Bean("banglore")
    @Primary
    public Location getBanglore() {
        Location banglore = new Location();
        banglore.setArea("Kormangla");
        banglore.setCity("Banglore");
        return banglore;
    }

    @Bean("jaipur")
    public Location getJaipur() {
        Location jaipur = new Location();
        jaipur.setArea("Malvi Nagar");
        jaipur.setCity("Jaipur");
        return jaipur;
    }
}

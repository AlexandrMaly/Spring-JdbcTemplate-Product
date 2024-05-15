package app.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@ComponentScan("/app")
@PropertySource("classpath:db.properties")
public class AppConfig {

    @Autowired
    Environment environment;

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty("dbUrl"));
        driverManagerDataSource.setUsername(environment.getProperty("dbUser"));
        driverManagerDataSource.setPassword(environment.getProperty("dbPass"));
        driverManagerDataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("dbDriver")));
        return driverManagerDataSource;
    }
}

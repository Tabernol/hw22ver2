package hill.hw22ver2;

import hill.hw22ver2.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class Hw22ver2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw22ver2Application.class, args);

        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    }

}

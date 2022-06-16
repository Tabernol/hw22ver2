package hill.hw22ver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class Hw22ver2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw22ver2Application.class, args);
    }

}

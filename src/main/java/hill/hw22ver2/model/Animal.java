package hill.hw22ver2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;
}

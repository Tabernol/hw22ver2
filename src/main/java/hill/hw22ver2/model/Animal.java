package hill.hw22ver2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ANIMALS")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;
}

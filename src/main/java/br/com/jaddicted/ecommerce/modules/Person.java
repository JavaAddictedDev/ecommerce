package br.com.jaddicted.ecommerce.modules;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person implements Serializable {
    private String name;
    @Id
    @GeneratedValue(generator = "person_generator")
    @GenericGenerator(name = "person_generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String email;
    private String mobile;
}

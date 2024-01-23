package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Configuration;

@Entity
@Table(name ="Customer")
public class Customer {

    @Id
    @Column(name="Customer Id")
    private int id;
    @Column(name = "First Name")
    private String firstName;
    @Column(name ="Last Name")
    private String lastName;
    @Column(name ="Country")
    private String Country;
}

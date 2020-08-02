package io.abdul.springbootdemo.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Employee {
    @Id
    private Integer id;
    private String name;
    private String email;
}

package com.mrszhang.learn.jingjing.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Entity
@Table(name="user")
@ComponentScan(basePackages = "com.mrszhang")
public class User {
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
    @Column(name="password")
    private String password;
    @Column(name="password")
    private String weight;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false, insertable=true, updatable=false, precision=20, scale=0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

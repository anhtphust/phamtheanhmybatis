package com.example.demo_mybatis.entity;

public class Teacher {
    private int id;
    private String name;
    private int age;
    private String mail;

    public Teacher() {
    }

    public Teacher( String name, int age, String mail) {
        this.name = name;
        this.age = age;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

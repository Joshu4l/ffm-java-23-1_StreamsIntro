package de.github.joshu4l;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String postalCode;
    private String age;


    public Student(){
        // Default Constructor
    }

    public Student (String id, String name, String postalCode, String age) {
        // Custom Constructor
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.age = age;
    }

    public Student(String[] splitLine) {
        this.id = splitLine[0];
        this.name = splitLine[1];
        this.postalCode = splitLine[2];
        this.age = splitLine[3];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(postalCode, student.postalCode) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, postalCode, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

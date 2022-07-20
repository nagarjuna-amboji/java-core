package io.amigos.core.comparator;

import java.util.Date;
import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private double marks;
    private Date doj;

    public Student() {
    }

    public Student(int id, String name, double marks, Date doj) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.doj = doj;
    }

    public int getId() {
        return id;
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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.marks, marks) == 0 && Objects.equals(name, student.name) && Objects.equals(doj, student.doj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, marks, doj);
    }
}

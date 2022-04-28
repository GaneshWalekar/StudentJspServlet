package org.example.model;

public class Student {
    private long id;
    private String name;
    private String clg;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String cls;

    public Student() {
    }

    public Student(String name, String clg, String cls) {
        this.name = name;
        this.clg = clg;
        this.cls = cls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }
}

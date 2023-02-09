package com.api2.api2.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class HOD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobile;

    @Enumerated(EnumType.STRING)
    private BranchName branchName;

    @OneToMany(mappedBy ="hod",cascade = CascadeType.ALL)
    private List<Student> studentList;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BranchName getBranch() {
        return branchName;
    }

    public void setBranch(BranchName branchName) {
        this.branchName = branchName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}

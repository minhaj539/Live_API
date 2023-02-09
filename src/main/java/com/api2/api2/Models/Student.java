package com.api2.api2.Models;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String Name;
    @Enumerated(EnumType.STRING)
    private BranchName branchName;
    private int marks;
    private int year;

    @ManyToOne
    @JoinColumn
    private HOD hod;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public HOD getHod() {
        return hod;
    }

    public void setHod(HOD hod) {
        this.hod = hod;
    }
    public Student(String branchName){
        if(branchName.equals(BranchName.BT)){
            this.year=2014;
        }
        if(branchName.equals(BranchName.ME)){
            this.year=2016;
        }
        if(branchName.equals(BranchName.CS)){
            this.year=2018;
        }
        if(branchName.equals(BranchName.IT)){
            this.year=2020;
        }
    }

    public BranchName getBranchName() {
        return branchName;
    }

    public void setBranchName(BranchName branchName) {
        this.branchName = branchName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

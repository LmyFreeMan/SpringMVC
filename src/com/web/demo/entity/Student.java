package com.web.demo.entity;

import javax.validation.constraints.NotNull;

public class Student {
    @NotNull
    private int stuNo;

    public int getStuNo() {
        return stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuno=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", classId=" + classId +
                '}';
    }
    public void setStuNo(int stuno) {
        this.stuNo = stuno;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    private String stuName;
    private int classId;
}
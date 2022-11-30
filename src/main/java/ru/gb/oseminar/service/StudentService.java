package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService  implements StudentServiceIntrface{
    List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }
    public StudentService(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public void createUser(String firstName, String secondName, String patronymic) {
        this.studentList.add(new Student(firstName, secondName, patronymic));
    }

    @Override
    public List<Student> getStudents() {
        return this.studentList;
    }
}

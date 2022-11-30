package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;

import java.util.List;

public interface StudentServiceIntrface {
    void createUser(String firstName, String secondName, String patronymic);
    List<Student> getStudents();
}

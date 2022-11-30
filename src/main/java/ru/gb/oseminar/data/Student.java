package ru.gb.oseminar.data;

import java.util.concurrent.atomic.AtomicLong;

public class Student extends User {
    private static final AtomicLong GUID = new AtomicLong(0);
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic) {
        super(firstName, secondName, patronymic);
        this.studentId = GUID.incrementAndGet();
    }

    public Long getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               '}';
    }
}

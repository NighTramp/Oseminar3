package ru.gb.oseminar.data;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

public class Teacher extends User{
    private static final AtomicLong GUID = new AtomicLong(0);
    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic) {
        super(firstName, secondName, patronymic);
        this.teacherId = GUID.incrementAndGet();
    }

    public Long getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                '}';
    }
}

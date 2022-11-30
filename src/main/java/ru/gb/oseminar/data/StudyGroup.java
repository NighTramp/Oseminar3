package ru.gb.oseminar.data;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class StudyGroup {
    private static final AtomicLong GUID = new AtomicLong(0);
    private Long groupId;
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
        this.groupId = GUID.incrementAndGet();

    }
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "groupId=" + groupId +
                ", teacher=" + teacher.toString() +
                ", students=" + students.toString() +
                '}';
    }
}

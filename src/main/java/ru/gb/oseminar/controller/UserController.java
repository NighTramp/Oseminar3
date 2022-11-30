package ru.gb.oseminar.controller;


import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.StudentService;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.view.ViewConsoe;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserController {
    private StudyGroupService studyGroupService = new StudyGroupService();
    private StudentService studentService;
    private ViewConsoe viewConsoe;
    public List<Student> testInit() {
        studentService = new StudentService();
        studentService.createUser(
                "ExampleFirstName1",
                "ExampleSecondName1",
                "ExamplePatronymic1"
        );
        studentService.createUser(
                "ExampleFirstName2",
                "ExampleSecondName2",
                "ExamplePatronymic2"
        );
        studentService.createUser(
                "ExampleFirstName3",
                "ExampleSecondName3",
                "ExamplePatronymic3"
        );
        return studentService.getStudents();
    }
    public void createGroup(String firstName, String secondName, String patronymic){

        viewConsoe = new ViewConsoe();
        studyGroupService.createStudyGroup(new Teacher(firstName, secondName, patronymic), testInit());
        viewConsoe.viewList(studyGroupService.getStudyGroups());

    }

    private List<Student> sortedList (List<StudyGroup> studyGroups) {
        return studyGroups.stream()
                .map(StudyGroup::getStudents)
                .flatMap(Collection::stream)
                .sorted((Student o1, Student o2) -> {
                    if ((o1.getSecondName()).equals(o2.getSecondName()))
                        return (o1.getFirstName()).compareTo(o2.getFirstName());
                    return (o1.getSecondName()).compareTo(o2.getSecondName());
                })
                .collect(Collectors.toList());
    }

    public void sort() {
        viewConsoe = new ViewConsoe();
        viewConsoe.viewList(sortedList(studyGroupService.getStudyGroups()));
    }
}

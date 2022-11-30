package ru.gb.oseminar;

import ru.gb.oseminar.controller.UserController;

//a. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов.
//b. Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher, List<Strudent>))
// формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его
//c. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id)
// и формирования учебной группы, путем вызова метода из сервиса
//d. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class Main {

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.createGroup("ExampleFirstNameT",
                "ExampleSecondNameT",
                "ExamplePatronymicT");
        userController.createGroup("ExampleFirstNameT",
                "ExampleSecondNameT",
                "ExamplePatronymicT");
        userController.sort();
    }
}
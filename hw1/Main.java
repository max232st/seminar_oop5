package oop.example.seminar5.hw1;

import oop.example.seminar5.hw1.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.start();
    }
}
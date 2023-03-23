package oop.example.seminar5.hw1.model;

import java.util.List;

public interface VendingMachine<T> {

    void initProduct(List<T> list);
    String getProduct(String name);
}
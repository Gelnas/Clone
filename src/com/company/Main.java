package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        Collections.addAll(books,"1984", "Alice's Adventures in Wonderland");

        Man p = new Man("Tom", 25, books);
        Man clone = (Man) deepCopy(p);

        System.out.println(p);
        System.out.println(clone);

        p.setName("Bob");
        books.add("Fahrenheit 451");
        p.setFavoriteBooks(books);

        System.out.println(p);
        System.out.println(clone);

    }

    public static Object deepCopy(Object object) {
        Object clone = object;

        return clone;
    }
}

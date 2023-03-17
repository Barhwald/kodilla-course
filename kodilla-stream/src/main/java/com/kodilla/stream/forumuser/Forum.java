package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Kiren", 'M', LocalDate.of(2009, 9, 12), 34));
        usersList.add(new ForumUser(2, "Morgan", 'M', LocalDate.of(2004, 2, 13), 14));
        usersList.add(new ForumUser(3, "Shane", 'M', LocalDate.of(1990, 3, 24), 113));
        usersList.add(new ForumUser(4, "Kelly", 'F', LocalDate.of(2001, 1, 5), 45));
        usersList.add(new ForumUser(5, "Goody", 'M', LocalDate.of(2015, 9, 12), 65));
        usersList.add(new ForumUser(6, "Nel", 'F', LocalDate.of(2006, 11, 14), 24));
        usersList.add(new ForumUser(7, "Gorgy", 'M', LocalDate.of(1994, 5, 5), 0));
        usersList.add(new ForumUser(8, "Messer", 'M', LocalDate.of(2000, 3, 14), 78));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }


}

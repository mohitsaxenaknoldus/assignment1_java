package com.knoldus.assignment1.Entity;

import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private int roll;
    private Optional<List<String>> subjects;
    private String roomID;

    /**
     * checkSubjectsEmpty
     * @return true if no subjects are there/false if subjects are there
     */
    public boolean checkSubjectsEmpty()
    {
        return subjects.isEmpty();
    }

    /**
     * toString
     * @return String representation of the instance
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", subjects=" + subjects +
                '}';
    }

    public Student(String n, int r, Optional<List<String>> subs, String id) {
        this.name = n;
        this.roll = r;
        this.subjects = subs;
        this.roomID = id;
    }

    /**
     * getSubjects
     * @return Optional<List<String>> - returns subjects
     */
    public Optional<List<String>> getSubjects() {
        return subjects;
    }

    /**
     * getRoomID
     * @return returns roomID
     */
    public String getRoomID() {
        return roomID;
    }
}

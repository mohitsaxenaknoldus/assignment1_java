package com.knoldus.assignment1.Entity;

import java.util.List;
import java.util.Optional;

public class ClassRoom {
    private final Optional<List<Student>> studentList;

    public ClassRoom(Optional<List<Student>> list) {
        this.studentList = list;
    }

    /**
     * getStudentList
     * @return Optional<List<Student>>
     */
    public Optional<List<Student>> getStudentList() {
        return studentList;
    }
}

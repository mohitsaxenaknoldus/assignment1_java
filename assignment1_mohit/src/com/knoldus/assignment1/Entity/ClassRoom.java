package com.knoldus.assignment1.Entity;

import java.util.List;
import java.util.Optional;

public class ClassRoom {
    private final String roomID;
    private final Optional<List<Student>> studentList;

    public ClassRoom(String id, Optional<List<Student>> list) {
        this.roomID = id;
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

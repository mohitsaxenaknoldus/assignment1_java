package com.knoldus.assignment1.Service;

import com.knoldus.assignment1.Entity.ClassRoom;
import com.knoldus.assignment1.Entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CreateRoom {

    /**
     * create
     * @return Instance object
     */
    public ClassRoom create()
    {
        List<Student> students= new ArrayList<>();
        Optional<List<Student>> studentList = Optional.of(students);

        return new ClassRoom(studentList);
    }
}

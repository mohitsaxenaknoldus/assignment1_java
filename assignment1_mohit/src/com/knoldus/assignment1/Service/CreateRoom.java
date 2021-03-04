package com.knoldus.assignment1.Service;

import com.knoldus.assignment1.Entity.ClassRoom;
import com.knoldus.assignment1.Entity.Student;
import java.util.List;
import java.util.Optional;

public class CreateRoom {

    /**
     * create
     * @return Instance object
     */
    public ClassRoom create(String roomID, List<Student> studentList)
    {
        Optional<List<Student>> list = Optional.of(studentList);

        return new ClassRoom(roomID, list);
    }
}

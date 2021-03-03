package com.knoldus.assignment1.Service;

import com.knoldus.assignment1.Entity.ClassRoom;
import com.knoldus.assignment1.Entity.Student;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class RoomWithStudentsImpl implements RoomWithStudents{
    public static final Logger LOGGER = Logger.getLogger(RoomWithStudentsImpl.class.getName());

    /**
     * checkRoomEmpty
     * @param room - Instance of type ClassRoom
     */
    @Override
    public void checkRoomEmpty(ClassRoom room) {
        Optional<List<Student>> list = room.getStudentList();

        list.ifPresent(s -> LOGGER.info("hello Student"));
    }
}

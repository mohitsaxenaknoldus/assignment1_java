package com.knoldus.assignment1.Controller;

import com.knoldus.assignment1.Entity.ClassRoom;
import com.knoldus.assignment1.Entity.Student;
import com.knoldus.assignment1.Service.*;

import java.util.List;
import java.util.logging.Logger;

public final class ClassController {
    public static final Logger LOGGER = Logger.getLogger(ClassController.class.getName());
    private ClassController(){}
    public static void main(String[] args)
    {
        //Creating students
        CreateStudents createStudents = new CreateStudents();
        List<Student> students = createStudents.create();

        //Creating rooms
        CreateRoom createRoom = new CreateRoom();
        ClassRoom xyz = createRoom.create("xyz", students);

        //Printing students with no subjects
        StudentsWithNoSubjectsImpl studentsWithNoSubjects = new StudentsWithNoSubjectsImpl();
        LOGGER.info("Students with no subjects: ");
        studentsWithNoSubjects.getStudentsWithNoSubjects(xyz);

        //Printing subjects of students with roomID "xyz"
        PrintSubjectsOfClassImpl printSubjectsOfClass = new PrintSubjectsOfClassImpl();
        LOGGER.info("Subjects of students of room xyz: ");
        printSubjectsOfClass.getSubjectsOfClassXYZ(xyz);

        //Printing "hello Student" if room has students
        RoomWithStudentsImpl roomWithStudents = new RoomWithStudentsImpl();
        roomWithStudents.checkRoomEmpty(xyz);
    }
}

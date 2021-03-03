package test;

import com.knoldus.assignment1.Entity.ClassRoom;
import com.knoldus.assignment1.Entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class ClassRoomTest {

    @org.junit.Test
    public void getStudentList() {
        List<Student> students= new ArrayList<>();
        Optional<List<Student>> studentList = Optional.of(students);
        ClassRoom classRoom = new ClassRoom(studentList);
        assert(classRoom.getStudentList().isPresent());
    }
}
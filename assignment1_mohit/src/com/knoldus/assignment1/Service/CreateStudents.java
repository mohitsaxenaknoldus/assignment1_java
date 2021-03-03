package com.knoldus.assignment1.Service;

import com.knoldus.assignment1.Entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CreateStudents {

    /**
     * create
     * @return List of Student
     */
    public List<Student> create()
    {
        String[] subjects = {"Maths", "Hindi", "English", "Science", "SST"};
        List<String> list = new ArrayList<>(Arrays.asList(subjects));
        Optional<List<String>> subjectList = Optional.of(list);

        String roomID = "xyz";
        final int rollNo = 401;

        Student mohit = new Student("Mohit Saxena", rollNo, subjectList, roomID);
        Student nitin = new Student("Nitin Kumar Mishra", rollNo, Optional.empty(), roomID);
        Student kiran = new Student("Kiran Jeet Kaur", rollNo, subjectList, roomID);
        Student sakshi = new Student("Sakshi Mittal", rollNo, Optional.empty(), roomID);

        List<Student> students = new ArrayList<>();
        students.add(mohit);
        students.add(nitin);
        students.add(kiran);
        students.add(sakshi);

        return students;
    }
}

package com.knoldus.assignment1.Service;

import com.knoldus.assignment1.Entity.Student;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsWithNoSubjectsImpl implements StudentsWithNoSubjects{

    /**
     * getStudentsWithNoSubjects
     * @param list - List of type Student
     * @return List of type Student
     */
    @Override
    public List<Student> getStudentsWithNoSubjects(List<Student> list) {
        return list.stream()
                   .filter(Student::checkSubjectsEmpty)
                   .collect(Collectors.toList());
    }
}

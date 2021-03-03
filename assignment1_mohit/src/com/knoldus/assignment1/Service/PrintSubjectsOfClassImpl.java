package com.knoldus.assignment1.Service;

import com.knoldus.assignment1.Entity.Student;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSubjectsOfClassImpl implements PrintSubjectsOfClass{

    /**
     * getSubjectOfClassXYZ
     * @param list - List of type Student
     * @return List of type Student
     */
    @Override
    public List<Student> getSubjectsOfClassXYZ(List<Student> list) {
        return list.stream().filter(l -> l.getRoomID().equals("xyz"))
                     .filter(l -> !l.checkSubjectsEmpty())
                     .collect(Collectors.toList());
    }
}

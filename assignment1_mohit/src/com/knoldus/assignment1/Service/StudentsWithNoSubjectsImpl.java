package com.knoldus.assignment1.Service;

import com.knoldus.assignment1.Entity.ClassRoom;

public class StudentsWithNoSubjectsImpl implements StudentsWithNoSubjects{

    /**
     * getStudentsWithNoSubjects
     * @param classRoom - ClassRoom instance
     * @return void - this method only prints
     */
    @Override
    public void getStudentsWithNoSubjects(ClassRoom classRoom) {
        classRoom.getStudentList().get().stream().filter(s -> s.checkSubjectsEmpty()).forEach(System.out::println);
    }
}

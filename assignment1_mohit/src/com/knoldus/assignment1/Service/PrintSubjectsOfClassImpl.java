package com.knoldus.assignment1.Service;

import com.knoldus.assignment1.Entity.ClassRoom;
import com.knoldus.assignment1.Entity.Student;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PrintSubjectsOfClassImpl implements PrintSubjectsOfClass{

    /**
     * getSubjectOfClassXYZ
     * @param classRoom - Instance of ClassRoom
     * @return void - This method only prints the subjects
     */
    @Override
    public void getSubjectsOfClassXYZ(ClassRoom classRoom) {
        List<Student> studentList = classRoom.getStudentList().get().stream().collect(Collectors.toList());
        List<Optional<List<String>>> subjectList = studentList.stream().map(Student::getSubjects).collect(Collectors.toList());
        subjectList.get(0).stream().collect(Collectors.toList()).forEach(System.out::println);
    }
}

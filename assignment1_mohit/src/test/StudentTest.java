package test;

import com.knoldus.assignment1.Entity.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class StudentTest {

    private String[] subjects = {"Maths", "Hindi", "English", "Science", "SST"};
    private List<String> list = new ArrayList<>(Arrays.asList(subjects));
    private Optional<List<String>> subjectList = Optional.of(list);
    private static final int ROLLNO = 401;
    private Student student = new Student("Mohit Saxena", ROLLNO, subjectList, "xyz");

    @Test
    public void checkSubjectsEmpty() {
        assert (!student.checkSubjectsEmpty());
    }

    @Test
    public void getSubjects() {
        assert (student.getSubjects().isPresent());
    }

    @Test
    public void getRoomID() {
        assert (student.getRoomID().equals("xyz"));
    }
}
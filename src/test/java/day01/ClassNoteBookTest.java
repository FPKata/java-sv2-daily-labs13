package day01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {
    @Test
    void testAddStudent(){
        ClassNoteBook classNoteBook = new ClassNoteBook();

        Student student = new Student(1, "John");
        classNoteBook.addStudent(student);

        assertTrue(classNoteBook.getNotebook().keySet().contains(student));
        assertEquals(0, classNoteBook.getNotebook().get(student).size());
    }

    @Test
    void testAddStudentInOrder(){
        ClassNoteBook classNoteBook = new ClassNoteBook();

        Student student = new Student(1, "John");
        Student student2 = new Student(3, "Mari");
        Student student3 = new Student(2, "Jenny");

        classNoteBook.addStudent(student);
        classNoteBook.addStudent(student2);
        classNoteBook.addStudent(student3);

        assertEquals(List.of(student, student3, student2), new ArrayList<>(classNoteBook.getNotebook().keySet()));

//        int i = 1;
//        for (Map.Entry<Student, List<Integer>> actual : classNoteBook.getNotebook().entrySet()){
//            assertEquals(i, actual.getKey().getId());
//            i++;
//        }
    }

    @Test
    void testAddMark(){
        ClassNoteBook classNoteBook = new ClassNoteBook();

        Student student = new Student(1, "John");
        Student student2 = new Student(3, "Mari");
        Student student3 = new Student(2, "Jenny");

        classNoteBook.addStudent(student);
        classNoteBook.addStudent(student2);
        classNoteBook.addStudent(student3);

        classNoteBook.addMark(2, 5);

        assertEquals(5, classNoteBook.getNotebook().get(student3).get(0));
    }
}
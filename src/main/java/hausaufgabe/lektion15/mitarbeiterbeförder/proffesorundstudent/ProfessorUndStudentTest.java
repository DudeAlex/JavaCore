package hausaufgabe.lektion15.mitarbeiterbeförder.proffesorundstudent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfessorUndStudentTest {
    @Test
    public void testStudentTaetigkeit() {
        Student student = new Student("Programmieren");
        assertEquals("Der Student besucht das Fach Programmieren", student.gibTaetigkeitAus());
    }

    @Test
    public void testProfessorTaetigkeit() {
        Professor professor = new Professor("Programmieren");
        assertEquals("Der Professor unterrichtet Programmieren", professor.gibTaetigkeitAus());
    }
}

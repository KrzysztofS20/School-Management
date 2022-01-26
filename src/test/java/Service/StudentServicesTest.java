package Service;

import Entity.Student;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentServicesTest {

    Student student1 = new Student("Alex", "Hunt", 147258369,
            1, 123456789, "alexhunt@yes.com", 5000.0);
    Student student2 = new Student("Alex", "XYZ", 741852963,
            1, 123456789, "alexxyz@yes.com", 5000.0);
    Student student3 = new Student("Tom", "Batory", 987456321,
            1, 123456789, "tombatory@yes.com", 5000.0);
    StudentServices services = new StudentServices();

    @Test
    void payment() {
        services.payment(student1, 400.0);
        assertEquals(400.0, student1.getAlreadyPaid());

        services.payment(student1, 400.0);
        assertEquals(800.0, student1.getAlreadyPaid());
    }

    @Test
    void checkHowMuchHaveToPay() {
        services.payment(student1, 500.0);
        assertEquals(4500.0, services.checkHowMuchHaveToPay(student1));
    }

    @Test
    void getStudentsByName(){
        List<Student> listOfStudentsForOperation = new ArrayList<Student>();
        listOfStudentsForOperation.add(student1);
        listOfStudentsForOperation.add(student2);
        listOfStudentsForOperation.add(student3);

      assertEquals(2, services.getStudentsByName(listOfStudentsForOperation,"Alex").size());
    }

    @Test
    void getStudentByPersonalIdentity(){
        List<Student> listOfStudentsForOperation = new ArrayList<Student>();
        listOfStudentsForOperation.add(student1);
        listOfStudentsForOperation.add(student2);
        listOfStudentsForOperation.add(student3);

        assertEquals(student2,services.getStudentByPersonalIdentity(listOfStudentsForOperation,741852963));

        assertThrows(NoSuchElementException.class,()->{
            services.getStudentByPersonalIdentity(listOfStudentsForOperation,123);
        });
    }
}
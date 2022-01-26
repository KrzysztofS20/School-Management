package Service;

import Entity.Student;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StudentServices {

    public void payment(Student student, Double money) {
        student.setAlreadyPaid(student.getAlreadyPaid() + money);
        System.out.println("Student payd " + money);
    }

    public Double checkHowMuchHaveToPay(Student student) {
        return student.getAmountToPay() - student.getAlreadyPaid();
    }

    public List<Student> getStudentsByName(List<Student> studentList, String name) {
        return studentList.stream()
                .filter(student -> student.getFirstName().equals(name))
                .collect(Collectors.toList());
    }

    public Student getStudentByPersonalIdentity(List<Student> studentList, int personalIdentity){
        return studentList.stream()
                .filter(student -> student.getPersonalIdentity()==personalIdentity)
                .findFirst()
                .orElseThrow(()-> new NoSuchElementException("Student with personal identity: "+personalIdentity+" doesn't exist"));
    }
}

import Entity.Student;
import Service.StudentServices;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("Marek","Paw",
                78945879,0,789456123,"marekPaw@botak.pl",4000.00);
        List<Student> list = new ArrayList<>();
        list.add(student1);

        StudentServices services = new StudentServices();
        System.out.println(services.getStudentByPersonalIdentity(list,123));
    }
}

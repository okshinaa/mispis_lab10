import src.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<Lecturer> lecturers = new LinkedList<>();
        Collection<Student> students = new LinkedList<>();
        Collection<Course> courses = new LinkedList<>();
        Collection<Institute> institutes = new LinkedList<>();
        Collection<Faculty> faculties = new LinkedList<>();
        Collection<AdminEmployee> adminEmployees = new LinkedList<>();

        Lecturer lecturer = new Lecturer(1, 10, "mail@mail.ru",
                "Малыхин А.Ю.", 4);
        lecturers.add(lecturer);

        Student student = new Student("Окшина Валерия");
        students.add(student);

        AdminEmployee adminEmployee = new AdminEmployee("Петров И.В.", 100000,
                "mail@mail.ru", 5, 2);
        adminEmployees.add(adminEmployee);

        Project project = new Project("Проект",
                new Date(2023, Calendar.DECEMBER, 13),
                new Date(2023, Calendar.DECEMBER, 31));

        ResearchAssociate assistant = new ResearchAssociate("ФКН", "Сидоров А.А.");

        Dean dean = new Dean("Иванов Г.Р.", 100000,
                "mail@mail.ru", 6, 3);

        Participation participation = new Participation(45.5);

        Course course = new Course("МИСПИС", 42, 120);
        courses.add(course);

        Institute institute = new Institute("ВГУ", "г. Воронеж");
        institutes.add(institute);

        Faculty faculty = new Faculty(dean, institutes, "ФКН");
        faculties.add(faculty);

        lecturers.forEach(System.out::println);
        students.forEach(System.out::println);
        courses.forEach(System.out::println);
        faculties.forEach(System.out::println);
        institutes.forEach(System.out::println);
        adminEmployees.forEach(System.out::println);
        System.out.println(participation);
        System.out.println(assistant);
        System.out.println(project);
    }
}
package one;

import one.Student;

public class Teacher {
    private Student[] students;
    private String name;
    private int age;

    public Teacher(Student[] students, String name, int age) {
        this.students = students;
        this.name = name;
        this.age = age;
    }

    public void showStudents() {
        System.out.println("Ученики преподователя по имени " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + ", " + student.getAge());
        }
    }

    public void studentMethods() {
        System.out.println("Вызываем методы учеников преподователя по имени " + name + ":");
        for (Student student : students) {
            student.sayHello();
            student.birthday();
        }
    }

    public void sayHello() {
        System.out.println("Здравствуйте, меня зовут " + name + ", мне " + age + " лет");
    }

    public void birthday() {
        age++;
        System.out.println("У меня день рождение, теперь мне " + age + " лет!");
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package one;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student(11, "Ваня", "Петров");
        Student student2 = new Student(10, "Петя", "Семенов");
        Student student3 = new Student(17, "Саша", "Королев");
        Student student4 = new Student(8, "Оля", "Бобкина");
        Student student5 = new Student(7, "Маша", "Коробкина");
        Student student6 = new Student(16, "Катя", "Олд");
        Student student7 = new Student(9, "Ашурбанапал", "Владимиров");

        Teacher teacher1 = new Teacher(new Student[]{student1, student2, student3}, "Александр", 25);
        Teacher teacher2 = new Teacher(new Student[]{student4, student5}, "Ирина", 32);
        Teacher teacher3 = new Teacher(new Student[]{student6, student7}, "Илларион", 53);

        teacher1.sayHello();
        teacher1.birthday();
        teacher1.showStudents();
        teacher1.studentMethods();
        System.out.println();

        teacher2.sayHello();
        teacher2.birthday();
        teacher2.showStudents();
        teacher2.studentMethods();
        System.out.println();

        teacher3.sayHello();
        teacher3.birthday();
        teacher3.showStudents();
        teacher3.studentMethods();
        System.out.println();
    }
}

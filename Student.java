package one;

public class Student {
    private int age;
    private String name;
    private String surname;

    public Student(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут " + name + " " + surname + ", мне " + age + " лет");
    }

    public void birthday() {
        age++;
        System.out.println("У меня день рождение, теперь мне " + age + " лет!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

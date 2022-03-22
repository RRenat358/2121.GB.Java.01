package lesson05;

public class Employe {
    String name = "-";
    int age;
    String phoneNamber = "-";
    String email = "-";
    String position = "-";
    int salary;

    public Employe() {
    }

    public Employe(String name, int age, String phoneNamber, String email, String position, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNamber = phoneNamber;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }

    public String employeToString() {
        return "name = " + name + ", age = " + age + "\n," +
                phoneNamber + " | " + email + "\n," +
                position + " | " + salary + " руб.";
    }
}

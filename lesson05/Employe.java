package lesson05;

public class Employe {
    String name = "ИМЯ";
    int age = 1;
    String phoneNumber = "+7---";
    String email = "email";
    String position = "Должность";
    int salary = 10000;

    public Employe() {
    }

    public Employe(String name, int age, String phoneNumber, String email, String position, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }

    public String employeToString() {
        return name + ", " + age + ", " + phoneNumber + ", " + email + ", " + position + ", " + salary + "руб.";
    }
}

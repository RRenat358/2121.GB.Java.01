package lesson05;

public class Employe {
    String name = "-";
    int age;
    String phoneNamber = "-";
    String email = "-";
    String position = "-";
    int salary;

    public Employe(String name, int age, String phoneNamber, String email, String position, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNamber = phoneNamber;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNamber='" + phoneNamber + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

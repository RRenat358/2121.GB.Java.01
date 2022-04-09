package Lesson05;

public class RunApp {
    public static void main(String[] args) {
        Employe employe = new Employe();
        System.out.println("––––––––––––––––––––––––––––––");
        //Вывод дефолтных значений
        System.out.println(employe.employeToString());

        //======================================================================
        Employe[] persArray = new Employe[5];
        persArray[0] = new Employe("Татьяна", 28, "+78005550001", "123@gmail.com", "Менеджер#1", 50000);
        persArray[1] = new Employe("Татьяна", 41, "+78005550002", "123@gmail.com", "Менеджер#2", 50000);
        persArray[2] = new Employe("Татьяна", 33, "+78005550003", "123@gmail.com", "Менеджер#3", 50000);
        persArray[3] = new Employe("Татьяна", 42, "+78005550004", "123@gmail.com", "Менеджер#4", 50000);
        persArray[4] = new Employe("Татьяна", 25, "+78005550005", "123@gmail.com", "Менеджер#5", 50000);

        System.out.println("––––––––––––––––––––––––––––––");
        for (int i = 0; i < 5; i++) {
            if (persArray[i].age > 40) {
                System.out.println(persArray[i].employeToString());
            }
        }
        System.out.println("––––––––––––––––––––––––––––––");
    }
}

package lesson05;

public class RunApp {
    public static void main(String[] args) {
        Employe employe = new Employe();
        System.out.println(employe.employeToString());


        Employe[] persArray = new Employe[5];
        persArray[0] = new Employe("имя", 5,"имя","имя","имя","имя",5);




    }
}

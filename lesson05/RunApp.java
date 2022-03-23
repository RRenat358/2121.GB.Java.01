package lesson05;

public class RunApp {
    public static void main(String[] args) {
        Employe employe = new Employe();
        System.out.println(employe.employeToString());


        Employe[] persArray = new Employe[5];
        persArray[0] = new Employe("Татьяна", 28,"+7 800 555 0001","123@gmail.com","Менеджер №01",50000);
        persArray[1] = new Employe("Татьяна", 41,"+7 800 555 0002","123@gmail.com","Менеджер №02",50000);
        persArray[2] = new Employe("Татьяна", 33,"+7 800 555 0003","123@gmail.com","Менеджер №03",50000);
        persArray[3] = new Employe("Татьяна", 42,"+7 800 555 0004","123@gmail.com","Менеджер №04",50000);
        persArray[4] = new Employe("Татьяна", 25,"+7 800 555 0005","123@gmail.com","Менеджер №05",50000);

        System.out.println();


    }
}

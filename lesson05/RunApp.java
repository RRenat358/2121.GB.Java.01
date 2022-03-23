package lesson05;

public class RunApp {
    public static void main(String[] args) {
        Employe employe = new Employe();
        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println(employe.employeToString());

        //======================================================================
        Employe[] persArray = new Employe[5];
        persArray[0] = new Employe("Татьяна", 28, "+78005550001", "123@gmail.com", "Менеджер №01", 50000);
        persArray[1] = new Employe("Татьяна", 41, "+78005550002", "123@gmail.com", "Менеджер №02", 50000);
        persArray[2] = new Employe("Татьяна", 33, "+78005550003", "123@gmail.com", "Менеджер №03", 50000);
        persArray[3] = new Employe("Татьяна", 42, "+78005550004", "123@gmail.com", "Менеджер №04", 50000);
        persArray[4] = new Employe("Татьяна", 25, "+78005550005", "123@gmail.com", "Менеджер №05", 50000);


        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println(employe.employeToString2(persArray[0].name, persArray[0].age, persArray[0].phoneNumber, persArray[0].email, persArray[0].position, persArray[0].salary));
        System.out.println("––––––––––––––––––––––––––––––");
    }
}

package Lesson08;

import javax.swing.*;

public class AppForm extends JFrame {
    AppForm() {
        setTitle("Форма со стрелочками");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 500, 450, 300);

        JButton button01 = new JButton("555");
        add(button01);



        setVisible(true);
    }

    public static void main(String[] args) {
        new AppForm();
    }

}

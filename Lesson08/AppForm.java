package Lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppForm extends JFrame {
    int button01TextCounter = 0;

    AppForm() {
        setTitle("Форма со стрелочками");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 500, 450, 300);

        setLayout(new GridLayout(3,3));
        Font fontArial32B = new Font("Arial", Font.BOLD, 32);


        JButton button01 = new JButton("Нажми сюда");
        button01.setFont(fontArial32B);
        add(button01);

        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button01TextCounter++;
                button01.setText(String.valueOf(button01TextCounter));
            }
        });




        setVisible(true);
    }

    public static void main(String[] args) {
        new AppForm();
    }

    private static void actionPerformed(ActionEvent e) {
    }
}

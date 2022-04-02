package Lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class appForm extends JFrame {
    int counterValue = 0;

    appForm() {
        setTitle("Форма со стрелочками");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 500, 450, 300);

//        setLayout(new GridLayout(3, 3));
        Font fontArial32B = new Font("Arial", Font.BOLD, 32);
//        Font fontCalibri32B = new Font("Calibri", Font.BOLD, 32);
//        Font fontSegoe32B = new Font("Segoe UI", Font.BOLD, 32);
        Font fontCourier24B = new Font("Courier New", Font.BOLD, 24);
        Font fontCourier32B = new Font("Courier New", Font.BOLD, 32);

/*
        //======================================================================
        JLabel counterValueView = new JLabel();
        add(counterValueView, BorderLayout.CENTER);
        counterValueView.setFont(fontCourier32B);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        counterValueView.setText(String.valueOf(counterValue));
        counterValueView.setOpaque(true);
        counterValueView.setBackground(Color.decode("#C0C0C0"));

        //------------------------------
        JButton buttonDecrement = new JButton("<");
        buttonDecrement.setFont(fontCourier32B);
        add(buttonDecrement, BorderLayout.WEST);

        JButton buttonIncrement = new JButton(">");
        buttonIncrement.setFont(fontCourier32B);
        add(buttonIncrement, BorderLayout.EAST);
*/
        JButton buttonReset = new JButton("reset");
        buttonReset.setFont(fontCourier24B);
        buttonReset.setBackground(Color.white);
        add(buttonReset, BorderLayout.NORTH);
/*
        //======================================================================
        buttonDecrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counterValue--;
                counterValueView.setBackground(Color.decode("#FFCD87"));
                buttonDecrement.setForeground(Color.red);
                buttonIncrement.setForeground(null);
                counterValueView.setText(String.valueOf(counterValue));
            }
        });

        buttonIncrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counterValue++;
                counterValueView.setBackground(Color.decode("#E3FF96"));
                buttonDecrement.setForeground(null);
                buttonIncrement.setForeground(Color.green);
                counterValueView.setText(String.valueOf(counterValue));
            }
        });

        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counterValue = 0;
                counterValueView.setBackground(null);
                buttonDecrement.setForeground(null);
                buttonIncrement.setForeground(null);
                counterValueView.setText(String.valueOf(counterValue));
            }
        });

/*
        JPanel grid = new JPanel(new GridLayout(1, 2, 5, 0));
        // Добавление кнопок в панель
        grid.add(new JButton("OK"));
        grid.add(new JButton("Отмена"));
        // Создание панели с последовательным расположением
        // компонентов и выравниванием по правому краю
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        flow.add(grid);
        // Получение панели содержимого
        Container container = getContentPane();
        // Размещение панели с кнопками внизу справа
        container.add(flow, BorderLayout.SOUTH);
*/
/*
        JPanel grid1 = new JPanel(new GridLayout(1, 2));
        JPanel grid2 = new JPanel(new GridLayout(2, 1));
        JPanel grid3 = new JPanel(new GridLayout(2, 1));
        JPanel grid4 = new JPanel(new GridLayout(1, 3));
*/
        JPanel grid1 = new JPanel();
        JPanel grid2 = new JPanel();
        JPanel grid3 = new JPanel();
        JPanel grid4 = new JPanel();


        grid1.add(new JLabel("-111-"));
        grid2.add(new JLabel("-222-"));
        grid3.add(new JLabel("-333-"));
        grid4.add(new JLabel("-444-"));

        grid1.setBorder(BorderFactory.createLineBorder(Color.black));
        grid2.setBorder(BorderFactory.createLineBorder(Color.black));
        grid3.setBorder(BorderFactory.createLineBorder(Color.black));
        grid4.setBorder(BorderFactory.createLineBorder(Color.black));
/*
        grid1.add(grid2);
        grid2.add(grid3);
        grid3.add(grid4);
*/
/*
        grid4.add(grid3);
        grid3.add(grid2);
        grid2.add(grid1);
*/

        grid1.setLayout(new GridLayout(1, 2));
        grid2.setLayout(new GridLayout(2, 1));
        grid3.setLayout(new GridLayout(2, 1));
        grid4.setLayout(new GridLayout(1, 3));

        add(grid1, BorderLayout.EAST);
        grid1.add(grid2, BorderLayout.NORTH);
        grid2.add(grid3, BorderLayout.NORTH);
        grid3.add(grid4, BorderLayout.SOUTH);
        add(grid2, BorderLayout.WEST);

        JFrame frame = new JFrame("SpringLayoutTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        Component label = new JLabel("Метка");
        Component field = new JTextField(15);

        contentPane.add(buttonReset);
        contentPane.add(field);

        layout.putConstraint(SpringLayout.EAST,
                buttonReset, 0, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.VERTICAL_CENTER,
                buttonReset, 0, SpringLayout.VERTICAL_CENTER, contentPane);

        layout.putConstraint(SpringLayout.NORTH, field, 25,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, field, 20,
                SpringLayout.EAST, label);

        frame.setSize(300, 110);
        frame.setVisible(true);

        grid1.setForeground(Color.red);
        grid2.setForeground(Color.blue);
        grid3.setForeground(Color.green);
        grid4.setForeground(Color.black);

        Container container1 = getContentPane();
        Container container2 = getContentPane();
        Container container3 = getContentPane();
        Container container4 = getContentPane();
/*        // Размещение панели с кнопками внизу справа
        container1.add(grid1, BorderLayout.NORTH);
        container2.add(grid2, BorderLayout.WEST);
        container3.add(grid3, BorderLayout.EAST);
        container4.add(grid4, BorderLayout.SOUTH);
*/
/*
        container1.add(grid1);
        container2.add(grid2);
        container3.add(grid3);
        container4.add(grid4);
*//*
        container2.add(grid2,BorderLayout.NORTH);
        container1.add(grid1,BorderLayout.CENTER);

        container3.add(grid3,BorderLayout.WEST);
        container4.add(grid4,BorderLayout.WEST);
*/


        setVisible(true);
    }

    //======================================================================
    public static void main(String[] args) {
        new appForm();

    }

}

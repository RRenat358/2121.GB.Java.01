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

        Font fontArial32B = new Font("Arial", Font.BOLD, 32);
        Font fontCalibri32B = new Font("Calibri", Font.BOLD, 32);
        Font fontSegoe32B = new Font("Segoe UI", Font.BOLD, 32);
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

        JButton buttonReset = new JButton("reset");
        buttonReset.setFont(fontCourier24B);
        buttonReset.setBackground(Color.white);
        add(buttonReset, BorderLayout.NORTH);

*/
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
        JPanel grid1 = new JPanel(new GridLayout(1, 2));
        JPanel grid2 = new JPanel(new GridLayout(2, 1));
        JPanel grid3 = new JPanel(new GridLayout(2, 1));
        JPanel grid4 = new JPanel(new GridLayout(1, 3));
*/
        //======================================================================
        JPanel grid11 = new JPanel(new GridLayout(0, 2, 5, 0));

        JPanel fieldSidebarLeft = new JPanel();
        fieldSidebarLeft.setBackground(Color.decode("#CCCCCC"));
        fieldSidebarLeft.setOpaque(true);
        fieldSidebarLeft.add(new JLabel("fieldSidebarLeft"), "Center");
        fieldSidebarLeft.add(new JLabel(String.valueOf(getWidth()/3)), "South");
//        fieldSidebarLeft.setSize(fieldSidebarLeft.getWidth()/3,50);
        fieldSidebarLeft.setPreferredSize(new Dimension(40, 80));

        JPanel fieldGame = new JPanel();
        fieldGame.setBackground(Color.decode("#E3FF96"));
        fieldGame.setOpaque(true);
        fieldGame.add(new JLabel("fieldGame"), "Center");

        grid11.add(fieldSidebarLeft);
        grid11.add(fieldGame);
        add(grid11);

        //======================================================================






//======================================================================

//======================================================================

        System.out.println("JPanel Size - " + fieldSidebarLeft.getSize());

        //======================================================================
        setVisible(true);
    }

    //======================================================================
    public static void main(String[] args) {
        new appForm();

    }

}

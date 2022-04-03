package Lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class appForm extends JFrame {
    int counterValue = 0;

    appForm() {
        setTitle("Field Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int windowWidth = 750;
        int windowHeight = 500;
        setBounds(200, 200, windowWidth, windowHeight);

        Font fontArial32B = new Font("Arial", Font.BOLD, 32);
        Font fontCalibri32B = new Font("Calibri", Font.BOLD, 32);
        Font fontSegoe32B = new Font("Segoe UI", Font.BOLD, 32);
        Font fontCourier18B = new Font("Courier New", Font.BOLD, 18);
        Font fontCourier24B = new Font("Courier New", Font.BOLD, 24);
        Font fontCourier32B = new Font("Courier New", Font.BOLD, 32);

        int sidebarLeftSizeW = 160;
        int sidebarLeftSizeH = windowHeight;
//        Dimension sidebarLeftSize = new Dimension(sidebarLeftSizeW, sidebarLeftSizeH);

        //======================================================================
        JPanel fieldSidebarLeft = new JPanel();
        fieldSidebarLeft.setOpaque(true);
        //todo H=getHeight()+repaint();
        fieldSidebarLeft.setPreferredSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH));
        fieldSidebarLeft.setMaximumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH));
        fieldSidebarLeft.setMinimumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH));
        fieldSidebarLeft.setLayout(new BoxLayout(fieldSidebarLeft, BoxLayout.Y_AXIS));
        fieldSidebarLeft.setBackground(Color.decode("#CCCCCC"));

        //top 50%
        JPanel fieldSidebarLeft2 = new JPanel();
        fieldSidebarLeft2.setOpaque(true);
        fieldSidebarLeft2.setPreferredSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));
        fieldSidebarLeft2.setMaximumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));
        fieldSidebarLeft2.setMinimumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));
        fieldSidebarLeft2.setBackground(Color.decode("#AAAAAA"));
        fieldSidebarLeft.add(fieldSidebarLeft2);

        //bottom 50%
        JPanel fieldSidebarLeft3 = new JPanel();
        fieldSidebarLeft3.setOpaque(true);
        fieldSidebarLeft2.setPreferredSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));
        fieldSidebarLeft2.setMaximumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));
        fieldSidebarLeft2.setMinimumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));
        fieldSidebarLeft3.setBackground(Color.decode("#EEEEAA"));
        fieldSidebarLeft.add(fieldSidebarLeft3);

        //======================================================================
        JButton buttonDecrement = new JButton("<");
        buttonDecrement.setPreferredSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        buttonDecrement.setMaximumSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        buttonDecrement.setMinimumSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        buttonDecrement.setFont(fontCourier18B);

        JLabel counterValueView = new JLabel();
        counterValueView.setOpaque(true);
        counterValueView.setPreferredSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        counterValueView.setMaximumSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        counterValueView.setMinimumSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        counterValueView.setFont(fontCourier24B);
        counterValueView.setHorizontalAlignment(JLabel.CENTER);
        counterValueView.setText(String.valueOf(counterValue));
        counterValueView.setBackground(Color.decode("#C0C0C0"));

        JButton buttonIncrement = new JButton(">");
        buttonIncrement.setPreferredSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        buttonIncrement.setMaximumSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        buttonIncrement.setMinimumSize(new Dimension(sidebarLeftSizeW/3,sidebarLeftSizeH/12));
        buttonIncrement.setFont(fontCourier18B);

        JPanel grid2 = new JPanel();
        grid2.setLayout(new GridLayout(1, 3, 0, 0));
        grid2.add(buttonDecrement);
        grid2.add(counterValueView);
        grid2.add(buttonIncrement);
        fieldSidebarLeft2.add(grid2);

        //------------------------------
        JButton buttonReset = new JButton("reset");
        buttonReset.setPreferredSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/12));
        buttonReset.setMaximumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/12));
        buttonReset.setMinimumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/12));
        buttonReset.setFont(fontCourier18B);
        buttonReset.setBackground(Color.decode("#EECCAA"));
        fieldSidebarLeft2.add(buttonReset, "Top");

        //======================================================================
        JLabel fieldSidebarLeft5 = new JLabel("Sсore");
        fieldSidebarLeft5.setOpaque(true);
        fieldSidebarLeft5.setPreferredSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/12));
        fieldSidebarLeft5.setMaximumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/12));
        fieldSidebarLeft5.setMinimumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/12));
        fieldSidebarLeft5.setBackground(Color.decode("#DDDDAA"));
        fieldSidebarLeft5.setFont(fontCourier24B);
        fieldSidebarLeft5.setHorizontalAlignment(JLabel.CENTER);
        fieldSidebarLeft3.add(fieldSidebarLeft5);


        //======================================================================
        JPanel fieldGame = new JPanel();
        fieldGame.setOpaque(true);
        fieldGame.setBackground(Color.decode("#CCCCAA"));
        fieldGame.add(new JLabel("fieldGame"), "Center");

        //------------------------------
        JPanel grid1 = new JPanel();
        grid1.setLayout(new BoxLayout(grid1, BoxLayout.X_AXIS));
        grid1.add(fieldSidebarLeft);
        grid1.add(fieldGame);
        add(grid1);

        //======================================================================



        //======================================================================
        buttonDecrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counterValue--;
                counterValueView.setBackground(Color.decode("#FFDE99"));
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



        //======================================================================
        setVisible(true);
    }

    //======================================================================
    public static void main(String[] args) {
        new appForm();


    }

}

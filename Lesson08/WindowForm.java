package Lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowForm extends JFrame {
    int counterValue = 0;

    WindowForm() {
        setTitle("Field Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int windowWidth = 750;
        int windowHeight = 500;
        setBounds(200, 200, windowWidth, windowHeight);

        Font fontCourier18B = new Font("Courier New", Font.BOLD, 18);
        Font fontCourier24B = new Font("Courier New", Font.BOLD, 24);

        int sidebarLeftSizeW = 160;
        int sidebarLeftSizeH = windowHeight;

        //======================================================================
        JPanel fieldSidebarLeft = new JPanel();
        //todo H=getHeight()+repaint();
        elementSizeJPanel(fieldSidebarLeft, sidebarLeftSizeW, sidebarLeftSizeH);
        fieldSidebarLeft.setLayout(new BoxLayout(fieldSidebarLeft, BoxLayout.Y_AXIS));
        fieldSidebarLeft.setBackground(Color.decode("#CCCCCC"));

        //top 50%
        JPanel fieldSidebarLeft2 = new JPanel();
        elementSizeJPanel(fieldSidebarLeft2, sidebarLeftSizeW, sidebarLeftSizeH/2);
        fieldSidebarLeft2.setBackground(Color.decode("#AAAAAA"));
        fieldSidebarLeft.add(fieldSidebarLeft2);

        //bottom 50%
        JPanel fieldSidebarLeft3 = new JPanel();
        elementSizeJPanel(fieldSidebarLeft3, sidebarLeftSizeW, sidebarLeftSizeH/2);
        fieldSidebarLeft3.setBackground(Color.decode("#EEEEAA"));
        fieldSidebarLeft.add(fieldSidebarLeft3);

        //======================================================================
        JButton buttonDecrement = new JButton("-");
        elementSizeJButton(buttonDecrement, sidebarLeftSizeW/3, sidebarLeftSizeH/12);
        buttonDecrement.setMargin(new Insets(1, 1, 1, 1));
        buttonDecrement.setFont(fontCourier24B);

        JLabel counterValueView = new JLabel();
        elementSizeJLabel(counterValueView, sidebarLeftSizeW/3, sidebarLeftSizeH/12);
        counterValueView.setFont(fontCourier24B);
        counterValueView.setHorizontalAlignment(JLabel.CENTER);
        counterValueView.setText(String.valueOf(counterValue));
        counterValueView.setBackground(Color.decode("#C0C0C0"));

        JButton buttonIncrement = new JButton("+");
        elementSizeJButton(buttonIncrement, sidebarLeftSizeW/3, sidebarLeftSizeH/12);
        buttonIncrement.setMargin(new Insets(1, 1, 1, 1));
        buttonIncrement.setFont(fontCourier24B);

        JPanel grid2 = new JPanel();
        grid2.setLayout(new GridLayout(1, 3, 0, 0));
        grid2.add(buttonDecrement);
        grid2.add(counterValueView);
        grid2.add(buttonIncrement);
        fieldSidebarLeft2.add(grid2);

        //======================================================================
        JButton buttonDecrement2 = new JButton("-10");
        elementSizeJButton(buttonDecrement2, sidebarLeftSizeW/3, sidebarLeftSizeH/12);
        buttonDecrement2.setMargin(new Insets(1, 1, 1, 1));
        buttonDecrement2.setFont(fontCourier18B);

        JLabel counterValueView2 = new JLabel();
        elementSizeJLabel(counterValueView2, sidebarLeftSizeW/13, sidebarLeftSizeH/12);
        counterValueView2.setFont(fontCourier24B);
        counterValueView2.setHorizontalAlignment(JLabel.CENTER);
        counterValueView2.setText(String.valueOf(counterValue));
        counterValueView2.setBackground(Color.decode("#CCCCCC"));
        counterValueView2.setForeground(Color.decode("#CCCCCC"));

        JButton buttonIncrement2 = new JButton("+10");
        elementSizeJButton(buttonIncrement2, sidebarLeftSizeW/3, sidebarLeftSizeH/12);
        buttonIncrement2.setMargin(new Insets(1, 1, 1, 1));
        buttonIncrement2.setFont(fontCourier18B);

        //------------------------------
        JPanel grid3 = new JPanel();
        grid3.setLayout(new GridLayout(1, 3, 0, 0));
        grid3.add(buttonDecrement2);
        grid3.add(counterValueView2);
        grid3.add(buttonIncrement2);
        fieldSidebarLeft2.add(grid3);

        //======================================================================
        JButton buttonReset = new JButton("reset");
        elementSizeJButton(buttonReset, sidebarLeftSizeW, sidebarLeftSizeH/12);
        buttonReset.setFont(fontCourier18B);
        buttonReset.setBackground(Color.decode("#EECCAA"));
        fieldSidebarLeft2.add(buttonReset, "Top");

        //======================================================================
        JLabel fieldSidebarLeft5 = new JLabel("Sсore");
        elementSizeJLabel(fieldSidebarLeft5, sidebarLeftSizeW, sidebarLeftSizeH/12);
        fieldSidebarLeft5.setBackground(Color.decode("#DDDDAA"));
        fieldSidebarLeft5.setFont(fontCourier18B);
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
        buttonDecrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counterValue--;
                counterValueView.setBackground(Color.decode("#FFDE99"));
                buttonDecrement.setForeground(Color.red);
                buttonIncrement.setForeground(null);
                buttonDecrement2.setForeground(null);
                buttonIncrement2.setForeground(null);
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
                buttonDecrement2.setForeground(null);
                buttonIncrement2.setForeground(null);
                counterValueView.setText(String.valueOf(counterValue));
//                counterValueView2.setText(String.valueOf(counterValue));
            }
        });

        buttonDecrement2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counterValue -= 10;
                counterValueView.setBackground(Color.decode("#FFDE99"));
                buttonDecrement.setForeground(null);
                buttonIncrement.setForeground(null);
                buttonDecrement2.setForeground(Color.red);
                buttonIncrement2.setForeground(null);
                counterValueView.setText(String.valueOf(counterValue));
//                counterValueView2.setText(String.valueOf(counterValue));
            }
        });

        buttonIncrement2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counterValue += 10;
                counterValueView.setBackground(Color.decode("#E3FF96"));
                buttonDecrement.setForeground(null);
                buttonIncrement.setForeground(null);
                buttonDecrement2.setForeground(null);
                buttonIncrement2.setForeground(Color.green);
                counterValueView.setText(String.valueOf(counterValue));
            }
        });
        //------------------------------
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counterValue = 0;
                counterValueView.setBackground(null);
                buttonDecrement.setForeground(null);
                buttonIncrement.setForeground(null);
                buttonDecrement2.setForeground(null);
                buttonIncrement2.setForeground(null);
                counterValueView.setText(String.valueOf(counterValue));
            }
        });

        //======================================================================
        setVisible(true);
    }
    public void elementSizeJPanel(JPanel element, int sizeW, int sizeH) {
        element.setPreferredSize(new Dimension(sizeW, sizeH));
        element.setMaximumSize(new Dimension(sizeW, sizeH));
        element.setMinimumSize(new Dimension(sizeW, sizeH));
        element.setOpaque(true);
    }
    public void elementSizeJLabel(JLabel element, int sizeW, int sizeH) {
        element.setPreferredSize(new Dimension(sizeW, sizeH));
        element.setMaximumSize(new Dimension(sizeW, sizeH));
        element.setMinimumSize(new Dimension(sizeW, sizeH));
        element.setOpaque(true);
    }
    public void elementSizeJButton(JButton element, int sizeW, int sizeH) {
        element.setPreferredSize(new Dimension(sizeW, sizeH));
        element.setMaximumSize(new Dimension(sizeW, sizeH));
        element.setMinimumSize(new Dimension(sizeW, sizeH));
        element.setOpaque(true);
    }
}

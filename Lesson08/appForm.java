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
        setBounds(200, 200, 600, 600);

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
        JPanel grid11 = new JPanel();
//        grid11.setLayout(new GridLayout(0, 2, 5, 0));
        grid11.setLayout(new BoxLayout(grid11, BoxLayout.X_AXIS));

        int sidebarLeftSizeW = 150;
        int sidebarLeftSizeH = 500;
        Dimension sidebarLeftSize = new Dimension(sidebarLeftSizeW, 80);




        JPanel fieldSidebarLeft = new JPanel();
        fieldSidebarLeft.setOpaque(true);
        fieldSidebarLeft.setBackground(Color.decode("#CCCCCC"));
//        fieldSidebarLeft.add(new JLabel("fieldSidebarLeft"), "Center");
        fieldSidebarLeft.setLayout(new BoxLayout(fieldSidebarLeft, BoxLayout.Y_AXIS));
        fieldSidebarLeft.setPreferredSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH));
        fieldSidebarLeft.setMaximumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH)); //todo H=getHeight()+repaint();
        fieldSidebarLeft.setMinimumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH));



        JPanel fieldSidebarLeft2 = new JPanel();
        fieldSidebarLeft2.setOpaque(true);
        fieldSidebarLeft2.setPreferredSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));
        fieldSidebarLeft2.setMaximumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));
        fieldSidebarLeft2.setMinimumSize(new Dimension(sidebarLeftSizeW,sidebarLeftSizeH/2));

        fieldSidebarLeft2.setBackground(Color.decode("#AAAAAA"));
        fieldSidebarLeft.add(fieldSidebarLeft2);

        JPanel fieldSidebarLeft3 = new JPanel();
        fieldSidebarLeft3.setOpaque(true);
        fieldSidebarLeft3.setBackground(Color.decode("#EEAAAA"));
        fieldSidebarLeft.add(fieldSidebarLeft3);

/*
        JLabel fieldSidebarLeft5 = new JLabel();
        fieldSidebarLeft5.setOpaque(true);
        fieldSidebarLeft5.setMaximumSize(new Dimension(30,30));
        fieldSidebarLeft5.setBackground(Color.decode("#EEAAAA"));
//        fieldSidebarLeft5.setText("field3");
//        fieldSidebarLeft5.setVerticalAlignment(JLabel.TOP);
//        fieldSidebarLeft5.setHorizontalAlignment(JLabel.CENTER);
        fieldSidebarLeft3.add(fieldSidebarLeft5);
*/


        JPanel fieldGame = new JPanel();
        fieldGame.setOpaque(true);
        fieldGame.setBackground(Color.decode("#EEFF99"));
        fieldGame.add(new JLabel("fieldGame"), "Center");



        grid11.add(fieldSidebarLeft);
        grid11.add(fieldGame);
        add(grid11);






//        System.out.println("fieldSidebarLeft Size - " + fieldSidebarLeft.getPreferredSize());
//        Container container1 = getContentPane();
        //======================================================================






//======================================================================

//======================================================================


        //======================================================================
        setVisible(true);
    }

    //======================================================================
    public static void main(String[] args) {
        new appForm();


    }

}

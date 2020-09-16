package com.company;

import java.awt.*;
import javax.swing.*;
class Pr4 extends JFrame
{
    int cMilan = 0;
    int cMadrid = 0;
    JButton jb1 = new JButton("AC Milan");
    JButton jb2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel(String.format("Result: %d X %d", cMilan, cMadrid));
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");

    public Pr4() {
        super("Example");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(150,300);
        setLayout(new FlowLayout());
        add(jb1);
        add(jb2);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        jb1.addActionListener(ae -> {
            cMilan++;
            lbl1.setText(String.format("Result: %d X %d", cMilan, cMadrid));
            lbl2.setText("Last Scorer: Milan");
            setWinner();
        });

        jb2.addActionListener(ae -> {
            cMadrid++;
            lbl1.setText(String.format("Result: %d X %d", cMilan, cMadrid));
            lbl2.setText("Last Scorer: Madrid");
            setWinner();
        });

        setVisible(true);
    }

    public void setWinner() {
        if (cMadrid != cMilan) {
            if (cMilan > cMadrid) lbl3.setText("Winner: Milan");
            else lbl3.setText("Winner: Madrid");
        } else {
            lbl3.setText("Winner: DRAW");
        }
    }


    public static void main(String[]args)
    {
        new Pr4();
    }
}
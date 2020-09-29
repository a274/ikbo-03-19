package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Lab6 extends JFrame {
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton button = new JButton(" Угадайте число от 0 до 20");
    final Random random = new Random();
    private final int result = random.nextInt(21);
    private int cnt = 0;

    Lab6() {
        super("Lab6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250,120);
        add(jta);
        jta.setFont(fnt);
        add(button);
        button.addActionListener(ae -> {
            if (cnt < 3) {
                try {
                    cnt++;
                    int x1 = Integer.parseInt(jta.getText().trim());
                    if (x1 == result)
                        JOptionPane.showMessageDialog(null, "Вы угадали!", numberOfAttempts(3 - cnt), JOptionPane.INFORMATION_MESSAGE);
                    else if (x1 > result)
                        JOptionPane.showMessageDialog(null, "Загаданное число меньше.", numberOfAttempts(3 - cnt),JOptionPane.INFORMATION_MESSAGE);
                    else JOptionPane.showMessageDialog(null, "Загаданное число больше.", numberOfAttempts(3 - cnt),JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, String.format("Попытки закончились.\nЗагаданное число - %d", result),"Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        setVisible(true);
    }

    private String numberOfAttempts(int cnt) {
        if (cnt == 2) return "Осталось 2 попытки.";
        else if (cnt == 1) return "Осталось 1 попытка.";
        else if (cnt == 0) return "Осталось 0 попыток.";
        else return "";
    }

    public static void main(String[]args) {
        new Lab6();
    }
}
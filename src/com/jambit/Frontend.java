package com.jambit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frontend {
    JButton button = new JButton();
    JButton newButton = new JButton();
    private String eingabe;
    final JTextField input = new JTextField("");

    void input() {
        JFrame frame = new JFrame("Calculator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        input.setBounds(17, 10, 250, 20);
        JButton button = new JButton("=");
        button.setBounds(275, 10, 50, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                eingabe = input.getText();
                input.setText("");
            }
        });
        frame.add(newButton);
        frame.add(input);
        frame.add(button);
        frame.add(createButton("7", 30, 50));
        frame.add(createButton("8", 90, 50));
        frame.add(createButton("9", 150, 50));
        frame.add(createButton("4", 30, 80));
        frame.add(createButton("5", 90, 80));
        frame.add(createButton("6", 150, 80));
        frame.add(createButton("1", 30, 110));
        frame.add(createButton("2", 90, 110));
        frame.add(createButton("3", 150, 110));
        frame.add(createButton("0", 90, 140));
        frame.add(createButton("+", 275, 40));
        frame.add(createButton("-", 275, 70));
        frame.add(createButton("/", 275, 100));
        frame.add(createButton("*", 275, 130));
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public String getEingabe() {
        return eingabe;
    }

    JButton createButton(String name, int x, int y) {
        JButton j = new JButton();
        j.setText(name);
        j.setBounds(x, y, 50, 20);
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                input.setText(input.getText() + name);
            }
        });
        return j;

    }
}

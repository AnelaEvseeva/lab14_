package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    Main(){
        setTitle("sum of two digits");
        setSize(800,500);
        setLocation(500,600);
        setLayout(null);
        Label labelA = new Label("a");
        labelA.setBounds(50,40,30,20);
        Label labelB = new Label("b");
        labelB.setBounds(50,70,30,20);
        Label labelSum = new Label("sum");
        labelSum.setBounds(50,100,30,20);
        TextField textFieldA = new TextField();
        textFieldA.setBounds(100,40,60,20);
        TextField textFieldB = new TextField();
        textFieldB.setBounds(100,70,60,20);
        TextField textFieldSum = new TextField();
        textFieldSum.setBounds(100,100,60,20);
        add(labelA);
        add(labelB);
        add(labelSum);
        add(textFieldA);
        add(textFieldB);
        add(textFieldSum);

        Button calc = new Button("calculate");
        calc.setBounds(70,140,90,30);
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldA.getText().equals("")||textFieldB.getText().equals("")){
                    textFieldSum.setText("Error!");
                }
                else {
                    int a = Integer.parseInt(textFieldA.getText());
                    int b = Integer.parseInt(textFieldB.getText());
                    int sum = a + b;
                    textFieldSum.setText(Integer.toString(sum));
                }
            }
        });
        Button clear = new Button("clear");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldSum.setText("");
            }
        });
        clear.setBounds(70,170,90,30);
        add(calc);
        add(clear);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}

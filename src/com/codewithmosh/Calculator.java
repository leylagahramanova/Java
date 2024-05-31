//package com.codewithmosh;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//public class Calculator implements  ActionListener {
//    JFrame frame;
//    JTextField textfield;
//    JButton[] numberButtons = new JButton[10];
//    JButton[] functionButtons = new JButton[11];
//    JButton addButton, subButton, mulButton, divButton, percentageButton;
//    JButton decButton, equButton, delButton, clrButton, negButton, divOnOneButton;
//    JPanel panel;
//    Font myFont = new Font("Ink Free", Font.BOLD, 30);
//    double num1 = 0, num2 = 0, result = 0;
//    char operator;
//
//    Calculator() {
//        String name = JOptionPane.showInputDialog ("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello "+name);
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane. showMessageDialog(null, "You are "+age+" years old");
//        frame = new JFrame("Calculator");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(420, 550);
//        frame.setLayout(null);
//        textfield = new JTextField();
//        textfield.setBounds(50, 25, 300, 58);
//        textfield.setFont(myFont);
//        textfield.setEditable(false);
//        addButton = new JButton("+");
//        subButton = new JButton("-");
//        mulButton = new JButton("*");
//        divButton = new JButton("/");
//        decButton = new JButton(".");
//        equButton = new JButton("=");
//        delButton = new JButton("Del");
//        clrButton = new JButton("Clr");
//        negButton = new JButton("(-)");
//        percentageButton=new JButton("%");
//        divOnOneButton=new JButton("1/");
//        functionButtons[0] = addButton;
//        functionButtons[1] = subButton;
//        functionButtons[2] = mulButton;
//        functionButtons[3] = divButton;
//        functionButtons[4] = decButton;
//        functionButtons[5] = equButton;
//        functionButtons[6] = delButton;
//        functionButtons[7] = clrButton;
//        functionButtons[8] = negButton;
//        functionButtons[9] = percentageButton;
//        functionButtons[10] = divOnOneButton;
//        for (int i = 0; i < 11; i++) {
//            functionButtons[i].addActionListener(this);
//            functionButtons[i].setFont(myFont);
//            functionButtons[i].setFocusable(false);
//        }
//        for (int i = 0; i < 10; i++) {
//            numberButtons[i] = new JButton(String.valueOf(i));
//            numberButtons[i].addActionListener(this);
//            numberButtons[i].setFont(myFont);
//            numberButtons[i].setFocusable(false);
//        }
//
//        negButton.setBounds(50, 430, 100, 50);
//        delButton.setBounds(150, 430, 100, 50);
//        clrButton.setBounds(250, 430, 100, 50);
//        panel = new JPanel();
//        panel.setBounds(50, 100, 300, 300);
//        panel.setLayout(new GridLayout(5, 5, 10, 10));
////        panel.setBackground(Color.GRAY);
//
//        panel.add(numberButtons[1]);
//        panel.add(numberButtons[2]);
//        panel.add(numberButtons[3]);
//        panel.add(addButton);
//        panel.add(numberButtons[4]);
//        panel.add(numberButtons[5]);
//        panel.add(numberButtons[6]);
//        panel.add(subButton);
//        panel.add(numberButtons[7]);
//        panel.add(numberButtons[8]);
//        panel.add(numberButtons[9]);
//        panel.add(mulButton);
//        panel.add(decButton);
//        panel.add(numberButtons[0]);
//        panel.add(equButton);
//        panel.add(divButton);
//        panel.add(percentageButton);
//        panel.add(divOnOneButton);
//        frame.add(panel);
//        frame.add(negButton);
//        frame.add(delButton);
//        frame.add(clrButton);
//        frame.add(textfield);
//        frame.setVisible(true);
//
//    }
//
//    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        for (int i = 0; i < 10; i++) {
//            if (e.getSource() == numberButtons[i]) {
//                textfield.setText(textfield.getText().concat(String.valueOf(i)));
//            }
//        }
//            if (e.getSource() == decButton) {
//                textfield.setText(textfield.getText().concat("."));
//            }
//            if (e.getSource() == addButton) {
//                num1 = Double.parseDouble(textfield.getText());
//                operator = '+';
//                textfield.setText("");
//            }
//            if (e.getSource() == subButton) {
//                num1 = Double.parseDouble(textfield.getText());
//                operator = '-';
//                textfield.setText("");
//            }
//            if (e.getSource() == mulButton) {
//                num1 = Double.parseDouble(textfield.getText());
//                operator = '*';
//                textfield.setText("");
//            }
//            if (e.getSource() == divButton) {
//                num1 = Double.parseDouble(textfield.getText());
//                operator = '/';
//                textfield.setText("");
//            }
//            if (e.getSource() == equButton) {
//                num2 = Double.parseDouble(textfield.getText());
//                switch (operator) {
//                    case '+':
//                        result = num1 + num2;
//                        break;
//                    case '-':
//                        result = num1 - num2;
//                        break;
//                    case '*':
//                        result = num1 * num2;
//                        break;
//                    case '/':
//                        result = num1/num2;
//                        break;
//                }
//                textfield.setText(String.valueOf(result));
//                num1 = result;
//            }
//            if(e.getSource()==clrButton) {
//                textfield.setText("");
//            }
//        if(e.getSource()==delButton) {
//            String string = textfield.getText();
//                textfield.setText("");
//                for(int i=0; i<string.length()-1; i++){
//                    textfield.setText(textfield.getText()+string.charAt(i));
//                }
//            }
//        if(e.getSource() ==negButton) {
//            double temp = Double.parseDouble(textfield.getText());
//            temp *= -1;
//            textfield.setText(String.valueOf(temp));
//        }
//        if(e.getSource() ==percentageButton) {
//            double perc = Double.parseDouble(textfield.getText());
//            perc = perc/100;
//            textfield.setText(String.valueOf(perc));
//        }
//        if(e.getSource() ==divOnOneButton) {
//            double one = Double.parseDouble(textfield.getText());
//            one = 1/one;
//            textfield.setText(String.valueOf(one));
//        }
//
//        }
//    }
//

package com.codewithmosh;

import javax.swing.*;
import java.util.Scanner;

public class panel {
    public static void main(String[] args) {
//            String name = JOptionPane.showInputDialog ("Enter your name");
//            JOptionPane.showMessageDialog(null, "Hello "+name);
//            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//            JOptionPane.showMessageDialog(null, "You are "+age+" years old");
//            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//            JOptionPane. showMessageDialog(null, "You are "+age+" years old");
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use:");
        symbol=scanner.next();
        for(int i=1; i<=rows; i++){
            System.out.println();
            for (int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
    };
};
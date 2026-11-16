package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sample {
    static void main() {
        JFrame frame = new AnotherComponents();
        frame.setVisible(true);
//        LoginFrame loginFrame = new LoginFrame();
//        loginFrame.setVisible(true);
//        JFrame frame = new JFrame("My First Frame");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //set layout frame
////        BorderLayout blayout = new BorderLayout();
//        frame.setLayout(new BorderLayout());
//        //border layout - N, E, W, S, Center
//        //top (header) / north
//        //Panels -> group components
//        JPanel header = new JPanel();
//        header.add(new JLabel("Student Information System"));
//        frame.add(header, BorderLayout.NORTH);
//
//        JPanel footer = new JPanel();
//        JButton loginBtn = new JButton("Log in");
//        JButton resetBtn = new JButton("Reset");
//        footer.add(loginBtn);
//        footer.add(resetBtn);
//        frame.add(footer, BorderLayout.SOUTH);
//
//        JPanel form = new JPanel(new GridLayout(3, 2, 10, 10));
//        form.add(new JLabel("User name:"));
//        JTextField username = new JTextField(15);
//        form.add(username);
//        form.add(new JLabel("ID Number:"));
//        form.add(new JTextField(10));
//        form.add(new JLabel("Password"));
//        form.add(new JTextField(15));
//        frame.add(form, BorderLayout.CENTER);

        //event
//        loginBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(loginBtn, username.getText());
//            }
//        });
        //lambda -> anonymous method/function
//        loginBtn.addActionListener(e -> {
//            JOptionPane.showMessageDialog(loginBtn, username.getText());
//        });
//
//        frame.pack();//resize  based on components
//        frame.setVisible(true);

//        //JOptionPane
////        JOptionPane.showMessageDialog(null, "Hello");
////        JOptionPane.showMessageDialog(null, "Hi", "Hello", JOptionPane.QUESTION_MESSAGE);
//        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
//        int factorial = 1;
//        for(int i = 2 ; i <= number ; i++){
//            factorial *= i;
//        }
//        JOptionPane.showMessageDialog(null, "Answer: " + factorial);
    }
}

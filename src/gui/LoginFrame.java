package gui;

import javax.swing.*;
import java.awt.*;

public class LoginFrame{
    private JPanel main;
    private JPanel header;
    private JPanel footer;
    private JButton btnLogin;
    private JButton btnReset;
    private JPanel form;
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField1;

    static void main() {
        JFrame frame = new JFrame("SIS :: Login");
        frame.setContentPane(new LoginFrame().main);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
